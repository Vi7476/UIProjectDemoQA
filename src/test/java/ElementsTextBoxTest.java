import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class ElementsTextBoxTest extends BaseTest {
    @BeforeMethod
    public void openElementsPage(){
        baseSteps.openBaseUrl();
        baseSteps.scrollTillElementIsVisible(mainPage.elementsButton());
        baseSteps.waitTillElementIsVisible(mainPage.elementsButton());
        //Selenide.switchTo().frame($(By.xpath("//iframe[@id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0']")))
        mainPageSteps.clickOnElement(mainPage.elementsButton());
        mainPageSteps.clickOnElement(elementsPage.textBoxSection());
        mainPageSteps.elementsTEXTBOXPageTitleAssertion();
    }

    @Test
    @Description("filling text box form and click SUBMIT button. assert submitted form")
    public void TextBoxForFilling(){
        textBoxSteps.fillTExtBoxFormAndClickSubmit();
        textBoxSteps.submittedBoxFieldsAssertions();
    }
}
