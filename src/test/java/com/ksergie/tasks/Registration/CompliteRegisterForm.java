package com.ksergie.tasks.Registration;

import com.ksergie.ui.Registration.HomePageUI;
import com.ksergie.ui.Registration.RegistrationPageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompliteRegisterForm implements Performable{

    private final Map<String, String> details;

    public CompliteRegisterForm(Map<String, String> details) {
        this.details = details;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectFromOptions.byVisibleText(details.get("DateOfBirth")).from(RegistrationPageUI.DAY_OF_BIRTH_FIELD),
                SelectFromOptions.byVisibleText(details.get("MonthOfBirth")).from(RegistrationPageUI.MONTH_OF_BIRTH_FIELD),
                SelectFromOptions.byVisibleText(details.get("YearOfBirth")).from(RegistrationPageUI.YEAR_OF_BIRTH_FIELD),
                Enter.theValue(getNewCustomerName()).into(RegistrationPageUI.EMAIL_FIELD),
                Enter.theValue(details.get("Password")).into(RegistrationPageUI.PASSWORD_FIELD),
                Enter.theValue(details.get("Password")).into(RegistrationPageUI.CONFIRM_PASSWORD_FIELD),
                JavaScriptClick.on(RegistrationPageUI.OFFER_NO),
                Click.on(RegistrationPageUI.REGISTER_BUTTON),
                WaitUntil.the(RegistrationPageUI.SKIP_LINK, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(RegistrationPageUI.SKIP_LINK),
                WaitUntil.the(HomePageUI.LOGOUT_LINK, isVisible()).forNoMoreThan(5).seconds()
                );
    }

    public static Performable withDetail(Map<String, String> details) {
        return new CompliteRegisterForm(details);
    }

    private String getNewCustomerName() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddmmss");
        Date date = new Date();
        return "tester" + dateFormat.format(date) + "@test.com";
    }

}
