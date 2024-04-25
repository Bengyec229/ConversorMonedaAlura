import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private String deDivisa;
    private String aDivisa;
    private double cantidad;
    public Conversor(String deDivisas,String aDivisas, double cantidad){
        this.deDivisa = deDivisas.toUpperCase();
        this.aDivisa = aDivisas.toUpperCase();
        this.cantidad = cantidad;
    }

    public double convertir() throws IOException, InterruptedException {
        String APIKey = "52fe9542f0cbd87a466a3acb";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + APIKey + "/latest/" + deDivisa);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            JsonObject jsonObject = new Gson().fromJson(response.body(), JsonObject.class);
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            double conversionRate = conversionRates.get(aDivisa).getAsDouble();
            return cantidad * conversionRate;
        } else {
            throw new IOException("Error al obtener la tasa de conversión.");
        }
        }
    }




