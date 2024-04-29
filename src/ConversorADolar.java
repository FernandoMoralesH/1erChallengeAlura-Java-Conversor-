import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorADolar {

    public float getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(float conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    float conversion_rate;



    public void Conversor() throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe la cantidad que deseas convertir a dolar: ");
        int cantidadUsuario = Integer.parseInt((lectura.nextLine()));

        System.out.println("Coloca el nombre del pais de la moneda que deseas convertir en formato \"AAA\":");
        var pais = lectura.nextLine();

        String direccion = "https://v6.exchangerate-api.com/v6/9fa741b11cbba6f064fb0cde/pair/"+pais+"/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        ConversorADolar conversorBuscado = gson.fromJson(json,ConversorADolar.class);

        float conversor = conversorBuscado.getConversion_rate();
        float conversionResultado = conversor * cantidadUsuario;

        System.out.println("La cantidad de " + cantidadUsuario +" representa "+ conversionResultado+ " Dolares" );
    }




}
