package steps.elementsSectionsSteps;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeMethod;
import pages.elementsSectionsPages.CheckBoxPage;
import steps.BaseSteps;

public class CheckBoxSteps extends BaseSteps {
   CheckBoxPage checkBoxPage = new CheckBoxPage();

   public void selectHomeCheckBox(){
       String expectedText = "You have selected :\n" + "home\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n"
               + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" + "classified\n"
               + "general\n" + "downloads\n" + "wordFile\n" + "excelFile";
       System.out.println(expectedText);

       checkBoxPage.checkboxHome().shouldNotBe(Condition.checked);
       checkBoxPage.checkboxHome().click();
       pageElementAccert(checkBoxPage.relustCheckBox(), expectedText);
       System.out.println(checkBoxPage.relustCheckBox().getText());
   }
}
