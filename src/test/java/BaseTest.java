import pages.*;
import steps.BaseSteps;
import steps.MainPageSteps;
import steps.afwSectionSteps.*;
import steps.elementsSectionsSteps.*;
import steps.formsSectionSteps.PracticeFormsSteps;
import steps.widgetsSteps.*;

public class BaseTest {
    MainPage mainPage = new MainPage();
    ElementsPage elementsPage = new ElementsPage();
    FormsPage formsPage = new FormsPage();
    WidgetsPage widgetsPage = new WidgetsPage();
    AlertsFrameAndWindowsPage alertsFrameAndWindowsPage = new AlertsFrameAndWindowsPage();





    BaseSteps baseSteps = new BaseSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();
    TextBoxSteps textBoxSteps = new TextBoxSteps();
    CheckBoxSteps checkBoxSteps = new CheckBoxSteps();
    RadioButtonSteps radioButtonSteps = new RadioButtonSteps();
    ButtonsSteps buttonsSteps = new ButtonsSteps();
    LinksSteps linksSteps = new LinksSteps();
    BrokenLinksImagesSteps brokenLinksImagesSteps = new BrokenLinksImagesSteps();
    UploadAndDownloadSteps uploadAndDownloadSteps = new UploadAndDownloadSteps();
    DynamicPropertiesSteps dynamicPropertiesSteps = new DynamicPropertiesSteps();
    PracticeFormsSteps practiceFormsSteps = new PracticeFormsSteps();
    BrowserWindowsSteps browserWindowsSteps = new BrowserWindowsSteps();
    AlertsSteps alertsSteps = new AlertsSteps();
    FramseSteps framseSteps = new FramseSteps();
    NestedFramesSteps nestedFramesSteps = new NestedFramesSteps();
    ModalDialogsSteps modalDialogsSteps = new ModalDialogsSteps();
    AccordianSteps accordianSteps = new AccordianSteps();
    AutoCompleteSteps autoCompleteSteps = new AutoCompleteSteps();
    DatePickerSteps datePickerSteps = new DatePickerSteps();
    SliderSteps sliderSteps = new SliderSteps();
    ProgressBarSteps progressBarSteps = new ProgressBarSteps();
}
