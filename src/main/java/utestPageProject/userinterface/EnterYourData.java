package utestPageProject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterYourData extends PageObject {

    public static final Target INPUT_FIRSTNAME = Target.the("Click on the name field")
            .located (By.id("firstName"));

    public static final Target VALUE_FIRSTNAME = Target.the("Enter the name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("Click on the lastname field")
            .located (By.id("lastName"));

    public static final Target VALUE_LASTNAME = Target.the("Enter the lastname")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Click on the email field")
            .located (By.id("email"));

    public static final Target VALUE_EMAIL = Target.the("Enter the email")
            .located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("Click on the month field")
            .located (By.id("birthMonth"));

    public static final Target VALUE_MONTH = Target.the("Select the month")
            .located(By.xpath("//option[@label='February']"));

    public static final Target INPUT_DAY = Target.the("Click on the day field")
            .located (By.id("birthDay"));

    public static final Target VALUE_DAY = Target.the("Select the day")
            .located(By.xpath("//option[@label='2']"));

    public static final Target INPUT_YEAR = Target.the("Click on the year field")
            .located (By.id("birthYear"));

    public static final Target VALUE_YEAR = Target.the("Select the year")
            .located(By.xpath("//option[@label='1990']"));

    public static final Target INPUT_LANGUAGE = Target.the("Click on select language")
            .located(By.className("ui-select-search"));

    public static final Target VALUE_LANGUAGE = Target.the("Select a language")
            .located(By.className("ui-select-search"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("Click on button Next Location")
            .located(By.className("btn-blue"));
}
