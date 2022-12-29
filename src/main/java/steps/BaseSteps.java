package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import utils.Config;
import utils.FakerControl;
import utils.FilterControl;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class BaseSteps {

    public void openBaseUrl()  {
        Selenide.open(Config.getBaseURL());
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    public void clickOnElement(SelenideElement element){
        $(element).click();
    }

    public void pageElementAccert(SelenideElement element, String expectedText){
        Assert.assertEquals(element.getText(),expectedText, "Actual text does not match expected one");
    }

    public void waitTillElementIsVisible(SelenideElement element){$(element).shouldBe(Condition.visible, Duration.ofSeconds(6));
    }
    public void waitTillElementDisappears(SelenideElement element){$(element).shouldNotBe(Condition.visible);}
    public void waitTillElementIsEnabled(SelenideElement element){$(element).should(Condition.enabled, Duration.ofSeconds(6));}
    public void scrollTillElementIsVisible(SelenideElement element){$(element).scrollIntoView(true);}


    public void pageElementAccertContains(SelenideElement element, String expectedText){
        Assert.assertTrue(element.getText().contains(expectedText), "result does not contain expected Text");
    }
    public void checkCurrentURL(String expectedURL){
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), expectedURL);
    }
//    public void closeIframeAdvertisement(String frameId){
//        switchTo().frame(frameId, Duration.ofSeconds(10)).close();
//        switchTo().defaultContent();
//    }

}
