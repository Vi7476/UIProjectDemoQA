package steps.afwSectionSteps;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import pages.afwSection.AlertsPage;
import steps.BaseSteps;
import utils.FakerControl;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class AlertsSteps extends BaseSteps {
    AlertsPage alertsPage = new AlertsPage();
    FakerControl fakerControl = new FakerControl();
    String myName;

    public void simpleAlertButton(){
        String expectedText = "You clicked a button";

        alertsPage.alertButton().click();
        Alert alert = switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        Assert.assertEquals(alertText, expectedText,"something went wrong here");
        alert.accept();
    }
    public void timerAlertButton(){
        String expectedText = "This alert appeared after 5 seconds";

        alertsPage.timerAlertButton().click();
        Alert alert = switchTo().alert(Duration.ofSeconds(5));
        String alertText = alert.getText();
        System.out.println(alertText);
        Assert.assertEquals(alertText, expectedText,"something went wrong here");
        alert.accept();
    }
    public void confirmAlertAccept(){
        String experctedAlertText="Do you confirm action?";
        String acceptedAlertResultText="You selected Ok";


        alertsPage.confirmAlertButton().click();
        Alert alert = switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        Assert.assertEquals(alertText, experctedAlertText, "something went wrong here");
        alert.accept();
        pageElementAccert(alertsPage.confirmAlertResult(),acceptedAlertResultText);
        System.out.println(alertsPage.confirmAlertResult().getText());
    }
    public void confirmAlertDismiss(){
        String dismissedAlertResultText="You selected Cancel";
        String experctedAlertText="Do you confirm action?";

        alertsPage.confirmAlertButton().click();
        Alert alert = switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        Assert.assertEquals(alertText, experctedAlertText, "something went wrong here");
        alert.dismiss();
        pageElementAccert(alertsPage.confirmAlertResult(),dismissedAlertResultText);
        System.out.println(alertsPage.confirmAlertResult().getText());
    }

    public void promptAlertAccept(){
        myName = fakerControl.userFirstName();
        String youEntered = "You entered";
        String expectedAlertText="Please enter your name";

        alertsPage.promptAlertButton().click();
        Alert alert = switchTo().alert();
        String alertText= alert.getText();
        System.out.println(alertText);
        Assert.assertEquals(alertText, expectedAlertText);
        alert.sendKeys(myName);
        alert.accept();
        //waitTillElementIsVisible(alertsPage.promptAlertResult());
        pageElementAccert(alertsPage.promptAlertResult(),youEntered+" "+myName);
    }
}
