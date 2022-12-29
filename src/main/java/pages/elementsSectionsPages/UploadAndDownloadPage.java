package pages.elementsSectionsPages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UploadAndDownloadPage {
    protected static final String DOWNLOAD_BUTTON_XPATH="//a[@id='downloadButton']";
    protected static final String UPLOAD_BUTTON_XPATH="//input[@id='uploadFile']";
    protected static final String SAMPLE_FILE_DOWNLOAD_XPATH="//a[@download='sampleFile.jpeg']";
    protected static final String UPLOADED_FILE_PATH_XPATH="//p[@id='uploadedFilePath']";

    public SelenideElement downloadButton(){return $(By.xpath(DOWNLOAD_BUTTON_XPATH));}
    public SelenideElement uploadButton(){return $(By.xpath(UPLOAD_BUTTON_XPATH));}
    public SelenideElement sampleFile(){return $(By.xpath(SAMPLE_FILE_DOWNLOAD_XPATH));}
    public SelenideElement uploadedFilePath(){return $(By.xpath(UPLOADED_FILE_PATH_XPATH));}
}
