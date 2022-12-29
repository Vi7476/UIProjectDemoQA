package pages.elementsSectionsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LinksPage {
    protected static final String SIMPLE_LINK_XPATH="//a[@id='simpleLink']";
    protected static final String DYNAMIC_LINK_XPATH="//a[@id='dynamicLink']";

    protected static final String CREATED_API_LINK_XPATH="//a[@id='created']";//201
    protected static final String NO_CONTENT_API_LINK_XPATH="//a[@id='no-content']";//204
    protected static final String MOVED_API_LINK_XPATH="//a[@id='moved']";//301
    protected static final String BAD_REQUEST_API_LINK_XPATH="//a[@id='bad-request']";//400
    protected static final String UNAUTHORIZED_API_LINK_XPATH="//a[@id='unauthorized']";//401
    protected static final String FORBIDDEN_API_LINK_XPATH="//a[@id='forbidden']";//403
    protected static final String NOT_FOUND_API_LINK_XPATH="//a[@id='invalid-url']";//404

    protected static final String RESPONSE_API_XPATH="//p[@id='linkResponse']";


    public SelenideElement simpleLink(){return $(By.xpath(SIMPLE_LINK_XPATH));}
    public SelenideElement dynamicLink(){return $(By.xpath(DYNAMIC_LINK_XPATH));}

    public SelenideElement createdLink(){return $(By.xpath(CREATED_API_LINK_XPATH));}
    public SelenideElement noContentLink(){return $(By.xpath(NO_CONTENT_API_LINK_XPATH));}
    public SelenideElement movedLink(){return $(By.xpath(MOVED_API_LINK_XPATH));}
    public SelenideElement badRequestLink(){return $(By.xpath(BAD_REQUEST_API_LINK_XPATH));}
    public SelenideElement unauthorizedLink(){return $(By.xpath(UNAUTHORIZED_API_LINK_XPATH));}
    public SelenideElement forbiddenLink(){return $(By.xpath(FORBIDDEN_API_LINK_XPATH));}
    public SelenideElement notFoundLink(){return $(By.xpath(NOT_FOUND_API_LINK_XPATH));}

    public SelenideElement response(){return $(By.xpath(RESPONSE_API_XPATH));}
}
