package steps.afwSectionSteps;

import pages.afwSection.NestedFramesPage;
import steps.BaseSteps;
import static com.codeborne.selenide.Selenide.*;

public class NestedFramesSteps extends BaseSteps {
    NestedFramesPage nestedFramesPage = new NestedFramesPage();

    public void getMainFrameText(){
        switchTo().frame(nestedFramesPage.mainFrameID());
        String text = nestedFramesPage.mainFrameBody().getText();
        System.out.println(text);
    }
    public void nestedFrameHandling(){
        switchTo().frame(nestedFramesPage.mainFrameID());
        switchTo().frame(nestedFramesPage.nestedFrameXPath());
        String nestedFrameText = nestedFramesPage.nestedFrameBody().getText();
        System.out.println(nestedFrameText);
        switchTo().parentFrame();
        String mainFrameText = nestedFramesPage.mainFrameBody().getText();
        System.out.println(mainFrameText);
    }
}
