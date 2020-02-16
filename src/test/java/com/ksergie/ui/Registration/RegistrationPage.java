package com.ksergie.ui.Registration;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPage {
    public static final Target PAGE_TITLE =
            Target.the("Register page's title").located(By.cssSelector("h1.PageHeader__title"));
    public static final Target REGISTER_BUTTON =
            Target.the("Register button").located(By.cssSelector("button.Button--primary--dark-blue"));
    public static final Target DAYOFBIRTH_TOOLTIP =
            Target.the("Day of birth tooltip").located(By.cssSelector("#parsley-id-24 li"));
    public static final Target MONTHOFBIRTH_TOOLTIP =
            Target.the("Month of birth tooltip").located(By.cssSelector("#parsley-id-26 li"));
    public static final Target YEAROFBIRTH_TOOLTIP =
            Target.the("Year of birth tooltip").located(By.cssSelector("#parsley-id-28 li"));
    public static final Target EMAIL_TOOLTIP =
            Target.the("Email tooltip").located(By.cssSelector("#parsley-id-30 li"));
    public static final Target PASSWORD_TOOLTIP =
            Target.the("Password tooltip").located(By.cssSelector("#parsley-id-32 li"));
    public static final Target CONFIRMPASSWORD_TOOLTIP =
            Target.the("Confirm password tooltip").located(By.cssSelector("#parsley-id-34 li"));
    public static final Target ANSWERYESNO_TOOLTIP =
            Target.the("Answer Yes or No tooltip").located(By.cssSelector("#parsley-id-multiple-MarketingOptIn li"));

}
