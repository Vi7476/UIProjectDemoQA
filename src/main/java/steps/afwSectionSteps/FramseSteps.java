package steps.afwSectionSteps;

import pages.afwSection.FramesPage;
import steps.BaseSteps;
import static com.codeborne.selenide.Selenide.*;

public class FramseSteps extends BaseSteps {
    FramesPage framesPage = new FramesPage();

    public void getMainFrameText(){
        switchTo().frame(framesPage.mainFrameID());
        String iframeTitle = framesPage.mainFrameBody().getText();
        System.out.println(iframeTitle);
        switchTo().defaultContent();
        String defaultContent = framesPage.defaultContentSection().getText();
        System.out.println(defaultContent);
    }

    public void getSecondFrameText(){
        switchTo().frame(framesPage.secondFrameID());
        String iframeTitle = framesPage.secondFrameBody().getText();
        System.out.println(iframeTitle);
        switchTo().defaultContent();
        String defaultContent = framesPage.defaultContentSection().getText();
        System.out.println(defaultContent);
    }

}
