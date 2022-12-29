package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FormsPage {
    protected static final String PRACTICE_FORM_SECTION_XPATH = "//span[text()='Practice Form']";

    public SelenideElement practiceFormSection() {
        return $(By.xpath(PRACTICE_FORM_SECTION_XPATH));
    }
}
