package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.userinterfaces.PaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private PaginaUtest paginaUtest;


    public static AbrirPagina laPagina() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaUtest),
                Click.on(PaginaUtest.JOIN));
    }
}
