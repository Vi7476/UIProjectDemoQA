import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AFWBrowserWindowsTest extends BaseTest{
    @BeforeMethod
    public void openAFWBrowserWindowsPage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnAlertsAndFramesButton();
        mainPageSteps.clickOnElement(alertsFrameAndWindowsPage.browserWindowsSection());
        mainPageSteps.afwBrowserWindowsPageTitleAssertion();
    }

    @Test
    public void newTabHandling(){
        browserWindowsSteps.newTabButtonClick();
    }
    @Test
    public void newWindowHandling(){
        browserWindowsSteps.newWindowButtonClick();
    }
    @Test
    public void newWindowMessage(){
        //can't get text from body
        browserWindowsSteps.newWindowMessageButtonClick();
    }
}
