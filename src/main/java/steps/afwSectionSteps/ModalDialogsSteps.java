package steps.afwSectionSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.afwSection.ModalDialogsPage;
import steps.BaseSteps;


import java.util.ArrayList;
import java.util.*;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class ModalDialogsSteps extends BaseSteps {
    ModalDialogsPage modalDialogsPage = new ModalDialogsPage();

    public WebElement randomDialogButton() {
        List<WebElement> buttons = modalDialogsPage.modalDialogButtonsDIV().findElements(By.tagName("button"));
        List<WebElement> buttonsValue = new ArrayList<>();

        for (WebElement value : buttons) {
            buttonsValue.add(value);
        }
        Random random = new Random();
        return buttonsValue.get(random.nextInt(buttonsValue.size()));
    }

    public void clickSmallModalDialogButton() {
        String modalHeader = "Small Modal";
        modalDialogsPage.smallModalDialogButton().click();
        pageElementAccert(modalDialogsPage.smallModalDialogTitle(), modalHeader);
        String modalBody = modalDialogsPage.modalDialogBody().getText();
        System.out.println(modalBody);
        if (modalBody.contains("small")) {
            modalDialogsPage.smallModalDialogCloseButton().click();
        } else
            modalDialogsPage.modalDialogXButton().click();

    }

    public void clickLargeModalDialogButton() {
        String expectedHeader = "Large Modal";

        modalDialogsPage.largeModalDialogButton().click();
        String modalHeader = modalDialogsPage.largeModalDialogTitle().getText();
        if (modalHeader.equals(expectedHeader)) {
            System.out.println(modalDialogsPage.modalDialogBody().getText());
            modalDialogsPage.largeModalDialogCloseButton().click();
        } else
            modalDialogsPage.modalDialogXButton().click();
    }

    public void clickingRandomDialogButton() {
        randomDialogButton().click();
        String body = modalDialogsPage.modalDialogBody().getText();
        if (body.contains("small")) {
            System.out.println("this time it is " + " " + modalDialogsPage.smallModalDialogTitle().getText());
            modalDialogsPage.smallModalDialogCloseButton().click();
        } else if (body.contains("Lorem")) {
            System.out.println("it is now " + " " + modalDialogsPage.largeModalDialogTitle().getText());
            modalDialogsPage.largeModalDialogCloseButton().click();
        }
        else
            System.out.println("none was chosen");


    }


}
