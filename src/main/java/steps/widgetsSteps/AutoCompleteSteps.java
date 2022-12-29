package steps.widgetsSteps;

import org.openqa.selenium.Keys;
import pages.widgetsPages.AutoCompletePage;
import steps.BaseSteps;
import utils.FakerControl;
import static com.codeborne.selenide.Selenide.*;

public class AutoCompleteSteps extends BaseSteps {
    AutoCompletePage autoCompletePage;
    FakerControl fakerControl;

    public void autocompleteMultiOptions(){
//        String sign = fakerControl.sign();


        autoCompletePage.multiOptionAutocomplete().clear();
        autoCompletePage.multiOptionAutocomplete()
                .sendKeys("a");
        actions().sendKeys(autoCompletePage.multiOptionAutocomplete(), Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

    }
}
