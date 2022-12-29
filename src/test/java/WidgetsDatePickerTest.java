import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WidgetsDatePickerTest extends BaseTest{
    @BeforeMethod
    public void openDatePickerPage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnWidgetsButton();
        mainPageSteps.clickOnElement(widgetsPage.datePickerSection());
        mainPageSteps.widgetsDataPickerPageTitleAssertion();
    }

    @Test
    public void pickDate(){
        datePickerSteps.pickDate();
    }
}
