import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsLinksTest extends BaseTest {
    @BeforeMethod
    public void openLinksPage() {
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnElementsButton();
       // mainPageSteps.elementsPageTitleAccertion();
        mainPageSteps.clickOnElement(elementsPage.linksSection());
        mainPageSteps.elementsLinksPageTitleAssertion();
    }

    @Test
    public void simpleLinkClick() {
        linksSteps.simpleLinkClicking();
    }

    @Test
    public void dynamicLinkClick() {
        linksSteps.dynamicLinkClicking();
    }

    @Test
    public void createdLinkClick() {
        linksSteps.createdLinkClicking();
    }

    @Test
    public void noContentLinkClick() {
        linksSteps.noContentLinkClicking();
    }

    @Test
    public void movedLinkClick() {
        linksSteps.movedLinkClicking();
    }

    @Test
    public void badRequestLinkClick() {
        linksSteps.badRequestLinkClicking();
    }

    @Test
    public void unauthorizedLinkClick() {
        linksSteps.unauthorizedLinkClicking();
    }

    @Test
    public void forbiddenLinkClick() {
        linksSteps.forbiddenLinkClicking();
    }

    @Test
    public void notFoundLinkClick() {
        linksSteps.notFoundLinkClicking();
    }
}
