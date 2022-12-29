import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AFWNestedFramesTest extends BaseTest{
    @BeforeMethod
    public void nestedFramesPageOpen(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnAlertsAndFramesButton();
        mainPageSteps.clickOnElement(alertsFrameAndWindowsPage.nestedFramesSection());
        mainPageSteps.afwNestedFramesPageTitleAssertion();
    }

    @Test
    public void mainFrameHandling(){nestedFramesSteps.getMainFrameText();}
    @Test
    public void nestedFrameHandling(){
        nestedFramesSteps.nestedFrameHandling();
    }
}
