import jdk.jfr.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTextBoxTest extends BaseTest {
    @BeforeMethod
    public void openElementsPage(){
        baseSteps.openBaseUrl();
        mainPageSteps.scrollTillElementIsVisible(mainPage.elementsButton());
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
