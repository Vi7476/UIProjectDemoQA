package pages.formsSection;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PracticeFormsPage {
    protected static final String USER_FIRST_NAME_XPATH = "//input[@id='firstName']";
    protected static final String USER_LAST_NAME_XPATH = "//input[@id='lastName']";
    protected static final String USER_EMAIL_XPATH = "//input[@id='userEmail']";
    protected static final String USER_PHONE_NUMBER_XPATH = "//input[@id='userNumber']";
    protected static final String DATE_OF_BIRTH_XPATH = "//input[@id='dateOfBirthInput']";
    protected static final String SUBJECT_AUTOCOMPLETE_PLACEHOLDER_XPATH = "//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']";
    protected static final String PICTURE_UPLOAD_BUTTON_XPATH = "//input[@id='uploadPicture']";
    protected static final String USER_CURRENT_ADDRESS_XPATH = "//textarea[@id='currentAddress']";
    protected static final String SUBMIT_BUTTON_XPATH = "//button[@id='submit']";


   // protected static final String GENDER_RADIO_BUTTONS_BOX_BY_NAME = "gender";
    //div[@class='custom-control custom-radio custom-control-inline']";
    //"//div[@id='genterWrapper']/div[@class='col-md-9 col-sm-12']";
    //protected static final String GENDER_MALE_OPTION_XPATH = "//label[@for='gender-radio-1']";
   // protected static final String GENDER_BUTTONS_STRING_XPATH = "//*[@id='genterWrapper']/div[2]/div/label";
    //"//div[@class='custom-control custom-radio custom-control-inline']/label[@class='custom-control-label']";
    // input[@name='gender']
   // protected static final String GENDER_BUTTON_XPATH = "//*[@id='genterWrapper']/div[2]/div/label";
   protected static final String ALL_RADIO_BUTTONS_XPATH = "//div[@id='genterWrapper']";

   protected static final String MONTH_SELECTOR_XPATH="//select[@class='react-datepicker__month-select']";
   protected static final String MONTH_YEAR_TEXT_FIELD_XPATH = "//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']";
   protected static final String PREVIOUS_MONT_BUTTON_XPATH="//button[@aria-label='Previous Month']";

   protected static final String YEAR_SELECTOR_XPATH="//select[@class='react-datepicker__year-select']";
   protected static final String DATES_OF_SELECTED_MONTH_XPATH="//div[@class='react-datepicker__month']";


    protected static final String HOBBIES_CHECKBOXES_BOX_XPATH = "//div[@id='hobbiesWrapper']/div[@class='col-md-9 col-sm-12']";
    //div[@id='hobbiesWrapper']
    protected static final String STATE_DROPDOWN_XPATH = "//div[@id='state']";
    protected static final String CITY_DROPDOWN_XPATH = "//div[@id='city']";
    protected static final String MODAL_CONTENT_WINDOW_XPATH="//div[@role='dialog']";

    protected static final String MODAL_TITLE_XPATH = "//div[@id='example-modal-sizes-title-lg']";
    protected static final String MODAL_NAME_XPATH="//table/tbody/tr[1]";
    protected static final String MODAL_CLOSE_BUTTON_XPATH="//button[@id='closeLargeModal']";
    protected static final String ADVERTISEMENT_XPATH="//iframe[@aria-label='Advertisement']";





    public SelenideElement userFirstNameField() {
        return $(By.xpath(USER_FIRST_NAME_XPATH));
    }

    public SelenideElement userLastNameField() {
        return $(By.xpath(USER_LAST_NAME_XPATH));
    }

    public SelenideElement userEmailField() {
        return $(By.xpath(USER_EMAIL_XPATH));
    }

    public SelenideElement userPhoneNumber() {
        return $(By.xpath(USER_PHONE_NUMBER_XPATH));
    }

    public SelenideElement dateOfBirthField() {
        return $(By.xpath(DATE_OF_BIRTH_XPATH));
    }


    public SelenideElement subjectAutocompleteField() {
        return $(By.xpath(SUBJECT_AUTOCOMPLETE_PLACEHOLDER_XPATH));
    }

    public SelenideElement pictureUploadButton() {
        return $(By.xpath(PICTURE_UPLOAD_BUTTON_XPATH));
    }

    public SelenideElement userCurrentAddress() {
        return $(By.xpath(USER_CURRENT_ADDRESS_XPATH));
    }

    public SelenideElement submitButton() {
        return $(By.xpath(SUBMIT_BUTTON_XPATH));
    }



    public SelenideElement allRadioButtons() {
        return $(By.xpath(ALL_RADIO_BUTTONS_XPATH));
    }
    public SelenideElement monthSelector(){return $(By.xpath(MONTH_SELECTOR_XPATH));}
    public SelenideElement monthYearTextField(){return $(By.xpath(MONTH_YEAR_TEXT_FIELD_XPATH));}
    public SelenideElement previousMonthButton(){return $(By.xpath(PREVIOUS_MONT_BUTTON_XPATH));}
    public SelenideElement dateSelector(String day){return $(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[contains(text(),"+day+")]"));}

    public SelenideElement yearSelector(){return $(By.xpath(YEAR_SELECTOR_XPATH));}
    public SelenideElement datesOfSelectedMonth(){return $(By.xpath(DATES_OF_SELECTED_MONTH_XPATH));}


    public SelenideElement hobbiesCheckBoxes() {
        return $(By.xpath(HOBBIES_CHECKBOXES_BOX_XPATH));
    }

    public SelenideElement stateDropdown() {
        return $(By.xpath(STATE_DROPDOWN_XPATH));
    }

    public SelenideElement cityDropdown() {
        return $(CITY_DROPDOWN_XPATH);
    }
    public SelenideElement modalWindow(){return $(By.xpath(MODAL_CONTENT_WINDOW_XPATH));}
    public SelenideElement modalTitle(){return $(By.xpath(MODAL_TITLE_XPATH));}
    public SelenideElement modalName(){return $(By.xpath(MODAL_NAME_XPATH));}
    public SelenideElement modalCloseButton(){return $(By.xpath(MODAL_CLOSE_BUTTON_XPATH));}
    public SelenideElement advertisement(){return $(By.xpath(ADVERTISEMENT_XPATH));}


}
