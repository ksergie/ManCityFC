package com.ksergie.tasks.Registration;

import com.ksergie.ui.Registration.RegistrationPageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

public class OnRegistrationPage implements Performable{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistrationPageUI.REGISTER_BUTTON)
        );
    }

    public static Performable clickRegisterButton() {
        return new OnRegistrationPage();
    }
}
