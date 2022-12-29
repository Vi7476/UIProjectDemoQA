package pages.elementsSectionsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BrokenLinksImagesPage {
    protected static final String VALID_IMAGE_XPATH="//div/img[@src='/images/Toolsqa.jpg']";
    protected static final String BROKEN_IMAGE_XPATH="//div/img[@src='/images/Toolsqa_1.jpg']";
    protected static final String VALID_LINK_BY_LINK_TEXT="Click Here for Valid Link";
    protected static final String BROKEN_LINK_BY_LINK_TEXT="Click Here for Broken Link";


    public SelenideElement validImage(){return $(By.xpath(VALID_IMAGE_XPATH));}
    public SelenideElement brokenImage(){return $(By.xpath(BROKEN_IMAGE_XPATH));}
    public SelenideElement validLink(){return $(By.linkText(VALID_LINK_BY_LINK_TEXT));}
    public SelenideElement brokenLink(){return $(By.linkText(BROKEN_LINK_BY_LINK_TEXT));}
}

