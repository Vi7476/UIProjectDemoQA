import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AFWFramesTest extends BaseTest{
    @BeforeMethod
    public void openFramesPage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnAlertsAndFramesButton();
        mainPageSteps.clickOnElement(alertsFrameAndWindowsPage.framesSection());
        mainPageSteps.afwFramesPageTitleAssertion();
    }

    @Test
    public void getMainFrameText(){
        framseSteps.getMainFrameText();
    }
    @Test
    public void getSecondFrameText(){
        framseSteps.getSecondFrameText();
    }
}
