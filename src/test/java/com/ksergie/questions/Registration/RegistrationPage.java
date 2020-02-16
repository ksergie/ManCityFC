package com.ksergie.questions.Registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static com.ksergie.ui.Registration.RegistrationPage.*;

public class RegistrationPage {

    public static Question<String> hasDayOfBirthTooltip() {
        return new Question<String>() {
            @Override
            public String answeredBy(Actor actor) {
                return Text.of(DAYOFBIRTH_TOOLTIP).viewedBy(actor).asString();
            }
        };
    }

    public static Question<String> hasMonthOfBirthTooltip() {
        return new Question<String>() {
            @Override
            public String answeredBy(Actor actor) {
                return Text.of(MONTHOFBIRTH_TOOLTIP).viewedBy(actor).asString();
            }
        };
    }

    public static Question<String> hasYearOfBirthTooltip() {
        return new Question<String>() {
            @Override
            public String answeredBy(Actor actor) {
                return Text.of(YEAROFBIRTH_TOOLTIP).viewedBy(actor).asString();
            }
        };
    }

    public static Question<String> hasEmailTooltip() {
        return new Question<String>() {
            @Override
            public String answeredBy(Actor actor) {
                return Text.of(EMAIL_TOOLTIP).viewedBy(actor).asString();
            }
        };
    }

    public static Question<String> hasPasswordTooltip() {
        return new Question<String>() {
            @Override
            public String answeredBy(Actor actor) {
                return Text.of(PASSWORD_TOOLTIP).viewedBy(actor).asString();
            }
        };
    }

    public static Question<String> hasConfirmPasswordTooltip() {
        return new Question<String>() {
            @Override
            public String answeredBy(Actor actor) {
                return Text.of(CONFIRMPASSWORD_TOOLTIP).viewedBy(actor).asString();
            }
        };
    }

    public static Question<String> hasAnswerYesNoTooltip() {
        return new Question<String>() {
            @Override
            public String answeredBy(Actor actor) {
                return Text.of(ANSWERYESNO_TOOLTIP).viewedBy(actor).asString();
            }
        };
    }
}
