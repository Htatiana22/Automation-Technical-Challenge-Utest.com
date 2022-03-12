package utestPageProject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OptionJoinToday extends PageObject {

    public static final Target BUTTON_JOIN_TODAY = Target.the("Click on the JoinToday button")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
