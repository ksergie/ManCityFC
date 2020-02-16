package com.ksergie.ui.Registration;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target JOIN_CITYZENS_LINK =
            Target.the("Join Citizens link").located(By.cssSelector("div.secondary-nav--list li:nth-child(1) a"));
}
