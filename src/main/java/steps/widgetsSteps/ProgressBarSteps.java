package steps.widgetsSteps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideWait;
import com.codeborne.selenide.WebDriverRunner;
import lombok.SneakyThrows;
import pages.widgetsPages.ProgressBarPage;
import steps.BaseSteps;
import utils.FakerControl;

import java.time.Duration;
import java.util.Objects;


public class ProgressBarSteps extends BaseSteps {

    FakerControl fakerControl = new FakerControl();
    ProgressBarPage progressBarPage = new ProgressBarPage();
    public void scrollUp(){
        scrollTillElementIsVisible(progressBarPage.progressBarContainer());
    }

    public String getProgressValue(){
        return progressBarPage.progressBar().getAttribute("aria-valuenow");
    }

    public void clickSSButton(){
        progressBarPage.start_stopButton().click();
    }

    public void clickOnDemand(){
        int randomPercent = fakerControl.randomO_hundredValue();

        String randomProg = Integer.toString(randomPercent);
        //int progress = getProgressValue();
        clickSSButton();
        progressBarPage.progressBar().should(Condition.attribute("aria-valuenow", randomProg),Duration.ofSeconds(30));
        clickSSButton();
//        progressBarPage.progressBar().shouldHave(Condition.attribute("aria-valuenow", randomProg), Duration.ofSeconds(20));
//        clickSSButton();
        System.out.println("actual Progress " +getProgressValue());

        System.out.println("random value "+randomProg);
    }
}
