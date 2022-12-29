import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WidgetsAutoCompleteTest extends BaseTest{
    @BeforeMethod
    public void openAutoCompletePage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnWidgetsButton();
        mainPageSteps.clickOnElement(widgetsPage.autoCompleteSection());
        mainPageSteps.widgetsAutoCompletePageTitleAssertion();
    }

    @Test
    public void handlingFirstAutoCompleteField(){
        autoCompleteSteps.autocompleteMultiOptions();
    }
}
