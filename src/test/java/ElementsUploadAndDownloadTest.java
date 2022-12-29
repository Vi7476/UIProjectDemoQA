import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.FileDownloadMode.*;

public class ElementsUploadAndDownloadTest extends BaseTest{

    @BeforeMethod
    public void openUploadAndDownloadPage(){
        //Configuration.proxyEnabled=true;
        Configuration.fileDownload = FOLDER;
        Configuration.downloadsFolder="C:\\Users\\vtekhtilov\\Desktop\\downloads\\";

        mainPageSteps.openBaseUrl();
        mainPageSteps.clickOnElementsButton();
        mainPageSteps.clickOnElement(elementsPage.uploadAndDownloadSection());
        mainPageSteps.elementsUploadAndDownloadPageTitleAssertion();
    }

    @Test
    public void downloadFile(){
        uploadAndDownloadSteps.downloadFile();

    }
    @Test
    public void uploadFile(){
       uploadAndDownloadSteps.uploadFile();
    }



//    @AfterMethod
//    public void stopProxy(){
//       // Configuration.proxyEnabled = false;
//    }
//    @Test
//    public void downloadHandlingUsingClick(){
//        uploadAndDownloadSteps.downloadFile();
//    }

}
