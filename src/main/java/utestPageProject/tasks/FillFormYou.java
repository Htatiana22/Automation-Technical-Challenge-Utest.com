package utestPageProject.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utestPageProject.model.UtestPageData;
import utestPageProject.userinterface.EnterYourData;

import java.util.List;

public class FillFormYou implements Task {

    private List<UtestPageData> utestPageData;

    public FillFormYou (List<UtestPageData> utestPageData) {
        this.utestPageData = utestPageData;
    }

    public static FillFormYou toContinue(List<UtestPageData> utestPageData) {
        return Tasks.instrumented(FillFormYou.class, utestPageData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EnterYourData.INPUT_FIRSTNAME),
                Enter.keyValues(utestPageData.get(0).getStrFirstName()).into(EnterYourData.VALUE_FIRSTNAME),
                Click.on(EnterYourData.INPUT_LASTNAME),
                Enter.keyValues(utestPageData.get(0).getStrLastName()).into(EnterYourData.VALUE_LASTNAME),
                Click.on(EnterYourData.INPUT_EMAIL),
                Enter.keyValues(utestPageData.get(0).getStrEmail()).into(EnterYourData.VALUE_EMAIL),
                Click.on(EnterYourData.INPUT_MONTH),
                Click.on(EnterYourData.VALUE_MONTH),
                Click.on(EnterYourData.INPUT_DAY),
                Click.on(EnterYourData.VALUE_DAY),
                Click.on(EnterYourData.INPUT_YEAR),
                Click.on(EnterYourData.VALUE_YEAR),
                Click.on(EnterYourData.INPUT_LANGUAGE),
                Enter.keyValues(utestPageData.get(0).getStrLanguages()).into(EnterYourData.VALUE_LANGUAGE),
                Click.on(EnterYourData.BUTTON_NEXT_LOCATION)
        );
    }
}
