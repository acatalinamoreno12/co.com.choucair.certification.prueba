package co.com.choucair.certification.prueba.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaFinal {

    public static final Target CONTRASENA =Target.the("Contraseña de Usuario")
            .located(By.id("password"));

    public static final Target CONFIRMAR_CONTRASENA =Target.the("Confirmar Contraseña de usuario")
            .located(By.id("confirmPassword"));

    public static final Target CAJA_1 =Target.the("Checkbox 1")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span']"));

    public static final Target CAJA_2 =Target.the("Checkbox 2")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]']"));

    public static final Target CAJA_3 =Target.the("Checkbox 3")
            .located(By.xpath("//a[@class= '/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]']"));

    public static final Target BOTON_FINAL =Target.the("Finalizar el formulario y registro")
            .located(By.xpath("//a[@class= 'btn btn-blue']"));



}
