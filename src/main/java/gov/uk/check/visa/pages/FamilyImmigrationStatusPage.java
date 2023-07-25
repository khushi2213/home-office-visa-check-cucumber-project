package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FamilyImmigrationStatusPage extends Utility{

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());


    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']//label")
    List<WebElement> visaType;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectImmigrationStatus(String status){
        log.info("select immigartion status " + visaType.toString());

        switch (status){
            case "Yes":
                visaType.get(0).click();
                break;
            case "NO":
                visaType.get(1).click();
                break;
        }
    }
    public void clickContinueButton() {
        clickOnElement(continueButton);
    }

}
