package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.UtestInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.prueba.userinterfaces.PaginaInformacionPersonal.BOTON_NEXT;
import static co.com.choucair.certification.prueba.userinterfaces.PaginaUbicacion.*;

import java.util.List;

public class CompletarInformacionDireccion  implements Task {

    private List<UtestInfo> datos;

    public CompletarInformacionDireccion(List<UtestInfo> datos) {
        this.datos = datos;
    }


    public static CompletarInformacionDireccion laPagina(List<UtestInfo> datos) {

        return Tasks.instrumented(CompletarInformacionDireccion.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrCiudad()).into(CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Hit.the(Keys.ENTER).into(CIUDAD),
                Enter.theValue(datos.get(0).getStrCodigoPostal()).into(CODIGO_POSTAL),
                Click.on(CONTENEDOR_PAIS),
                Enter.theValue(datos.get(0).getStrPais()).into(PAIS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BOTON_NEXT_DISPOSITIVOS));
    }
}
