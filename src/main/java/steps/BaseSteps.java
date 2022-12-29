package steps;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import utils.Config;



import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class BaseSteps {

    public void openBaseUrl() {
        Selenide.open(Config.getBaseURL());
        //WebDriverRunner.getWebDriver().manage().window().maximize();
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1920,1080));
    }

    public void clickOnElement(SelenideElement element) {
        $(element).click();
    }

    public void pageElementAccert(SelenideElement element, String expectedText) {
        Assert.assertEquals(element.getText(), expectedText, "Actual text does not match expected one");
    }

    public void waitTillElementIsVisible(SelenideElement element) {
        $(element).shouldBe(Condition.visible, Duration.ofSeconds(6));
    }

    public void waitTillElementDisappears(SelenideElement element) {
        $(element).shouldNotBe(Condition.visible);
    }

    public void waitTillElementIsEnabled(SelenideElement element) {
        $(element).should(Condition.enabled, Duration.ofSeconds(6));
    }

    public void scrollTillElementIsVisible(SelenideElement element) {
        $(element).scrollIntoView(true);
    }


    public void pageElementAccertContains(SelenideElement element, String expectedText) {
        Assert.assertTrue(element.getText().contains(expectedText), "result does not contain expected Text");
    }

    public void checkCurrentURL(String expectedURL) {
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), expectedURL);
    }

    public void closeIframeAdvertisement(String frameId) {
        switchTo().frame(frameId, Duration.ofSeconds(10)).close();
        switchTo().defaultContent();
    }
    public void setAdsHidden(){
       // SelenideElement ads = $(By.xpath("//iframe[@title='3rd party ad content']"));

        //JavascriptExecutor js = (JavascriptExecutor) Selenide.webdriver();
        //SelenideElement ads = $(By.xpath("//div[@id ='fixedban']"));
        //js.executeScript("return document.getElementById('fixedban').remove();");
        Selenide.executeJavaScript("return document.getElementById('fixedban').remove();");
    }
}
