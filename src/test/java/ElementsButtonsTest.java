import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsButtonsTest extends BaseTest{
    @BeforeMethod
    public void openButtonsPage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnElementsButton();
       // mainPageSteps.elementsPageTitleAccertion();
        mainPageSteps.clickOnElement(elementsPage.buttonsSection());
        mainPageSteps.elementsButtonsPageTitleAssertion();
    }

    @Test
    public void buttonDoubleClicking(){
        buttonsSteps.doubleClickButtonHandling();
    }
    @Test
    public void buttonRightClicking(){
        buttonsSteps.rightClickButtonHandling();
    }
    @Test
    public void buttonClicking(){
        buttonsSteps.clickButtonHandling();
    }
}
