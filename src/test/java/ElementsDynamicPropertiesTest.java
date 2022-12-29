import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsDynamicPropertiesTest extends BaseTest{
    @BeforeMethod
    public void openDynamicPropertiesPage(){
        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnElementsButton();
        mainPageSteps.scrollTillElementIsVisible(elementsPage.dynamicPropertiesSection());
        mainPageSteps.elementsDynamicPropertiesPageTitleAssertion();
    }

    @Test
    public void waitTillButtonIsEnabled(){
        dynamicPropertiesSteps.clickWhenEnables();
    }
    @Test
    public void buttonTextColor(){
        dynamicPropertiesSteps.colorChangeButton();
    }

    @Test
    public void clickButtonWhenVisible(){
        dynamicPropertiesSteps.clickButtonWhenVisible();
    }

}
