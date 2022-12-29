package steps.elementsSectionsSteps;

import com.codeborne.selenide.Condition;
import org.testng.Assert;
import pages.elementsSectionsPages.RadioButtonPage;
import steps.BaseSteps;

public class RadioButtonSteps extends BaseSteps {
    RadioButtonPage radioButtonPage = new RadioButtonPage();
    String yesSelectedResult;
    String impressiveSelectedResult;


    public void selectYesRadioButton(){
        radioButtonPage.yesRB().click();
        yesSelectedResult = "You have selected Yes";
    }

    public void selectedYesRBAssertion(){
        pageElementAccert(radioButtonPage.resultBox(), yesSelectedResult);
    }

    public void selectImpressiveRB(){
        radioButtonPage.impressiveRB().click();
        impressiveSelectedResult = "You have selected Impressive";
    }
    public void selectedImpressiveRBAssertion(){pageElementAccert(radioButtonPage.resultBox(),impressiveSelectedResult);}

    public void checkingNoRB(){
        radioButtonPage.noRB().click();
        Assert.assertFalse(radioButtonPage.resultBox().isDisplayed());

    }
}
