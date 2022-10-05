package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.UtestInfo;
import static co.com.choucair.certification.prueba.userinterfaces.PaginaInformacionPersonal.*;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class CompletarInformacionPersonal implements Task {

    public CompletarInformacionPersonal(List<UtestInfo> datos) {
        this.datos = datos;
    }

    private List <UtestInfo> datos;

    public static CompletarInformacionPersonal laPagina(List<UtestInfo> datos) {
        return Tasks.instrumented(CompletarInformacionPersonal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(NOMBRE),
                Enter.theValue(datos.get(0).getStrApellido()).into(APELLIDO),
                Enter.theValue(datos.get(0).getStrCorreo()).into(CORREO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrMesNacimiento()).from(MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrDiaNacimiento()).from(DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrAnoNacimiento()).from(ANO_NACIMIENTO),
                Click.on(BOTON_NEXT));
    }
}
