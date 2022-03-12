package utestPageProject.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import utestPageProject.model.UtestPageData;
import utestPageProject.userinterface.EnterAddress;
import utestPageProject.userinterface.EnterYourData;

import java.util.List;

public class FillAddressForm implements Task {

    private List<UtestPageData> utestPageData;

    public FillAddressForm (List<UtestPageData> UtestPageData) {
        this.utestPageData = UtestPageData;
    }

    public static FillAddressForm continueRegistration (List<UtestPageData> utestPageData) {
        return Tasks.instrumented(FillAddressForm.class, utestPageData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EnterAddress.INPUT_CITY),
                Hit.the(Keys.CLEAR).into(EnterAddress.VALUE_CITY),
                Enter.theValue(utestPageData.get(0).getStrCity()).into(EnterAddress.VALUE_CITY),
                Hit.the(Keys.ARROW_DOWN).into(EnterAddress.VALUE_CITY),
                Hit.the(Keys.ENTER).into(EnterAddress.VALUE_CITY),
                Click.on(EnterAddress.INPUT_CODE_POSTAL),
                Enter.theValue(utestPageData.get(0).getStrPostalCode()).into(EnterAddress.VALUE_CODE_POSTAL),
                Click.on(EnterAddress.INPUT_COUNTRY),
                Click.on(EnterAddress.VALUE_COUNTRY),
                Click.on(EnterAddress.BUTTON_NEXT_DEVICES)
        );
    }
}
