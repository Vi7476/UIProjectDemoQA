package pages.elementsSectionsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RadioButtonPage {


    private static final String YES_RADIOBUTTON_XPATH = "//label[@for='yesRadio']";

    protected static final String IMPRESSIVE_RADIOBUTTON_XPATH = "//label[@for='impressiveRadio']";
    protected static final String NO_RADIOBUTTON_XPATH = "//label[@for='noRadio']";
    protected  static final String NO_RB_DISABLED_ATTRIBUTE="//input[@id='noRadio']";

    protected static final String RESULT_BOX_XPATH = "//p[@class='mt-3']";



    public SelenideElement yesRB(){
        return $(By.xpath(YES_RADIOBUTTON_XPATH));
    }

    public SelenideElement impressiveRB() {
        return $(By.xpath(IMPRESSIVE_RADIOBUTTON_XPATH));
    }

    public SelenideElement noRB() {
        return $(By.xpath(NO_RADIOBUTTON_XPATH));
    }

    public SelenideElement resultBox() {
        return $(By.xpath(RESULT_BOX_XPATH));
    }
    public SelenideElement noRBDisabledAttribute(){return $(By.xpath(NO_RB_DISABLED_ATTRIBUTE));}
}
