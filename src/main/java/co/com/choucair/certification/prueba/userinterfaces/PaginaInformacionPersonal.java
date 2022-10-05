package co.com.choucair.certification.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInformacionPersonal {

    public static final Target NOMBRE= Target.the("Nombre de usuario")
            .located(By.id("firstName"));

    public static final Target APELLIDO = Target.the("Apellido de usuario")
            .located(By.id("lastName"));
    public static final Target CORREO = Target.the("Correo de usuario")
            .located(By.id("email"));
    public static final Target MES_NACIMIENTO = Target.the("Mes de nacimiento de usuario")
            .located(By.id("birthMonth"));
    public static final Target DIA_NACIMIENTO = Target.the("Dia de nacimiento de usuario")
            .located(By.id("birthDay"));
    public static final Target ANO_NACIMIENTO  = Target.the("Año de nacimiento de usuario")
            .located(By.id("birthYear"));
    public static final Target BOTON_NEXT = Target.the("Botón para continuar con el formulario")
            .located(By.xpath("//a[@class= 'btn btn-blue']"));

}
