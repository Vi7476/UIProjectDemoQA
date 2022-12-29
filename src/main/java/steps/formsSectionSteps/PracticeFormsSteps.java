package steps.formsSectionSteps;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.formsSection.PracticeFormsPage;
import steps.BaseSteps;
import utils.FakerControl;
import static com.codeborne.selenide.Selenide.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticeFormsSteps extends BaseSteps {
    PracticeFormsPage practiceFormsPage = new PracticeFormsPage();
    FakerControl fakerControl = new FakerControl();

    static String userFirstName;
    public String getUserFirstName(){return userFirstName;}
    static String userLastName;
    public String getUserLastName(){return userLastName;}



    public void fillForm(){
        userFirstName = fakerControl.userFirstName();
        userLastName = fakerControl.userLastName();
        String userEmail = fakerControl.email();
        String userNumber = fakerControl.userMobile();
        String userAddress = fakerControl.currentAddress();

        zoomOutWithRobotClass();
        practiceFormsPage.userFirstNameField().sendKeys(userFirstName);
        practiceFormsPage.userLastNameField().sendKeys(userLastName);
        practiceFormsPage.userEmailField().sendKeys(userEmail);
        getRandomGender().click();
        practiceFormsPage.userPhoneNumber().sendKeys(userNumber);
        System.out.println(userNumber);
        datePicker();
        //autocomplete
        getRandomCheckBox().click();
        uploadImage();
        practiceFormsPage.userCurrentAddress().sendKeys(userAddress);
        //autocomplete country and city dropdowns
        //closeAds();
        scrollTillElementIsVisible(practiceFormsPage.submitButton());
        practiceFormsPage.submitButton().click();

//        switchTo().frame(practiceFormsPage.modalWindow());
//        practiceFormsPage.modalCloseButton().click();




    }

    public WebElement getRandomGender() {
        List<WebElement> genders = practiceFormsPage.allRadioButtons().findElements(By.tagName("label"));
        List<WebElement> genderValues = new ArrayList<>();
        for (WebElement value : genders){
            genderValues.add(value);
        }
        Random random = new Random();
        return genderValues.get(random.nextInt(genderValues.size()));
    }

    public WebElement getRandomCheckBox(){
        List<WebElement> checkBoxes = practiceFormsPage.hobbiesCheckBoxes().findElements(By.tagName("label"));
        List<WebElement> checkBoxesValues = new ArrayList<>();
        for (WebElement value : checkBoxes){
            checkBoxesValues.add(value);
        }

        Random random = new Random();
        return checkBoxesValues.get(random.nextInt(checkBoxesValues.size()));

    }

    public void datePicker(){
        String monthAndYear = "September 2019";
        String date = "15";
        String finalDate = "15 Sep 2019";

        practiceFormsPage.dateOfBirthField().click();
        while (true){
            String actualMonthAndYear = practiceFormsPage.monthYearTextField().getText();
            if (actualMonthAndYear.equals(monthAndYear)){break;}
            else {practiceFormsPage.previousMonthButton().click();}
        }
        practiceFormsPage.dateSelector(date).click();
        Assert.assertEquals(practiceFormsPage.dateOfBirthField().getAttribute("value"), finalDate, "wrong date is selected");
    }
    public void uploadImage(){
        String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\test.png";
        String fileName = "test.png";
        File uploadFile = practiceFormsPage.pictureUploadButton().uploadFile(new File(filePath));
    }
    public void closeAds(){closeIframeAdvertisement(practiceFormsPage.advertisement());
    }

    @SneakyThrows
    public void zoomOutWithRobotClass(){
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

}
