import java.io.IOException;

/*
Proyecto de JAVA con el cual se podra realizar conversion de dolares a otras
monedas, por medio de un API
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Menu_principal menuPrincipal = new Menu_principal();
        menuPrincipal.SaludoPrincipal();

        menuPrincipal.MenuP();
    }
}