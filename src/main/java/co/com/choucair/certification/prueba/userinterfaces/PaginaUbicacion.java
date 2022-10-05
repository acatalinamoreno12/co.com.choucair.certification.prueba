package co.com.choucair.certification.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaUbicacion {
    public static final Target CIUDAD = Target.the("Ciudad del usuario")
            .located(By.id("city"));
    public static final Target CODIGO_POSTAL = Target.the("Codigo Postal del usuario")
            .located(By.id("zip"));
    public static final Target CONTENEDOR_PAIS = Target.the("Contenedor del Pais")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div']"));

    public static final Target PAIS = Target.the("Pais del usuario")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]']"));

    public static final Target BOTON_NEXT_DISPOSITIVOS = Target.the("Botón para continuar con el formulario a Dispositivos")
            .located(By.xpath("//a[@class= 'btn btn-blue pull-right']"));
}
