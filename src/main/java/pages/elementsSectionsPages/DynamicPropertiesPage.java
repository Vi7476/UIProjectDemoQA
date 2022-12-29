package pages.elementsSectionsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DynamicPropertiesPage {
    protected static final String ENABLE_AFTER_BUTTON_XPATH="//button[@id='enableAfter']";
    protected static final String COLOR_CHANGE_BUTTON_XPATH="//button[@id='colorChange']";
    protected static final String VISIBLE_AFTER_BUTTON_XPATH="//button[@id='visibleAfter']";

    public SelenideElement enableAfterButton(){return $(By.xpath(ENABLE_AFTER_BUTTON_XPATH));}
    public SelenideElement colorChangeButton(){return $(By.xpath(COLOR_CHANGE_BUTTON_XPATH));}
    public SelenideElement visibleAfterButton(){return $(By.xpath(VISIBLE_AFTER_BUTTON_XPATH));}
}
