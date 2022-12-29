package pages.afwSection;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FramesPage {
    protected static final String MAIN_FRAME_ID="frame1";
    protected static final String MAIN_FRAME_BODY_XPATH="//body/h1[@id='sampleHeading']";
    protected static final String SECOND_FRAME_ID="frame2";
    protected static final String SECOND_FRAME_BODY_XPATH="//body/h1[@id='sampleHeading']";
    protected static final String DEFAULT_CONTENT_SECTION_XPATH="//div[@id='framesWrapper']";

    public SelenideElement mainFrameID(){return $(By.id(MAIN_FRAME_ID));}
    public SelenideElement mainFrameBody(){return $(By.xpath(MAIN_FRAME_BODY_XPATH));}
    public SelenideElement secondFrameID(){return $(By.id(SECOND_FRAME_ID));}
    public SelenideElement secondFrameBody(){return $(By.xpath(SECOND_FRAME_BODY_XPATH));}
    public SelenideElement defaultContentSection(){return $(By.xpath(DEFAULT_CONTENT_SECTION_XPATH));}

}
