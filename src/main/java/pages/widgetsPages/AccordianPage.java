package pages.widgetsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccordianPage {
    protected static final String ACCORDION_SECTION_1_XPATH="//*[@id='section1Heading']";
    protected static final String ACCORDION_SECTION_1_CONTENT_XPATH="//*[@id='section1Content']";
    protected static final String ACCORDION_SECTION_2_Xpath="//div[@id='section2Heading']";
    protected static final String ACCORDION_SECTION_2_CONTENT_XPATH="//*[@id='section2Content']";
    protected static final String ACCORDION_SECTION_3_XPATH="//div[@id='section3Heading']";
    protected static final String ACCORDION_SECTION_3_CONTENT_XPATH="//*[@id='section3Content']";
    protected static final String ACCORDIONS_DIV_XPATH="//div[@id='accordianContainer'] /div[@class='accordion']";



    public SelenideElement accordionSection1Title(){return $(By.xpath(ACCORDION_SECTION_1_XPATH));}
    public SelenideElement accordionSection1Content(){return $(By.xpath(ACCORDION_SECTION_1_CONTENT_XPATH));}

    public SelenideElement accordionSection2Title(){return $(By.xpath(ACCORDION_SECTION_2_Xpath));}
    public SelenideElement accordionSection2Content(){return $(By.xpath(ACCORDION_SECTION_2_CONTENT_XPATH));}

    public SelenideElement accordionSection3Title(){return $(By.xpath(ACCORDION_SECTION_3_XPATH));}
    public SelenideElement accordionSection3Content(){return $(By.xpath(ACCORDION_SECTION_3_CONTENT_XPATH));}

    public SelenideElement accordionsDiv(){return $(By.xpath(ACCORDIONS_DIV_XPATH));}

}
