package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> stayTime;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectLengthOfStay(String moreOrLess){
        log.info("Select the Stay time length " + stayTime.toString());
        switch(moreOrLess){
            case "6 months or less":
                stayTime.get(0).click();
                break;
            case "longer than 6 months":
                stayTime.get(1).click();
                break;
        }

    }
    public void clickNextStepButton(){
        clickOnElement(continueButton);
        log.info("Click on continue button" + continueButton.getText());
    }
}

