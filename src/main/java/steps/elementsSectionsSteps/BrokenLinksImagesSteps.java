package steps.elementsSectionsSteps;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import pages.elementsSectionsPages.BrokenLinksImagesPage;
import steps.BaseSteps;

public class BrokenLinksImagesSteps extends BaseSteps {
    BrokenLinksImagesPage brokenLinksImagesPage = new BrokenLinksImagesPage();

    public void checkValidImage(){
        Boolean isValidImageLoaded=
                (Boolean) ((JavascriptExecutor)WebDriverRunner.getWebDriver())
                        .executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0"
                                ,brokenLinksImagesPage.validImage());
        System.out.println("Image is loaded correct"+" "+ isValidImageLoaded);
    }
    public void checkBrokenImage(){
        Boolean isBrokenImageLoaded =
                (Boolean) ((JavascriptExecutor) WebDriverRunner.getWebDriver())
                .executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0"
                        , brokenLinksImagesPage.brokenImage());
        System.out.println("Image is loaded correct"+" "+ isBrokenImageLoaded);
    }

    public void checkValidLink(){
        String expectedURL="https://demoqa.com/";
        brokenLinksImagesPage.validLink().click();
        checkCurrentURL(expectedURL);}
    public void checkBrokenLink(){
        String expectedURL="https://demoqa.com/";
        brokenLinksImagesPage.brokenLink().click();
        checkCurrentURL(expectedURL);}
}
