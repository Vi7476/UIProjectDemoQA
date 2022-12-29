package pages.elementsSectionsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage {
    protected static final String ADD_NEW_RECORD_BUTTON_XPATH ="//button[@id='addNewRecordButton']";
    protected static final String SEARCH_BOX_XPATH="//input[@id='searchBox']";

    protected static final String FIRSTNAME_MODAL_REG_FORM_XPATH="//input[@id='firstName']";
    protected static final String LASTNAME_MODAL_REG_FORM_XPATH="//input[@id='lastName']";
    protected static final String USER_EMAIL_MODAL_REG_FORM_XPATH="//input[@id='userEmail']";
    protected static final String USER_AGE_MODAL_REG_FORM_XPATH="//input[@id='age']";
    protected static final String USER_SALARY_MODAL_REG_FORM_XPATH="//input[@id='salary']";
    protected static final String USER_DEPARTMENT_MODAL_REG_FORM_XPATH="//input[@id='department']";
    protected static final String SUBMIT_BUTTON_MODAL_REG_FORM_XPATH="//button[@id='submit']";



    public SelenideElement addNewRecordButton(){return $(By.xpath(ADD_NEW_RECORD_BUTTON_XPATH));}
    public SelenideElement searchBox(){return $(By.xpath(SEARCH_BOX_XPATH));}

    public SelenideElement firstNameMRF(){return $(By.xpath(FIRSTNAME_MODAL_REG_FORM_XPATH));}
    public SelenideElement lastNameMRF(){return $(By.xpath(LASTNAME_MODAL_REG_FORM_XPATH));}
    public SelenideElement userEmailMRF(){return $(By.xpath(USER_EMAIL_MODAL_REG_FORM_XPATH));}
    public SelenideElement userAgeMRF(){return $(By.xpath(USER_AGE_MODAL_REG_FORM_XPATH));}
    public SelenideElement userSalaryMRF(){return $(By.xpath(USER_SALARY_MODAL_REG_FORM_XPATH));}
    public SelenideElement userDepartmentMRF(){return $(By.xpath(USER_DEPARTMENT_MODAL_REG_FORM_XPATH));}
    public SelenideElement submitButtonMRF(){return $(By.xpath(SUBMIT_BUTTON_MODAL_REG_FORM_XPATH));}
}
