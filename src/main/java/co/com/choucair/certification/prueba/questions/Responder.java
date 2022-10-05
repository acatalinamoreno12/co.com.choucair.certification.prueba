package co.com.choucair.certification.prueba.questions;

import co.com.choucair.certification.prueba.model.UtestInfo;
import co.com.choucair.certification.prueba.userinterfaces.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder implements Question<Boolean> {

    private List<UtestInfo> datos;

    public Responder(List<UtestInfo> datos){
        this.datos = datos;
    }

    public static Responder lOs(List<UtestInfo> datos) {
        return new Responder(datos);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String Boton_final = Text.of(PaginaFinal.BOTON_FINAL).viewedBy(actor).asString();
        return datos.get(0).getStrTextoFinal().equals(Boton_final);
    }
}
