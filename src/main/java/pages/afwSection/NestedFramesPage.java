package pages.afwSection;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NestedFramesPage {
    protected static final String MAIN_FRAME_ID="frame1";
    protected static final String MAIN_FRAME_BODY_XPATH="//html/body";
    protected static final String NESTED_FRAME_XPATH="//iframe[@srcdoc='<p>Child Iframe</p>']";
    protected static final String NESTED_FRAME_BODY_XPATH="//html/body/p";

    public SelenideElement mainFrameID(){return $(By.id(MAIN_FRAME_ID));}
    public SelenideElement nestedFrameXPath(){return $(By.xpath(NESTED_FRAME_XPATH));}
    public SelenideElement mainFrameBody(){return $(By.xpath(MAIN_FRAME_BODY_XPATH));}
    public SelenideElement nestedFrameBody(){return $(By.xpath(NESTED_FRAME_BODY_XPATH));}
}
