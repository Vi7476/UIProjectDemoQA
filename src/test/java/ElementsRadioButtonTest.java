import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsRadioButtonTest extends BaseTest{

    @BeforeMethod
    public void openRadioButtonPage(){
        baseSteps.openBaseUrl();
        mainPageSteps.clickOnElementsButton();
        mainPageSteps.clickOnElement(elementsPage.radioButtonSection());
        mainPageSteps.elementsRadioButtonPageTitleAssertion();
    }

    @Test
    public void selectYesRB(){
        radioButtonSteps.selectYesRadioButton();
        radioButtonSteps.selectedYesRBAssertion();
    }
    @Test
    public void selectImpressiveRB(){
        radioButtonSteps.selectImpressiveRB();
        radioButtonSteps.selectedImpressiveRBAssertion();
    }

    @Test
    public void noRBShouldBeDisabled(){
        radioButtonSteps.checkingNoRB();
    }
}
