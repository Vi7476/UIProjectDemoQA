
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WidgetsSliderTest extends BaseTest{

    @BeforeMethod
    public void openSliderPage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnWidgetsButton();
        mainPageSteps.clickOnElement(widgetsPage.sliderSection());
        mainPageSteps.widgetsSliderPageTitleAssertion();
    }

    @Test
    public void getSliderPosition(){
        sliderSteps.getActualSliderPosition();
    }
    @Test
    public void setSliderPosition(){
        sliderSteps.moveSlider();
        //sliderSteps.getActualSliderPosition();

    }
}
