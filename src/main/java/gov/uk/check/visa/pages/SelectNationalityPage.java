package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectNationality(String nationality)
    {
        //Select a Nationality 'Australia'
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
        log.info("select the nationality "+ nationalityDropDownList.toString());
    }
    public void clickNextStepButton()
    {
        //Click on Continue button
        clickOnElement(nextStepButton);
        log.info("click On next step button "+ nextStepButton.toString());
    }

}
