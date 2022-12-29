package steps.elementsSectionsSteps;

import pages.MainPage;
import pages.elementsSectionsPages.TextBoxPage;
import steps.BaseSteps;
import utils.FakerControl;

public class TextBoxSteps extends BaseSteps {
    TextBoxPage textBoxPage = new TextBoxPage();
    FakerControl fakerControl = new FakerControl();


    String userName;
    String userEmail;
    String userCurrentAddress;
    String userPermanentAddress;

    public void fillTExtBoxFormAndClickSubmit() {
        userName = fakerControl.userName();
        userEmail = fakerControl.email();
        userCurrentAddress = fakerControl.currentAddress();
        userPermanentAddress = fakerControl.permanentAddress();

        textBoxPage.fullNameInputField().clear();
        textBoxPage.fullNameInputField().sendKeys(userName);
        textBoxPage.userEmailInputField().clear();
        textBoxPage.userEmailInputField().sendKeys(userEmail);
        textBoxPage.currentAddressTextareaField().clear();
        textBoxPage.currentAddressTextareaField().sendKeys(userCurrentAddress);
        textBoxPage.permanentAddressTextareaField().clear();
        textBoxPage.permanentAddressTextareaField().sendKeys(userPermanentAddress);
        textBoxPage.submitButton().click();

    }

    public void submittedBoxFieldsAssertions() {
        pageElementAccert(textBoxPage.submittedNameField(), "Name:" + userName);
        //System.out.println(textBoxPage.submittedNameField().getText() + "*********" + userName);
        pageElementAccert(textBoxPage.submittedEmailField(), "Email:" + userEmail);
        //System.out.println(textBoxPage.submittedEmailField().getText() + "*********" + userEmail);
        pageElementAccert(textBoxPage.submittedCurrentAddressField(), "Current Address :" + userCurrentAddress);
        //System.out.println(textBoxPage.submittedCurrentAddressField().getText() + "*********" + userCurrentAddress);
        pageElementAccert(textBoxPage.submittedPermanentAddressField(), "Permananet Address :" + userPermanentAddress);
        //System.out.println(textBoxPage.submittedPermanentAddressField().getText() + "*********" + userPermanentAddress);
    }


}
