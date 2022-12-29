package steps.elementsSectionsSteps;

import com.codeborne.selenide.DownloadsFolder;
import jdk.jfr.Description;
import lombok.SneakyThrows;
import org.testng.Assert;
import pages.elementsSectionsPages.UploadAndDownloadPage;
import steps.BaseSteps;
import com.codeborne.selenide.*;

import java.io.File;


public class UploadAndDownloadSteps extends BaseSteps {


    UploadAndDownloadPage uploadAndDownloadPage = new UploadAndDownloadPage();
    @SneakyThrows
    public void downloadFile(){
       //String downloadPath = "C:\\Users\\vtekhtilov\\Desktop\\downloads\\";
       String fileName = "sampleFile.jpeg";

        waitTillElementIsVisible(uploadAndDownloadPage.downloadButton());
        File sampleFile=uploadAndDownloadPage.sampleFile().download();
        Assert.assertEquals(sampleFile.getName(), fileName);
    }

    public void uploadFile(){
        String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\test.png";
        waitTillElementIsVisible(uploadAndDownloadPage.uploadButton());
        String fileName = "test.png";
        //uploadAndDownloadPage.uploadButton().sendKeys(filePath);
        File uploadFile = uploadAndDownloadPage.uploadButton().uploadFile(new File(filePath));
        Assert.assertTrue(uploadAndDownloadPage.uploadedFilePath().getText().contains(fileName));

    }
}
