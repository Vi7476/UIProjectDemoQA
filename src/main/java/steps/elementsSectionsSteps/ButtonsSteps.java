package steps.elementsSectionsSteps;

import pages.elementsSectionsPages.ButtonsPage;
import steps.BaseSteps;

public class ButtonsSteps extends BaseSteps {
    ButtonsPage buttonsPage = new ButtonsPage();
    String doubleClickExpectedMessage ="You have done a double click";
    String rightClickExpectedMessage = "You have done a right click";
    String clickExpectedMessage = "You have done a dynamic click";

    public void doubleClickButtonHandling(){
        buttonsPage.doubleClickButton().doubleClick();
        pageElementAccert(buttonsPage.doubleClickSuccessMessage(), doubleClickExpectedMessage);
        System.out.println(buttonsPage.doubleClickSuccessMessage()+"========"+ doubleClickExpectedMessage);
    }
    public void rightClickButtonHandling(){
        buttonsPage.rightClickButton().contextClick();
        pageElementAccert(buttonsPage.rightClickSuccessMessage(), rightClickExpectedMessage);
        System.out.println(buttonsPage.rightClickSuccessMessage()+"========"+ rightClickExpectedMessage);
    }
    public void clickButtonHandling(){
        buttonsPage.clickButton().click();
        pageElementAccert(buttonsPage.clickSuccessMessage(), clickExpectedMessage);
        System.out.println(buttonsPage.clickSuccessMessage()+"========"+ clickExpectedMessage);
    }
}
