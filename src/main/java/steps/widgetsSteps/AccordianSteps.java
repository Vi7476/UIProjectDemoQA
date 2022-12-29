package steps.widgetsSteps;

import com.codeborne.selenide.Condition;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.widgetsPages.AccordianPage;
import steps.BaseSteps;
import java.util.*;



public class AccordianSteps extends BaseSteps {
    AccordianPage accordianPage = new AccordianPage();

    public void openFirstAccordion() {
        String firstAccordionTitle = "What is Lorem Ipsum?";


        pageElementAccert(accordianPage.accordionSection1Title(), firstAccordionTitle);
        accordianPage.accordionSection1Title().click();
        waitTillElementIsVisible(accordianPage.accordionSection1Content());

    }
//        String thirdAccordionTitle="Why do we use it?";
//        pageElementAccert(accordianPage.accordionSection3Title(), thirdAccordionTitle);
//        accordianPage.accordionSection3Title().click();
//        pageElementIsDisplayedAssert(accordianPage.accordionSection3Content());

    public void openSecondAccordion(){
        String secondAccordionTitle="Where does it come from?";
        if(accordianPage.accordionSection1Content().is(Condition.visible)){
            accordianPage.accordionSection1Title().click();
        }
        waitTillElementDisappears(accordianPage.accordionSection1Content());
        pageElementAccert(accordianPage.accordionSection2Title(), secondAccordionTitle);
        accordianPage.accordionSection2Title().click();
        waitTillElementIsVisible(accordianPage.accordionSection2Content());
    }

    public WebElement randomAccordian(){
        List<WebElement> accordions = accordianPage.accordionsDiv().findElements(By.xpath("//div[@class='card'] //div[@class='card-header']"));
        List<WebElement> accordionsValue = new ArrayList<>();
        for (WebElement value : accordions){
            accordionsValue.add(value);
        }
        Random random = new Random();
        return accordionsValue.get(random.nextInt(accordionsValue.size()));
    }

    public void openRandomAccordion(){
        if(accordianPage.accordionSection1Content().is(Condition.visible)){
            accordianPage.accordionSection1Title().click();
        }
        waitTillElementDisappears(accordianPage.accordionSection1Content());

        randomAccordian().click();
        if(accordianPage.accordionSection1Content().is(Condition.visible)){
            System.out.println("Selected accordion's Title is: "+" "+accordianPage.accordionSection1Title().getText());
        } else if (accordianPage.accordionSection2Content().is(Condition.visible)) {
            System.out.println("Selected accordion's Title is: "+" "+accordianPage.accordionSection2Title().getText());
        } else if (accordianPage.accordionSection3Content().is(Condition.visible)) {
            System.out.println("Selected accordion's Title is: "+" "+accordianPage.accordionSection3Title().getText());
        }
        else
            System.out.println("non accordion is selected");
    }

}
