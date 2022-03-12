package utestPageProject.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utestPageProject.model.UtestPageData;
import utestPageProject.questions.Answer;
import utestPageProject.tasks.*;

import java.util.List;

public class UtestPageStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^User wants to register Utest page$")
    public void user_wants_to_register_Utest_page() {
        OnStage.theActorCalled("Herika").wasAbleTo(OpenUtest.thePage());
    }

    @When("^User clicks Join Today button$")
    public void user_clicks_Join_Today_button() {
        OnStage.theActorInTheSpotlight().attemptsTo(ButtonJoin.enterData());
    }

    @When("^User fills in form to create a user$")
    public void user_fills_in_form_to_create_a_user(List<UtestPageData> utestPageData) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillFormYou.toContinue (utestPageData),
                FillAddressForm.continueRegistration(utestPageData),
                FillDeviceForm.lastStep(),
                FillLastData.toEnd(utestPageData));
    }

    @Then("^User verifies successful registration$")
    public void user_verifies_successful_registration(List<UtestPageData> datas) {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(datas.get(0).getStrVerifySuccessfulRegistration())));
    }

}
