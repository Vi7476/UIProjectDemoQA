import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsBrokenLinksImagesTest extends BaseTest {
    @BeforeMethod
    public void openBrokenLinksImagesPage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnElementsButton();
        mainPageSteps.clickOnElement(elementsPage.brokenLinksImagesSection());
        mainPageSteps.elementsBrokenLinksImagesPageTitleAssertion();
    }

    @Test
    public void checkValidImage(){
        brokenLinksImagesSteps.checkValidImage();
    }
    @Test
    public void checkBrokenImage(){
        brokenLinksImagesSteps.checkBrokenImage();
    }
    @Test
    public void checkValidLink(){
        brokenLinksImagesSteps.checkValidLink();
    }
    @Test
    public void checkBrokenLink(){
        brokenLinksImagesSteps.checkBrokenLink();
    }
}
