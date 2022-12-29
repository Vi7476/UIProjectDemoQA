import lombok.SneakyThrows;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormsPracticeFormsTest extends BaseTest {
    @BeforeMethod
    public void openFormsPage() {
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnFormsButton();
        mainPageSteps.clickOnElement(formsPage.practiceFormSection());
        mainPageSteps.formsFormsPracticePageTitleAssertion();
    }

    @SneakyThrows
    @Test
    public void fillForm() {

        practiceFormsSteps.fillForm();


        Thread.sleep(4000);

    }
}
