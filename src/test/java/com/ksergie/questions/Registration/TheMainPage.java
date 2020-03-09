package com.ksergie.questions.Registration;

import com.ksergie.ui.Registration.HomePageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class TheMainPage {
    public static Question<String> registered() {
        return new Question<String>() {
            @Override
            public String answeredBy(Actor actor) {
                return Text.of(HomePageUI.LOGOUT_LINK).viewedBy(actor).asString().toLowerCase();
            }
        };
    }
}
