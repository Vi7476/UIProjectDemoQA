package pages.afwSection;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BrowserWindowsPage {
    protected static final String NEW_TAB_BUTTON_XPATH="//button[@id='tabButton']";
    protected static final String NEW_TAB_TITLE_XPATH="//h1[@id='sampleHeading']";
    protected static final String NEW_WINDOW_BUTTON_XPATH="//button[@id='windowButton']";
    protected static final String NEW_WINDOW_MESSAGE_BUTTON_XPATH="//button[@id='messageWindowButton']";
    protected static final String NEW_WINDOW_MESSAGE_BODY_XPATH="body";

    public SelenideElement newTabButton(){return $(By.xpath(NEW_TAB_BUTTON_XPATH));}
    public SelenideElement newTabTitle(){return $(By.xpath(NEW_TAB_TITLE_XPATH));}
    public SelenideElement newWindowButton(){return $(By.xpath(NEW_WINDOW_BUTTON_XPATH));}
    public SelenideElement newWindowMessageButton(){return $(By.xpath(NEW_WINDOW_MESSAGE_BUTTON_XPATH));}
    public SelenideElement newWindowMEssageBody(){return $(By.tagName(NEW_WINDOW_MESSAGE_BODY_XPATH));}
}
