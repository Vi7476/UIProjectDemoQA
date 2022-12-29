import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import jdk.jfr.Description;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class ElementsTextBoxTest extends BaseTest {
    @SneakyThrows
    @BeforeMethod
    public void openElementsPage(){
        baseSteps.openBaseUrl();
        baseSteps.setAdsHidden();
        mainPageSteps.clickOnElement(mainPage.elementsButton());
        mainPageSteps.clickOnElement(elementsPage.textBoxSection());
        mainPageSteps.elementsTEXTBOXPageTitleAssertion();
    }

    @Test
    @Description("filling text box form and click SUBMIT button. assert submitted form")
    public void TextBoxForFilling(){
        textBoxSteps.fillTExtBoxFormAndClickSubmit();
        textBoxSteps.submittedBoxFieldsAssertions();
    }
}
