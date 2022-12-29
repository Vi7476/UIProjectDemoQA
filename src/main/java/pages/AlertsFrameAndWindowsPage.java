package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AlertsFrameAndWindowsPage {
    protected static final String BROWSER_WINDOWS_SECTION_XPATH = "//span[text()='Browser Windows']";
    protected static final String ALERTS_SECTION_XPATH = "//span[text()='Alerts']";
    protected static final String FRAMES_SECTION_XPATH = "//span[text()='Frames']";
    protected static final String NESTED_FRAMES_SECTION_XPATH = "//span[text()='Nested Frames']";
    protected static final String MODAL_DIALOGS_SECTION_XPATH = "//span[text()='Modal Dialogs']";


    public SelenideElement browserWindowsSection() {
        return $(By.xpath(BROWSER_WINDOWS_SECTION_XPATH));
    }

    public SelenideElement alertsSection() {
        return $(By.xpath(ALERTS_SECTION_XPATH));
    }

    public SelenideElement framesSection() {
        return $(By.xpath(FRAMES_SECTION_XPATH));
    }

    public SelenideElement nestedFramesSection() {
        return $(By.xpath(NESTED_FRAMES_SECTION_XPATH));
    }

    public SelenideElement modalDialogsSection() {
        return $(By.xpath(MODAL_DIALOGS_SECTION_XPATH));
    }
}
