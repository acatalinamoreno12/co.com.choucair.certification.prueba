package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.UtestInfo;
import static co.com.choucair.certification.prueba.userinterfaces.PaginaFinal.*;
import static co.com.choucair.certification.prueba.userinterfaces.PaginaUbicacion.BOTON_NEXT_DISPOSITIVOS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class CompletarPaginaFinal implements Task {

    private List<UtestInfo> datos;

    public CompletarPaginaFinal(List<UtestInfo> datos) {
        this.datos = datos;
    }

    public static CompletarPaginaFinal laPagina(List<UtestInfo> datos) {
        return Tasks.instrumented(CompletarPaginaFinal.class, datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datos.get(0).getStrContrasena()).into(CONTRASENA),
                Enter.theValue(datos.get(0).getStrConfirmarContrasena()).into(CONFIRMAR_CONTRASENA),
                Click.on(CAJA_1),
                Click.on(CAJA_2),
                Click.on(CAJA_3),
                Click.on(BOTON_FINAL));
    }
}
