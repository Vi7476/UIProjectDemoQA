package pages.widgetsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DatePickerPage {
    protected static final String DATE_XPATH="//input[@id='datePickerMonthYearInput']";
    protected static final String DATE_MONTH_SELECTOR_XPATH="//select[@class='react-datepicker__month-select']";
    protected static final String DATE_YEAR_SELECTOR_XPATH="//select[@class='react-datepicker__year-select']";
    protected static final String DATE_ACTUAL_MONTH_AND_YEAR_ID="datePickerMonthYearInput";
    protected static final String DATE_DAY_SELECTOR_XPATH="//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[2]/div/div";
            //div[@role='listbox']/div/div
        //div[@class='react-datepicker__month']
    protected static final String ALL_DAYS_BOX_XPATH="//div[@role='listbox']/div/div[@role='option']";

    public SelenideElement datePicker(){return $(By.xpath(DATE_XPATH));}
    public SelenideElement dateMonthPicker(){return $(By.xpath(DATE_MONTH_SELECTOR_XPATH));}
    public SelenideElement dateYearPicker(){return $(By.xpath(DATE_YEAR_SELECTOR_XPATH));}
    public SelenideElement dateActualMMYY(){return $(By.id(DATE_ACTUAL_MONTH_AND_YEAR_ID));}
    public SelenideElement dateDayPicker(String day){return $(By.xpath(DATE_DAY_SELECTOR_XPATH));}
    public SelenideElement allDaysBox(){return $(By.xpath(ALL_DAYS_BOX_XPATH));}
}
