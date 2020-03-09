package com.ksergie.ui.Registration;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUI {
    public static final Target JOIN_CITYZENS_LINK =
            Target.the("Join Citizens link").located(By.cssSelector("a[data-key=top-nav-cityzens-join] span"));
    public static final Target LOGOUT_LINK =
            Target.the("Logout link").located(By.xpath("//span[text()='Logout']"));
}
