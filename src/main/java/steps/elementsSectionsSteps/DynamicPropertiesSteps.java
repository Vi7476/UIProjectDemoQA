package steps.elementsSectionsSteps;

import lombok.SneakyThrows;
import org.openqa.selenium.support.Color;
import pages.elementsSectionsPages.DynamicPropertiesPage;
import steps.BaseSteps;


public class DynamicPropertiesSteps extends BaseSteps {
    DynamicPropertiesPage dynamicPropertiesPage = new DynamicPropertiesPage();

    public void clickWhenEnables() {
        waitTillElementIsVisible(dynamicPropertiesPage.enableAfterButton());
        waitTillElementIsEnabled(dynamicPropertiesPage.enableAfterButton());

        if (dynamicPropertiesPage.enableAfterButton().isEnabled())
            //dynamicPropertiesPage.enableAfterButton().click();
            System.out.println("BUTTON IS ENABLED");
        else
            System.out.println("button is still DISABLED");
    }

    @SneakyThrows
    public void colorChangeButton() {
        String buttonColor = dynamicPropertiesPage.colorChangeButton().getCssValue("color");
        String color = Color.fromString(buttonColor).asHex();
        System.out.println(color);

//        if (color.equals("#dc3545"))
//            System.out.println("Button color is changed to red");
//        else
//            wait(5000);

//        String changedColor = dynamicPropertiesPage.colorChangeButton().getCssValue("color");
//        String newColor = Color.fromString(changedColor).asHex();
//    System.out.println(newColor);

    }

    public void clickButtonWhenVisible(){
        waitTillElementIsVisible(dynamicPropertiesPage.visibleAfterButton());
        if (dynamicPropertiesPage.visibleAfterButton().isDisplayed())
            System.out.println("Button name is :"+" "+ dynamicPropertiesPage.visibleAfterButton().getText());
        else
            System.out.println("button is not visible");

    }
}
