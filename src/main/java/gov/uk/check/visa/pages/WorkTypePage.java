package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")
    List<WebElement> workTypeList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;


    public void selectJobtypeList(String jobType) {
        log.info("select job type list" + workTypeList.toString());
        for (WebElement jobList : workTypeList) {
            if (jobList.getText().contains(jobType))
                clickOnElement(jobList);
            break;
        }
    }

    public void clickContinueButton() {
        log.info("click on continue button " + continueButton);
        clickOnElement(continueButton);
    }

}
