package pages.widgetsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProgressBarPage {
    protected static final String PROGRESS_BAR_XPATH ="//div[@role='progressbar']";
    protected static final String START_STOP_BUTTON_XPATH="//button[@id='startStopButton']";
    protected static final String PROGRESS_BAR_CONTAINER_XPATH="//div[@id='progressBarContainer']";

    public SelenideElement progressBar(){return $(By.xpath(PROGRESS_BAR_XPATH));}
    public SelenideElement start_stopButton(){return $(By.xpath(START_STOP_BUTTON_XPATH));}
    public SelenideElement progressBarContainer(){return $(By.xpath(PROGRESS_BAR_CONTAINER_XPATH));}
}
