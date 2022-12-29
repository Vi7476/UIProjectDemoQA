import lombok.SneakyThrows;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WidgetsProgressBarTest extends BaseTest{
    @BeforeMethod
    public void openProgressBarPage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnWidgetsButton();
        mainPageSteps.scrollTillElementIsVisible(widgetsPage.progressBarSection());
        mainPageSteps.clickOnElement(widgetsPage.progressBarSection());
        mainPageSteps.widgetsProgressBarTitleAssertion();
    }

    @Test
    public void ProgressStartAndStop(){
        progressBarSteps.scrollUp();
        progressBarSteps.clickOnDemand();



    }
}
