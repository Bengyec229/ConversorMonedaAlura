import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class Conversor {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/52fe9542f0cbd87a466a3acb/latest/USD";

    public static double convertirMoneda(double cantidad, String monedaDestino) throws IOException, IOException {
        // Obtener las tasas de cambio desde la API
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        Scanner scanner = new Scanner(connection.getInputStream());
        StringBuilder respose = new StringBuilder();
        while (scanner.hasNextLine()) ;
        scanner.close();
        JSObject jsonResponse = new JSObject() {
            @Override
            public Object call(String methodName, Object... args) throws JSException {
                return null;
            }

            @Override
            public Object eval(String s) throws JSException {
                return null;
            }

            @Override
            public Object getMember(String name) throws JSException {
                return null;
            }

            @Override
            public void setMember(String name, Object value) throws JSException {

            }

            @Override
            public void removeMember(String name) throws JSException {

            }

            @Override
            public Object getSlot(int index) throws JSException {
                return null;
            }

            @Override
            public void setSlot(int index, Object value) throws JSException {

            }
        };

        return cantidad;

    }
}