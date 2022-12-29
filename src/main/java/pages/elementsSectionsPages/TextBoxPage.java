package pages.elementsSectionsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    protected static final String FULL_NAME_INPUT_FIELD_XPATH = "//input[@id='userName']";
    protected static final String USER_EMAIL_INPUT_FIELD_XPATH = "//input[@id='userEmail']";
    protected static final String CURRENT_ADDRESS_TEXTAREA_FIELD_XPATH = "//textarea[@id='currentAddress']";
    protected static final String PERMANENT_ADDRESS_TEXTAREA_FIELD_XPATH = "//textarea[@id='permanentAddress']";
    public static final String SUBMIT_BUTTON_XPATH = "//button[@id='submit']";
    public static final String SUBMITTED_NAME_FIELD_XPATH = "//p[@id='name']";
    public static final String SUBMITTED_EMAIL_FIELD_XPATH = "//p[@id='email']";
    public static final String SUBMITTED_CURRENTADDRESS_FIELD_XPATH = "//p[@id='currentAddress']";
    public static final String SUBMITTED_PERMANENTADDRESS_FIELD_XPATH = "//p[@id='permanentAddress']";


    public SelenideElement fullNameInputField() {
        return $(By.xpath(FULL_NAME_INPUT_FIELD_XPATH));
    }

    public SelenideElement userEmailInputField() {
        return $(By.xpath(USER_EMAIL_INPUT_FIELD_XPATH));
    }

    public SelenideElement currentAddressTextareaField() {
        return $(By.xpath(CURRENT_ADDRESS_TEXTAREA_FIELD_XPATH));
    }

    public SelenideElement permanentAddressTextareaField() {
        return $(By.xpath(PERMANENT_ADDRESS_TEXTAREA_FIELD_XPATH));
    }

    public SelenideElement submitButton() {
        return $(By.xpath(SUBMIT_BUTTON_XPATH));
    }

    public SelenideElement submittedNameField() {
        return $(By.xpath(SUBMITTED_NAME_FIELD_XPATH));
    }

    public SelenideElement submittedEmailField() {
        return $(By.xpath(SUBMITTED_EMAIL_FIELD_XPATH));
    }

    public SelenideElement submittedCurrentAddressField() {
        return $(By.xpath(SUBMITTED_CURRENTADDRESS_FIELD_XPATH));
    }

    public SelenideElement submittedPermanentAddressField() {
        return $(By.xpath(SUBMITTED_PERMANENTADDRESS_FIELD_XPATH));
    }

}
