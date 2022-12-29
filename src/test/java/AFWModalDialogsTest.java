import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AFWModalDialogsTest extends BaseTest{
    @BeforeMethod
    public void  openModalDialogsPage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnAlertsAndFramesButton();
        mainPageSteps.clickOnElement(alertsFrameAndWindowsPage.modalDialogsSection());
        mainPageSteps.afwModalDialogsPageTitleAssertion();
    }

    @Test
    public void modalDialogsSmallButtonClicking(){
        modalDialogsSteps.clickSmallModalDialogButton();
    }
    @Test
    public void  modalDialogsLargeButtonClicking(){
        modalDialogsSteps.clickLargeModalDialogButton();
    }
    @Test
    public void randomButtonClicking(){
        modalDialogsSteps.clickingRandomDialogButton();
    }
}
