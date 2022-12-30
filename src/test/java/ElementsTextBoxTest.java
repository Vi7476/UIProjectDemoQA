
import jdk.jfr.Description;
import lombok.SneakyThrows;

import org.slf4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class ElementsTextBoxTest extends BaseTest {

    @BeforeMethod
    public void openElementsPage(){
        baseSteps.openBaseUrl();
        baseSteps.setAdsHidden();
        mainPageSteps.clickOnElement(mainPage.elementsButton());
        mainPageSteps.clickOnElement(elementsPage.textBoxSection());
        mainPageSteps.elementsTEXTBOXPageTitleAssertion();
    }

    @Test
    @Description("filling text box form and click SUBMIT button. assert submitted form")
    public void TextBoxForFilling(){
        textBoxSteps.fillTExtBoxFormAndClickSubmit();
        System.out.println(getWebDriver().getWindowHandle()+"====$$$$$$");
        textBoxSteps.submittedBoxFieldsAssertions();
    }
}
