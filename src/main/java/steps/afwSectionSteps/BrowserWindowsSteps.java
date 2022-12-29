package steps.afwSectionSteps;
import static com.codeborne.selenide.Selenide.*;
import pages.afwSection.BrowserWindowsPage;
import steps.BaseSteps;

public class BrowserWindowsSteps extends BaseSteps {
    BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage();

    public void newTabButtonClick(){
        String expectedTitle = "This is a sample page";

        browserWindowsPage.newTabButton().click();
        switchTo().window(1);
        pageElementAccert(browserWindowsPage.newTabTitle(), expectedTitle );
        System.out.println(browserWindowsPage.newTabTitle().getText());
        closeWindow();
        switchTo().window(0);
    }

    public void newWindowButtonClick(){
        String expectedTitle = "This is a sample page";
        browserWindowsPage.newWindowButton().click();
        switchTo().window(1);
        pageElementAccert(browserWindowsPage.newTabTitle(), expectedTitle );
        System.out.println(browserWindowsPage.newTabTitle().getText());
        closeWindow();
        switchTo().window(0);
    }
    public void newWindowMessageButtonClick(){
        browserWindowsPage.newWindowMessageButton().click();
        switchTo().window(1);
//        String bodyMessage = browserWindowsPage.newWindowMEssageBody().getText();
//        System.out.println(bodyMessage);
        closeWindow();
        switchTo().window(0);

    }
}
