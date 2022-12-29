package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BookStoreApplicationPage {
    protected static final String LOGIN_SECTION_XPATH="//span[text()='Login']";
    protected static final String BOOK_STORE_SECTION_XPATH="//span[text()='Book Store']";
    protected static final String PROFILE_SECTION_XPATH="//span[text()='Profile']";
    protected static final String BOOK_STORE_API_SECTION_XPATH="//span[text()='Book Store API']";




    public SelenideElement loginSection(){
        return $(By.xpath(LOGIN_SECTION_XPATH));
    }
    public SelenideElement bookStoreSection(){
        return $(By.xpath(BOOK_STORE_SECTION_XPATH));
    }
    public SelenideElement profileSection(){
        return $(By.xpath(PROFILE_SECTION_XPATH));
    }
    public SelenideElement bookStoreAPISection(){
        return $(By.xpath(BOOK_STORE_API_SECTION_XPATH));
    }


}
