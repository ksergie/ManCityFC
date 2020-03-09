package com.ksergie.steps.Registration;

import com.ksergie.questions.Registration.TheMainPage;
import com.ksergie.tasks.Registration.CompliteRegisterForm;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.StringContains;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegisterUser {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("(.*) fills out the Register form with next details and generated Email address:")
    public void unregisteredUserFillsOutTheRegisterFormWithNextDetailsAndGeneratedEmailAddress(String actorName, Map<String, String> details) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompliteRegisterForm.withDetail(details)
        );
    }

    @Then("(.*) should be register and (.*) item of menu is displayed")
    public void unregisteredUserShouldBeRegisterAndItemOfMenuIsDisplayed(String actorName, String item){
        OnStage.theActorInTheSpotlight().should(
                seeThat(
                        TheMainPage.registered(), new StringContains(item.toLowerCase())
                )
        );
    }
}
