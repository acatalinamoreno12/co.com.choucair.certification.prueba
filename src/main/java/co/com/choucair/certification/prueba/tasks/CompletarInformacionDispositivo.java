package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.UtestInfo;
import static co.com.choucair.certification.prueba.userinterfaces.PaginaDispositivos.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class CompletarInformacionDispositivo implements Task {


    private List<UtestInfo> datos;

    public CompletarInformacionDispositivo(List<UtestInfo> datos) {
        this.datos = datos;
    }

    public static CompletarInformacionDispositivo laPagina(List<UtestInfo> datos) {
        return Tasks.instrumented(CompletarInformacionDispositivo.class, datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CONTENEDOR_PC),
                Enter.theValue(datos.get(0).getStrPC()).into(PC).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTENEDOR_VERSION),
                Enter.theValue(datos.get(0).getStrVersion()).into(VERSION).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTENEDOR_IDIOMA),
                Enter.theValue(datos.get(0).getStrIdioma()).into(IDIOMA).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTENEDOR_DISPOSITIVO_MOVIL),
                Enter.theValue(datos.get(0).getStrDispositivoMovil()).into(DISPOSITIVO_MOVIL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTENEDOR_MODELO),
                Enter.theValue(datos.get(0).getStrModelo()).into(MODELO).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(CONTENEDOR_SO),
                Enter.theValue(datos.get(0).getStrSO()).into(SO).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BOTON_NEXT_ULTIMO_PASO));
    }
}
