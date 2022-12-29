import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WidgetsAccordionTest extends BaseTest{

    @BeforeMethod
    public void  openAccordionsPage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnWidgetsButton();
        mainPageSteps.clickOnElement(widgetsPage.accordianSection());
        mainPageSteps.widgetsAccordianPageTitleAssertion();
    }

    @Test
    public void firstAccordianSectionClicking(){
        accordianSteps.openFirstAccordion();
    }
    @Test
    public void secondAccordianSectionClicking(){
        accordianSteps.openSecondAccordion();
    }
    @Test
    public void randomAccordion(){
        accordianSteps.openRandomAccordion();
    }

}
