import jdk.jfr.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsCheckBoxTest extends BaseTest{
    @BeforeMethod
    public void openCheckBoxPage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnElementsButton();
        //mainPageSteps.elementsPageTitleAccertion();
        baseSteps.clickOnElement(elementsPage.checkBoxSection());
        mainPageSteps.elementsCHECKBOXPageTitleAssertion();
    }

    @Test
    @Description("selecting Home checkbox and validating that is is selected ")
    public void selectHomeCheckBox(){
        checkBoxSteps.selectHomeCheckBox();
    }
}
