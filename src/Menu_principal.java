import java.io.IOException;
import java.util.Scanner;

public class Menu_principal {

    public void SaludoPrincipal(){
        System.out.println("""
                -- Conversor de Monedas (USD) ---
                --------- Menu Principal --------
                """);
    }

    public void menuSeleccion(){
        System.out.println("""
                    -- Elige la Opcion correspondiente:
                    *************************************
                    
                    1.- Convertir tu moneda a Dolar:
                    2.- Convertir Dolares a otra moneda:
                    3.- Salir.
                    """);
    }

    public void MenuP() throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            menuSeleccion();
            System.out.println("Coloca la opcion del menu a ocupar: ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    ConversorADolar conversorADolar = new ConversorADolar();
                    conversorADolar.Conversor();
                    System.out.println("____________________________________");
                    break;
                case 2:
                    System.out.println("____________________________________");
                    break;
                case 3:
                    System.out.println("Saliendo del Programa.\nVuelve pronto!!");
                    break;
                default:
                    System.out.println("Escoge un número elegible del menu");
                    break;
            }
        }while (opcion !=3);
        teclado.close();


    }
}
