import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AFWAlertsTest extends BaseTest{
    @BeforeMethod
    public void afwAlertsPageOpen(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnAlertsAndFramesButton();
        mainPageSteps.clickOnElement(alertsFrameAndWindowsPage.alertsSection());
        mainPageSteps.afwAlertsPageTitleAssertion();
    }

    @Test
    public void simpleAlertHandling(){
        alertsSteps.simpleAlertButton();
    }
    @Test
    public void timerAlertHandling(){
        alertsSteps.timerAlertButton();
    }
    @Test
    public void acceptConfirmAlert(){
        alertsSteps.confirmAlertAccept();
    }
    @Test
    public void dismissConfirmAlert(){
        alertsSteps.confirmAlertDismiss();
    }
    @Test
    public void acceptPromptAlert(){
        alertsSteps.promptAlertAccept();
    }
}
