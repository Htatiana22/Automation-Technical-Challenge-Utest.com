package utestPageProject.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import utestPageProject.userinterface.OptionJoinToday;

public class ButtonJoin implements Task {

    private OptionJoinToday optionJoinToday;

    public static ButtonJoin enterData() {
        return Tasks.instrumented(ButtonJoin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OptionJoinToday.BUTTON_JOIN_TODAY)
        );
    }
}
