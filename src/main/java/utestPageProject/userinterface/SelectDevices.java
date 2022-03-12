package utestPageProject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectDevices  extends PageObject {

    public static final Target INPUT_YOUR_COMPUTER = Target.the("Click on the your computer field")
            .located(By.name("osId"));

    public static final Target SELECT_YOUR_COMPUTER = Target.the("Select computer")
            .located(By.xpath("//div[text()='Debian']"));

    public static final Target INPUT_VERSION = Target.the("Click on the version field")
            .located(By.name("osVersionId"));

    public static final Target SELECT_VERSION = Target.the("Select version")
            .located(By.xpath("//div[text()='8.5 64 Bit']"));

    public static final Target INPUT_LANGUAGE = Target.the("Click on the Language field")
            .located(By.name("osLanguageId"));

    public static final Target SELECT_LANGUAGE = Target.the("Select language")
            .located(By.xpath("//div[text()='Spanish']"));

    public static final Target INPUT_MOBILE_DEVICE = Target.the("Click on the your mobile device field")
            .located(By.name("handsetMakerId"));

    public static final Target SELECT_MOBILE_DEVICE = Target.the("Select mobile device")
            .located(By.xpath("//div[text()='Xiaomi']"));

    public static final Target INPUT_MODEL = Target.the("Click on the model field")
            .located(By.name("handsetModelId"));

    public static final Target SELECT_MODEL = Target.the("Select model")
            .located(By.xpath("//div[text()='Mi A3']"));

    public static final Target INPUT_OPERATING_SYSTEM = Target.the("Click on the operating system field")
            .located(By.name("handsetOSId"));

    public static final Target SELECT_OPERATING_SYSTEM = Target.the("Select operating system")
            .located(By.xpath("//div[text()='Android 12']"));

    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("Click on the button Next Last Step")
            .located(By.className("btn-blue"));
}


