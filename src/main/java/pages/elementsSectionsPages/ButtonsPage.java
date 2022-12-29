package pages.elementsSectionsPages;

import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ButtonsPage {
    protected static final String DOUBLE_CLICK_BUTTON_XPATH="//button[@id='doubleClickBtn']";
    protected static final String RIGHT_CLICK_BUTTON_XPATH="//button[@id='rightClickBtn']";
    protected static final String CLICK_BUTTON_XPATH="//button[text() = 'Click Me']";
    protected static final String DOUBLE_CLICK_SUCCESS_MESSAGE="//p[@id='doubleClickMessage']"; //You have done a double click
    protected static final String RIGHT_CLICK_SUCCESS_MESSAGE="//p[@id='rightClickMessage']"; //You have done a right click
    protected static final String CLICK_SUCCESS_MESSAGE="//p[@id='dynamicClickMessage']"; //You have done a dynamic click

    public SelenideElement doubleClickButton(){return $(By.xpath(DOUBLE_CLICK_BUTTON_XPATH));}
    public SelenideElement doubleClickSuccessMessage(){return $(By.xpath(DOUBLE_CLICK_SUCCESS_MESSAGE));}
    public SelenideElement rightClickButton(){return $(By.xpath(RIGHT_CLICK_BUTTON_XPATH));}
    public SelenideElement rightClickSuccessMessage(){return $(By.xpath(RIGHT_CLICK_SUCCESS_MESSAGE));}
    public SelenideElement clickButton(){return $(By.xpath(CLICK_BUTTON_XPATH));}
    public SelenideElement clickSuccessMessage(){return $(By.xpath(CLICK_SUCCESS_MESSAGE));}
}
