package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    protected static final String ELEMENTS_BUTTON_XPATH ="//div[@class='card-body'] / h5[contains (text(), 'Elements')]";
    protected static final String FORMS_BUTTON_XPATH ="//h5[contains(text(),'Forms')]";
    protected static final String ALERTS_FRAME_AND_WINDOWS_XPATH = "//h5[contains(text(),'Alerts, Frame & Windows')]";
    protected static final String WIDGETS_XPATH = "//h5[contains(text(),'Widgets')]";
    protected static final String INTERACTIONS_XPATH = "h5[contains(text(),'Interactions')]";
    protected static final String BOOK_STORE_APPLICATION_XPATH = "h5[contains(text(),'Book Store Application')]";
    protected static final String PAGE_HEADER_XPATH="//div[@class='main-header']";
    public SelenideElement elementsButton(){return $(By.xpath(ELEMENTS_BUTTON_XPATH));}
    public SelenideElement formsButton(){return $(By.xpath(FORMS_BUTTON_XPATH));}
    public SelenideElement alertsFrameAndWindowsButton(){return $(By.xpath(ALERTS_FRAME_AND_WINDOWS_XPATH));}
    public SelenideElement widgetsButton(){return $(By.xpath(WIDGETS_XPATH));}
    public SelenideElement interactionsButton(){return $(By.xpath(INTERACTIONS_XPATH));}
    public SelenideElement bookStoreApplicationButton(){return $(By.xpath(BOOK_STORE_APPLICATION_XPATH));}
    public SelenideElement pageHeader(){return $(By.xpath(PAGE_HEADER_XPATH));}


}
