package steps.elementsSectionsSteps;

import pages.elementsSectionsPages.LinksPage;
import steps.BaseSteps;
import static com.codeborne.selenide.Selenide.*;

public class LinksSteps extends BaseSteps {
    LinksPage  linksPage = new LinksPage();
    String expectedURL = "https://demoqa.com/";

    public void simpleLinkClicking(){
        linksPage.simpleLink().click();
        switchTo().window(1);
        checkCurrentURL(expectedURL);
    }

    public void dynamicLinkClicking(){
        linksPage.dynamicLink().click();
        switchTo().window(1);
        checkCurrentURL(expectedURL);
    }
    public void createdLinkClicking(){
        String status = "201";
        linksPage.createdLink().click();
        pageElementAccertContains(linksPage.response(),status);
    }
    public void noContentLinkClicking(){
        String status = "204";
        linksPage.noContentLink().click();
        pageElementAccertContains(linksPage.response(),status);
    }
    public void movedLinkClicking(){
        String status ="301";
        linksPage.movedLink().click();
        pageElementAccertContains(linksPage.response(),status);
    }
    public void badRequestLinkClicking(){
        String status = "400";
        linksPage.badRequestLink().click();
        pageElementAccertContains(linksPage.response(),status);
    }
    public void unauthorizedLinkClicking(){
        String status = "401";
        linksPage.unauthorizedLink().click();
        pageElementAccertContains(linksPage.response(), status);
    }
    public void forbiddenLinkClicking(){
        String status="403";
        linksPage.forbiddenLink().click();
        pageElementAccertContains(linksPage.response(),status);
    }
    public void notFoundLinkClicking(){
        String status="404";
        linksPage.notFoundLink().click();
        pageElementAccertContains(linksPage.response(), status);
    }
}
