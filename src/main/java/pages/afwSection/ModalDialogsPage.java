package pages.afwSection;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ModalDialogsPage {

    protected static final String SMALL_MODAL_DIALOG_BUTTON_XPATH="//button[@id='showSmallModal']";
    protected static final String LARGE_MODAL_DIALOG_BUTTON_XPATH="//button[@id='showLargeModal']";

    protected static final String MODAL_DIALOG_XPATH="//div[@role='document']";
        //div[@role='dialog']

    protected static final String SMALL_MODAL_DIALOG_HEADER_TITLE_XPATH="//div[@id='example-modal-sizes-title-sm']";
    protected static final String SMALL_MODAL_DIALOG_CLOSE_BUTTON="//button[@id='closeSmallModal']";

    protected static final String MODAL_DIALOG_X_BUTTON_XPATH="//button[@class='close']";
    protected static final String MODAL_DIALOG_BODY_XPATH="//div[@class='modal-body']";

    protected static final String MODAL_DIALOG_BUTTONS_DIV_XPATH="//div[@id='modalWrapper']/div";
    protected static final String LARGE_MODAL_DIALOG_HEADER_TITLE_XPATH="//div[@id='example-modal-sizes-title-lg']";
    protected static final String LARGE_MODAL_DIALOG_CLOSE_BUTTON_XPATH="//button[@id='closeLargeModal']";
    protected static final String MODAL_HEADER_XPATH="//div[@class='modal-header']";


    public SelenideElement smallModalDialogButton(){return $(By.xpath(SMALL_MODAL_DIALOG_BUTTON_XPATH));}
    public SelenideElement largeModalDialogButton(){return $(By.xpath(LARGE_MODAL_DIALOG_BUTTON_XPATH));}

    public SelenideElement modalDialogXpath(){return $(MODAL_DIALOG_XPATH);}

    public SelenideElement smallModalDialogTitle(){return $(By.xpath(SMALL_MODAL_DIALOG_HEADER_TITLE_XPATH));}
    public SelenideElement smallModalDialogCloseButton(){return $(By.xpath(SMALL_MODAL_DIALOG_CLOSE_BUTTON));}

    public SelenideElement modalDialogXButton(){return $(By.xpath(MODAL_DIALOG_X_BUTTON_XPATH));}
    public SelenideElement modalDialogBody(){return $(By.xpath(MODAL_DIALOG_BODY_XPATH));}

    public SelenideElement largeModalDialogTitle(){return $(By.xpath(LARGE_MODAL_DIALOG_HEADER_TITLE_XPATH));}
    public SelenideElement largeModalDialogCloseButton(){return $(By.xpath(LARGE_MODAL_DIALOG_CLOSE_BUTTON_XPATH));}
    public SelenideElement modalDialogButtonsDIV(){return $(By.xpath(MODAL_DIALOG_BUTTONS_DIV_XPATH));}
    public SelenideElement modalHeader(){return $(MODAL_HEADER_XPATH);}





}
