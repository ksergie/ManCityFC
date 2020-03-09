package com.ksergie.tasks.Registration;

import com.ksergie.ui.Registration.HomePageUI;
import com.ksergie.ui.Registration.RegistrationPageUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenWebApp {
    public static Performable onRegisterPage() {
        return Task.where("{0} opens the mobile application",
                Open.url("https://www.mancity.com/"),
                WaitUntil.the(HomePageUI.JOIN_CITYZENS_LINK, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomePageUI.JOIN_CITYZENS_LINK),
                WaitUntil.the(RegistrationPageUI.PAGE_TITLE, isVisible()).forNoMoreThan(4).seconds());
    }
}
