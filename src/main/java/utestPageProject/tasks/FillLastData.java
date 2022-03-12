package utestPageProject.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utestPageProject.model.UtestPageData;
import utestPageProject.userinterface.EnterAddress;
import utestPageProject.userinterface.FinishRegistration;

import java.util.List;

public class FillLastData implements Task {

    private List<UtestPageData> utestPageData;

    public FillLastData(List<UtestPageData> utestPageData) {
        this.utestPageData = utestPageData;
    }

    public static FillLastData toEnd (List<UtestPageData> UtestPageData) {
        return Tasks.instrumented(FillLastData.class, UtestPageData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FinishRegistration.INPUT_CREATE_PASSWORD),
                Enter.theValue(utestPageData.get(0).getStrCreatePassword()).into(FinishRegistration.VALUE_CREATE_PASSWORD),
                Click.on(FinishRegistration.INPUT_CONFIRM_PASSWORD),
                Enter.theValue(utestPageData.get(0).getStrConfirmPassword()).into(FinishRegistration.VALUE_CONFIRM_PASSWORD),
                Click.on(FinishRegistration.CHECK_ACCEPT_TERMS),
                Click.on(FinishRegistration.CHECK_ACCEPT_PRIVACY),
                Click.on(FinishRegistration.BUTTON_COMPLETE_SETUP)

        );
    }
}
