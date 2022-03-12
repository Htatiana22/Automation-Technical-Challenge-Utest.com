package utestPageProject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinishRegistration extends PageObject {

    public static final Target INPUT_CREATE_PASSWORD = Target.the("Click on the create password field")
            .located (By.id("password"));

    public static final  Target VALUE_CREATE_PASSWORD = Target.the("Write password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Click on the confirm password field")
            .located (By.id("confirmPassword"));

    public static final Target VALUE_CONFIRM_PASSWORD = Target.the("Retype password")
            .located (By.id("confirmPassword"));

    public static final Target CHECK_ACCEPT_TERMS = Target.the("Click accept user terms")
            .located (By.id("termOfUse"));

    public static final Target CHECK_ACCEPT_PRIVACY = Target.the("Click accept privacy and security policies")
            .located (By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Click on the button Complete Setup")
            .located(By.className("btn-blue"));

    public static final Target CONFIRM_REGISTRATION = Target.the("Successfully registered user")
            .located(By.className("sub-title"));
}
