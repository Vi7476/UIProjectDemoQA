package steps.widgetsSteps;

import com.codeborne.selenide.SetValueOptions;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.widgetsPages.DatePickerPage;
import steps.BaseSteps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DatePickerSteps extends BaseSteps {
    Random random = new Random();
    DatePickerPage datePickerPage = new DatePickerPage();

    @SneakyThrows
    public void pickDate() {
        datePickerPage.datePicker().click();
        Thread.sleep(4000);
        datePickerPage.dateMonthPicker().click();
        randomMonth().click();
        datePickerPage.dateMonthPicker().click();
        Thread.sleep(4000);
        datePickerPage.dateYearPicker().click();
        randomYear().click();
        datePickerPage.dateYearPicker().click();
        Thread.sleep(4000);
        selectDay();
        Thread.sleep(4000);
        System.out.println(datePickerPage.dateActualMMYY().getAttribute("value"));
    }

    public WebElement randomMonth() {
        List<WebElement> months = datePickerPage.dateMonthPicker().findElements(By.tagName("option"));
        List<WebElement> monthsValues = new ArrayList<>();

        for (WebElement value : months) {
            monthsValues.add(value);
        }

        return monthsValues.get(random.nextInt(monthsValues.size()));
    }

    public WebElement randomYear() {
        List<WebElement> years = datePickerPage.dateYearPicker().findElements(By.tagName("option"));
        List<WebElement> yearsValues = new ArrayList<>();

        for (WebElement value : years) {
            yearsValues.add(value);
        }
        return yearsValues.get(random.nextInt(yearsValues.size()));
    }
    public void selectDay(){
        String day = "6";
        datePickerPage.dateDayPicker(day).click();
    }
}
