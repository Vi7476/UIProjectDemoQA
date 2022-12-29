package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WidgetsPage {

    protected static final String ACCORDIAN_SECTION_XPATH ="//span[text()='Accordian']";
    protected static final String AUTO_COMPLETE_SECTION_XPATH ="//span[text()='Auto Complete']";
    protected static final String DATE_PICKER_SECTION_XPATH ="//span[text()='Date Picker']";
    protected static final String SLIDER_SECTION_XPATH ="//span[text()='Slider']";
    protected static final String PROGRESS_BAR_SECTION_XPATH="//span[text()='Progress Bar']";
    protected static final String TABS_SECTION_XPATH = "//span[text()='Tabs']";
    protected static final String TOOL_TIPS_SECTION_XPATH="//span[text()='Tool Tips']";
    protected static final String MENU_SECTION_XPATH="//span[text()='Menu']";
    protected static final String SELECT_MENU_SECTION_XPATH="//span[text()='Select Menu']";



    public SelenideElement accordianSection(){
        return $(By.xpath(ACCORDIAN_SECTION_XPATH));
    }
    public SelenideElement autoCompleteSection(){
        return $(By.xpath(AUTO_COMPLETE_SECTION_XPATH));
    }
    public SelenideElement datePickerSection(){
        return $(By.xpath(DATE_PICKER_SECTION_XPATH));
    }
    public SelenideElement sliderSection(){
        return $(By.xpath(SLIDER_SECTION_XPATH));
    }
    public SelenideElement progressBarSection(){
        return $(By.xpath(PROGRESS_BAR_SECTION_XPATH));
    }
    public SelenideElement tabsSection(){
        return $(By.xpath(TABS_SECTION_XPATH));
    }
    public SelenideElement toolTipsSection(){
        return $(By.xpath(TOOL_TIPS_SECTION_XPATH));
    }
    public SelenideElement menuSection(){
        return $(By.xpath(MENU_SECTION_XPATH));
    }
    public SelenideElement selectMenuSection(){
        return $(By.xpath(SELECT_MENU_SECTION_XPATH));
    }
}
