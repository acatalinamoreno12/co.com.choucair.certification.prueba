package co.com.choucair.certification.prueba.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("https://www.utest.com/")
public class PaginaUtest extends PageObject {

    public static final Target JOIN = Target.the("Botón para ingresar al fomulario de Registro de Usuario")
            .located(By.xpath("//a[@class= 'unauthenticated-nav-bar__sign-up']"));
}
