package steps.widgetsSteps;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.widgetsPages.SliderPage;
import steps.BaseSteps;
import utils.FakerControl;

import javax.swing.*;
import java.util.Objects;

public class SliderSteps extends BaseSteps {
    static int expectedCoords;
    SliderPage sliderPage = new SliderPage();
    FakerControl fakerControl = new FakerControl();


    public void getActualSliderPosition() {
        String value = sliderPage.sliderProgressValue().getAttribute("value");
        System.out.println(value);
    }

    public int actualCoordinates() {
        return Integer.parseInt(Objects.requireNonNull(sliderPage.sliderProgressValue().getAttribute("value")));}

    public void moveSlider() {
        expectedCoords = fakerControl.randomO_hundredValue();
        int less = expectedCoords - 1;
        int more = expectedCoords + 1;
        int coordinates = Integer.parseInt(Objects.requireNonNull(sliderPage.sliderProgressValue().getAttribute("value")));

        if (expectedCoords != coordinates) {
            if (coordinates < expectedCoords) {
                do {
                    sliderPage.sliderBar().sendKeys(Keys.ARROW_RIGHT);
                }
                while (actualCoordinates() <= expectedCoords);
                Assert.assertEquals(actualCoordinates(), more, "coordinates do not match");
            } else {
                do {
                    sliderPage.sliderBar().sendKeys(Keys.ARROW_LEFT);
                }
                while (actualCoordinates() >= expectedCoords);
                Assert.assertEquals(actualCoordinates(), less, "coordinates do not match");
            }
        } else {
            System.out.println("coordinates changed" + expectedCoords);
        }}

}
