package co.com.choucair.certification.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDispositivos {

    public static final Target CONTENEDOR_PC = Target.the("Contenedor de PC")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div']"));
    public static final Target PC = Target.the("PC")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]']"));
    public static final Target CONTENEDOR_VERSION = Target.the("Contenedor Version del equipo")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div']"));
    public static final Target VERSION = Target.the("Version equipo")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]']"));
    public static final Target CONTENEDOR_IDIOMA = Target.the("Contenedor Idioma")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div']"));
    public static final Target IDIOMA = Target.the("Idioma")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]']"));
    public static final Target CONTENEDOR_DISPOSITIVO_MOVIL = Target.the("Contenedor Dispositivo Movil")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div']"));
    public static final Target DISPOSITIVO_MOVIL = Target.the("Dispositivo Movil")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]']"));
    public static final Target CONTENEDOR_MODELO = Target.the("Contenedor Modelo")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div']"));
    public static final Target MODELO = Target.the("Modelo")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]']"));
    public static final Target CONTENEDOR_SO = Target.the("Contenedor Sistema Operativo")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div']"));
    public static final Target SO = Target.the("Sistema Operativo")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]']"));
    public static final Target BOTON_NEXT_ULTIMO_PASO = Target.the("Boton para seguir al ultimo paso del formulario")
            .located(By.xpath("//a[@class= 'btn btn-blue pull-right']"));
}
