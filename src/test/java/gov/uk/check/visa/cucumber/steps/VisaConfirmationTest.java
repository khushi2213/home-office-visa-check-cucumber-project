package gov.uk.check.visa.cucumber.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VisaConfirmationTest {

    @And("I click on accept cookies")
    public void iClickOnAcceptCookies() {
        new StartPage().acceptCookies();
    }

    @And("I click on hide message")
    public void iClickOnHideMessage() {
        new StartPage().clickHideMessage();
    }

    @When("I click start button")
    public void iClickStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select a nationality {string}")
    public void iSelectANationalityAustralia(String nationality) {
        //Select a Nationality 'Australia'
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        //Click on Continue button
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select reason {string}")
    public void iSelectReasonTourismOrVisitingFamilyAndFriends(String tourism) {
        //Select reason 'Tourism'
        new ReasonForTravelPage().selectReasonForVisit(tourism);
    }

    @And("I click on Continue button again")
    public void iClickOnContinueButtonAgain() {
        //Click on Continue button
        new ReasonForTravelPage().clickNextContinueButton();
    }

    @Then("I verify result {string}")
    public void iVerifyResultYouWillNotNeedAVisaToComeToTheUK(String message) {
        Assert.assertEquals("Visa message not found","You will not need a visa to come to the UK",new ResultPage().confirmResultMessage());
    }

    @And("I select intendent to stay for {string}")
    public void iSelectIntendentToStayForLessThanSix(String duration) {
        new DurationOfStayPage().selectLengthOfStay(duration);
    }
}
