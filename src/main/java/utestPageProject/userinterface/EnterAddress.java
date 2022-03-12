package utestPageProject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterAddress extends PageObject {

    public static final Target INPUT_CITY = Target.the("Click on the city field")
            .located (By.id("city"));

    public static final Target VALUE_CITY = Target.the("Write the name of the city")
            .located (By.id("city"));

    public static final Target INPUT_CODE_POSTAL = Target.the("Clickc on the zip code field")
            .located (By.id("zip"));

    public static final Target VALUE_CODE_POSTAL = Target.the("Write the postal number")
            .located (By.id("zip"));

    public static final Target INPUT_COUNTRY = Target.the("Click on the country field")
            .located(By.xpath("//span[@aria-label='Select a country']"));

    public static final Target VALUE_COUNTRY = Target.the("Select the country")
            .located(By.xpath("//div[text()='Peru']"));

    public static final Target BUTTON_NEXT_DEVICES = Target.the("Click on the button Next Devices")
            .located(By.className("btn-blue"));

}
