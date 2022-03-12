package utestPageProject.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import utestPageProject.model.UtestPageData;
import utestPageProject.userinterface.FinishRegistration;


public class Answer implements Question<Boolean> {

    private String strVerifySuccessfulRegistration;

    public Answer (String strVerifySuccessfulRegistration) {
        this.strVerifySuccessfulRegistration = strVerifySuccessfulRegistration;
    }
    public static Answer toThe(String strVerifySuccessfulRegistration ) {
        return new Answer (strVerifySuccessfulRegistration);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Confirm_Registration = Text.of(FinishRegistration.CONFIRM_REGISTRATION).viewedBy(actor).asString();
        if(strVerifySuccessfulRegistration.equals(Confirm_Registration)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
