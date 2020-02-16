package com.ksergie.steps.Registration;

import com.ksergie.questions.Registration.RegistrationPage;
import com.ksergie.tasks.Registration.OnRegistrationPage;
import com.ksergie.tasks.Registration.OpenWebApp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.StringContains;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MyStepdefs {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) has opened the Registration page")
    public void unregisteredUserHasOpenedTheRegistrationPage(String actorName) {
        OnStage.theActorCalled(actorName).attemptsTo(
            OpenWebApp.onRegisterPage()
        );
    }

    @When("(.*) clicks the JOIN CITYZENS link")
    public void unregisteredUserClicksTheJOINCITYZENSLink(String actorName)  {
        OnStage.theActorInTheSpotlight().attemptsTo(
            OnRegistrationPage.clickRegisterButton()
        );
    }

    @Then("(.*) should be able to see next tooltips:")
    public void unregisteredUserShouldBeAbleToSeeNextTooltips(String actorName, Map<String, String> tooltips) {
        OnStage.theActorInTheSpotlight().should(
                        seeThat(
                                RegistrationPage.hasDayOfBirthTooltip(), new StringContains(tooltips.get("DayOfBirth"))
                        ),
                        seeThat(
                                RegistrationPage.hasMonthOfBirthTooltip(), new StringContains(tooltips.get("MonthOfBirth"))
                        ),
                        seeThat(
                                RegistrationPage.hasYearOfBirthTooltip(), new StringContains(tooltips.get("YearOfBirth"))
                        ),
                        seeThat(
                                RegistrationPage.hasEmailTooltip(), new StringContains(tooltips.get("Email"))
                        ),
                        seeThat(
                                RegistrationPage.hasPasswordTooltip(), new StringContains(tooltips.get("Password"))
                        ),
                        seeThat(
                                RegistrationPage.hasConfirmPasswordTooltip(), new StringContains(tooltips.get("ConfirmPassword"))
                        ),
                        seeThat(
                                RegistrationPage.hasAnswerYesNoTooltip(), new StringContains(tooltips.get("AnswerYesNo"))
                        )
        );
    }
}
