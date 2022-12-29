package pages.elementsSectionsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxPage {
    protected static final String CHECKBOX_HOME_XPATH = "//*[@id='tree-node-home']/following-sibling::span[@class='rct-checkbox']";
    protected static final String RESULT_CHECKBOX_XPATH = "//*[@id='result']";
    protected static final String ALL_CHECKBOXED_XPATH = "//*[@class='rct-checkbox']";



    public SelenideElement checkboxHome(){
        return $(By.xpath(CHECKBOX_HOME_XPATH));
    }

    public SelenideElement relustCheckBox(){
        return $(By.xpath(RESULT_CHECKBOX_XPATH));
    }
}
