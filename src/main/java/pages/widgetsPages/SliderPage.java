package pages.widgetsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SliderPage {
    protected static final String SLIDER_BAR_XPATH="//input[@type='range']";
    protected static final String SLIDER_PROGRESS_VALUE_XPATH="//input[@id='sliderValue']";
    protected static final String SLIDER_ARROW_XPATH="//div[@class='range-slider__tooltip__arrow']";
    //protected static final String SLIDER_POSITION_XPATH="//span/input[@value='" +coordinates+"']";
    protected static final String RANGE_SLIDER_TOOLTIP_XPATH="//div[@class='range-slider__tooltip range-slider__tooltip--auto range-slider__tooltip--bottom']";

    public SelenideElement sliderBar(){return $(By.xpath(SLIDER_BAR_XPATH));}
    public SelenideElement sliderProgressValue(){return $(By.xpath(SLIDER_PROGRESS_VALUE_XPATH));}
    public SelenideElement sliderArrow(){return $(By.xpath(SLIDER_ARROW_XPATH));}
    public SelenideElement sliderPosition(int coordinates){return $(By.xpath("//span/input[@value='" +coordinates+"']"));}
    public SelenideElement sliderToolTip(){return $(By.xpath(RANGE_SLIDER_TOOLTIP_XPATH));}
}
