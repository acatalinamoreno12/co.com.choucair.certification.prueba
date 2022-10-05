package co.com.choucair.certification.prueba.stepdefinitions;

import co.com.choucair.certification.prueba.model.UtestInfo;
import co.com.choucair.certification.prueba.questions.Responder;
import co.com.choucair.certification.prueba.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PruebaStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Angie quiere registrarse en la plataforma$")
    public void angieQuiereRegistrarseEnLaPlataforma() throws Exception {
       theActor("Angie").wasAbleTo(AbrirPagina.laPagina());
    }

    @When("^El usuario ingresa la información solicitada en la página para su correcto registro$")
    public void elUsuarioIngresaLaInformacionSolicitadaEnLaPaginaParaSuCorrectoRegistro(List<UtestInfo> datos) throws Exception {
        theActorInTheSpotlight().attemptsTo(CompletarInformacionPersonal.laPagina(datos), CompletarInformacionDireccion.laPagina(datos),
                CompletarInformacionDispositivo.laPagina(datos), CompletarPaginaFinal.laPagina(datos)
        );
    }

    @Then("^El registro es exitoso cuando aparece el botón Configuración Completa\\.$")
    public void elRegistroEsExitosoCuandoApareceElBotonConfiguracionCompleta(List<UtestInfo> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.lOs(datos)));

    }

}
