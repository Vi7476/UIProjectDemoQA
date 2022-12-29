package steps;

import pages.MainPage;

public class MainPageSteps extends BaseSteps {
    MainPage mainPage = new MainPage();


    public void clickOnElementsButton() {
        clickOnElement(mainPage.elementsButton());
        pageElementAccert(mainPage.pageHeader(), "Elements");}

    public void clickOnFormsButton() {
        clickOnElement(mainPage.formsButton());
        pageElementAccert(mainPage.pageHeader(),"Forms" );}

    public void clickOnAlertsAndFramesButton() {
        clickOnElement(mainPage.alertsFrameAndWindowsButton());
        pageElementAccert(mainPage.pageHeader(), "Alerts, Frame & Windows");
    }

    public void clickOnWidgetsButton() {
        clickOnElement(mainPage.widgetsButton());
        pageElementAccert(mainPage.pageHeader(), "Widgets");
    }

    public void clickOnInteractionButton() {
        clickOnElement(mainPage.interactionsButton());
        pageElementAccert(mainPage.pageHeader(), "Interactions");
    }

    public void clickOnBoocksStoreApplicationButton() {
        clickOnElement(mainPage.bookStoreApplicationButton());
        pageElementAccert(mainPage.pageHeader(), "Book Store Application");
    }



    //Sub Pages Titles Assertions
    public void elementsTEXTBOXPageTitleAssertion() {
        pageElementAccert(mainPage.pageHeader(), "Text Box");}
    public void elementsCHECKBOXPageTitleAssertion(){
        pageElementAccert(mainPage.pageHeader(), "Check Box");}
    public void elementsRadioButtonPageTitleAssertion(){
        pageElementAccert(mainPage.pageHeader(), "Radio Button");
    }
    public void elementsWebTablePageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Web Tables");}
    public void elementsButtonsPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Buttons");}
    public void elementsLinksPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Links");}
    public void elementsBrokenLinksImagesPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Broken Links - Images");}
    public void elementsUploadAndDownloadPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Upload and Download");}
    public void elementsDynamicPropertiesPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Dynamic Properties");}
    public void formsFormsPracticePageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Practice Form");}
    public void afwBrowserWindowsPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Browser Windows");}
    public void afwAlertsPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Alerts");}
    public void afwFramesPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Frames");}
    public void afwNestedFramesPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Nested Frames");}
    public void afwModalDialogsPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Modal Dialogs");}
    public void widgetsAccordianPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Accordian");}
    public void widgetsAutoCompletePageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Auto Complete");}
    public void widgetsDataPickerPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Date Picker");}
    public void widgetsSliderPageTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Slider");}
    public void widgetsProgressBarTitleAssertion(){pageElementAccert(mainPage.pageHeader(), "Progress Bar");}
}
