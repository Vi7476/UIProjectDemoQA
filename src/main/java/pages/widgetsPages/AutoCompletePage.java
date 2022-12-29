package pages.widgetsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AutoCompletePage {
    protected static final String AUTOCOMPLETE_MULTIPLE_OPTIONS_XPATH="//div[@id='autoCompleteMultipleContainer']//span[@class='auto-complete__indicator-separator css-1okebmr-indicatorSeparator']";
    //"//div[@id='autoCompleteMultipleContainer']";
    //"//input[@id='autoCompleteMultipleInput']";
    //"autoCompleteMultipleContainer";
    // "autoCompleteMultipleInput";



    public SelenideElement multiOptionAutocomplete(){return $(By.xpath(AUTOCOMPLETE_MULTIPLE_OPTIONS_XPATH));}
}
