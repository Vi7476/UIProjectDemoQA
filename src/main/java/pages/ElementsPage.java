package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage {
    protected static final String TEXT_BOX_SECTION_XPATH = "//span[text()='Text Box']";//"//*[@id='item-0']/span[contains(text(),'Text Box')]";
    protected static final String CHECK_BOX_SECTION_XPATH = "//span[text()='Check Box']";
    protected static final String RADIO_BUTTON_SECTION_XPATH = "//span[text()='Radio Button']";
    protected static final String WEB_TABLES_SECTION_XPATH = "//span[text()='Web Tables']";
    protected static final String BUTTONS_SECTION_XPATH = "//span[text()='Buttons']";
    protected static final String LINKS_SECTION_XPATH = "//span[text()='Links']";
    protected static final String BROKEN_LINKS_IMAGES_SECTION_XPATH = "//span[text()='Broken Links - Images']";
    protected static final String UPLOAD_AND_DOWNLOAD_SECTION_XPATH = "//span[text()='Upload and Download']";
    protected static final String DYNAMIC_PROPERTIES_SECTION_XPATH  = "//span[text()='Dynamic Properties']";

    public SelenideElement textBoxSection() {
        return $(By.xpath(TEXT_BOX_SECTION_XPATH));
    }
    public SelenideElement checkBoxSection() {
        return $(By.xpath(CHECK_BOX_SECTION_XPATH));
    }
    public SelenideElement radioButtonSection() {
        return $(By.xpath(RADIO_BUTTON_SECTION_XPATH));
    }
    public SelenideElement webTablesSection() {
        return $(By.xpath(WEB_TABLES_SECTION_XPATH));
    }
    public SelenideElement buttonsSection() {
        return $(By.xpath(BUTTONS_SECTION_XPATH));
    }
    public SelenideElement linksSection(){
        return $(By.xpath(LINKS_SECTION_XPATH));
    }
    public SelenideElement brokenLinksImagesSection(){
        return $(By.xpath(BROKEN_LINKS_IMAGES_SECTION_XPATH));
    }
    public SelenideElement uploadAndDownloadSection(){
        return $(By.xpath(UPLOAD_AND_DOWNLOAD_SECTION_XPATH));
    }
    public SelenideElement dynamicPropertiesSection(){
        return $(By.xpath(DYNAMIC_PROPERTIES_SECTION_XPATH));
    }

}
