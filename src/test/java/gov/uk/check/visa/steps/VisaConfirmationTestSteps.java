package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationTestSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {

    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }

    @And("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickOnStartButton();
    }

    @And("I select nationality {string}")
    public void iSelectNationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("I select reason {string}")
    public void iSelectReason() {
        new ReasonForTravelPage().selectTheOptionForVisitWorkAcademicVisit();
    }

    @And("I click on continue next button")
    public void iClickOnContinueNextButton() {
        new ReasonForTravelPage().clickOnContinueButtonForReasonForTravelling();
    }

    @Then("I should verify text {string}")
    public void iShouldVerifyText(String resultText) {
        Assert.assertEquals(new ResultPage().getResultMessage(),resultText,"Text not verified successfully.");
    }

    @When("I accept cookie")
    public void iAcceptCookie() {
        new SelectNationalityPage().acceptCookies();
    }

    @And("I select planning to work for {string}")
    public void iSelectPlanningToWorkFor(String work) {
        new WorkTypePage().selectHealthAndCareProvisionOption();
    }

    @Then("I should verify result {string}")
    public void iShouldVerifyResult(String rText) {
   new ResultPage().verifyResultMessageForHealthAndCarePeople(rText);

    }

    @And("I select Work academic visit or business")
    public void iSelectWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().selectTheOptionForVisitWorkAcademicVisit();
    }


    @And("I select reason Tourism {string}")
    public void iSelectReasonTourism(String reason) {
        new ReasonForTravelPage().selectReasonForVisitWithReason(reason);
    }

    @And("I select stay for longer than six months")
    public void iSelectStayForLongerThanSixMonths() {
        new DurationOfStayPage().clickOnRadioButtonForLongerThanSixMonth();
    }

    @And("I select planning to work for Health and care professional")
    public void iSelectPlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectHealthAndCareProvisionOption();
    }


    @And("I Click on Continue button for HealthAndCare")
    public void iClickOnContinueButtonForHealthAndCare() {
        new WorkTypePage().clickOnContinueButtonForHealthAndCare();
    }

    @And("I select a Nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I select reason Join partner or family for a long stay")
    public void iSelectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().selectTheOptionForVisitJoinPartnerOrFamilyForALongStay();
    }


    @And("I click on continue button for reasons for travelling")
    public void iClickOnContinueButtonForReasonsForTravelling() {
        new ReasonForTravelPage().clickOnContinueButtonForReasonForTravelling();
    }

    @Then("I should verify a result {string}")
    public void iShouldVerifyAResult(String text) {
        new FamilyImmigrationStatusPage().verifyTheMessageThatYouMayNeedVisaToJoinFamilyOrPartner("You may need a visa");
    }

}
