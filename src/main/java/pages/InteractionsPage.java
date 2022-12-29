package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InteractionsPage {
    protected static final String SORTABLE_SECTION_XPATH="//span[text()='Sortable']";
    protected static final String SELECTABLE_SECTION_XPATH="//span[text()='Selectable']";
    protected static final String RESIZABLE_SECTION_XPATH="//span[text()='Resizable']";
    protected static final String DROPPABLE_SECTION_XPATH="//span[text()='Droppable']";
    protected static final String DRAGABBLE_SECTION_XPATH="//span[text()='Dragabble']";




    public SelenideElement sortableSection(){
        return $(By.xpath(SORTABLE_SECTION_XPATH));
    }
    public SelenideElement selectableSection(){
        return $(By.xpath(SELECTABLE_SECTION_XPATH));
    }
    public SelenideElement resizableSection(){
        return $(By.xpath(RESIZABLE_SECTION_XPATH));
    }
    public SelenideElement droppableSection(){
        return $(By.xpath(DROPPABLE_SECTION_XPATH));
    }
    public SelenideElement dragabbleSection(){
        return $(By.xpath(DRAGABBLE_SECTION_XPATH));
    }





}
