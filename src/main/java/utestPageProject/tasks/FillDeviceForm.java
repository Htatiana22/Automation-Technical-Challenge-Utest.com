package utestPageProject.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import utestPageProject.userinterface.EnterAddress;
import utestPageProject.userinterface.OptionJoinToday;
import utestPageProject.userinterface.SelectDevices;

public class FillDeviceForm implements Task {

    private SelectDevices selectDevices;

    public static FillDeviceForm lastStep() {
        return Tasks.instrumented(FillDeviceForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectDevices.INPUT_YOUR_COMPUTER),
                Click.on(SelectDevices.SELECT_YOUR_COMPUTER),
                Click.on(SelectDevices.INPUT_VERSION),
                Click.on(SelectDevices.SELECT_VERSION),
                Click.on(SelectDevices.INPUT_LANGUAGE),
                Click.on(SelectDevices.SELECT_LANGUAGE),
                Click.on(SelectDevices.INPUT_MOBILE_DEVICE),
                Click.on(SelectDevices.SELECT_MOBILE_DEVICE),
                Click.on(SelectDevices.INPUT_MODEL),
                Click.on(SelectDevices.SELECT_MODEL),
                Click.on(SelectDevices.INPUT_OPERATING_SYSTEM),
                Click.on(SelectDevices.SELECT_OPERATING_SYSTEM),
                Click.on(SelectDevices.BUTTON_NEXT_LAST_STEP)
        );
    }
}
