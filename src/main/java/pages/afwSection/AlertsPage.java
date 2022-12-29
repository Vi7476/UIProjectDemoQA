package pages.afwSection;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AlertsPage {
    protected static final String ALERT_BUTTON_XPATH="//button[@id='alertButton']";
    protected static final String TIMER_ALERT_BUTTON_XPATH="//button[@id='timerAlertButton']";
    protected static final String CONFIRM_ALERT_BUTTON_XPATH="//button[@id='confirmButton']";
    protected static final String CONFIRM_RESULT_XPATH="//span[@id='confirmResult']";
    protected static final String PROMPT_ALERT_BUTTON_XPATH="//button[@id='promtButton']";
    protected static final String PROMPT_RESULT_XPATH="//span[@id='promptResult']";


    public SelenideElement alertButton(){return $(By.xpath(ALERT_BUTTON_XPATH));}
    public SelenideElement timerAlertButton(){return $(By.xpath(TIMER_ALERT_BUTTON_XPATH));}
    public SelenideElement confirmAlertButton(){return $(By.xpath(CONFIRM_ALERT_BUTTON_XPATH));}
    public SelenideElement confirmAlertResult(){return $(By.xpath(CONFIRM_RESULT_XPATH));}
    public SelenideElement promptAlertButton(){return $(By.xpath(PROMPT_ALERT_BUTTON_XPATH));}
    public SelenideElement promptAlertResult(){return $(By.xpath(PROMPT_RESULT_XPATH));}
}
