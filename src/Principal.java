import Repositorio.Repositorio;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenido al Conversor de Moneda de Benjamin");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Usd a Peso Argentino");
                System.out.println("2. Peso Argentino a Dolar");
                System.out.println("3. Usd a Real Brasileño");
                System.out.println("4. Real Brasileño a Dolar");
                System.out.println("5. Usd a Peso Colombiano");
                System.out.println("6. Peso Colombiano a Dolar");
                System.out.println("7. Salir");
                System.out.println("+++++++++++++++++++++++++++++++++");
                System.out.println("\nElija una opción:");

                int opcion = scanner.nextInt();
                String monedaDestino = "moneda";
                String monedaDestinoARS = "ARS";
                String monedaDestinoBRL = "BRL";
                String monedaDestinoCOP = "COP";


                double cantidadUSD = 0;
                switch (opcion) {
                    case 1:
                        monedaDestinoARS = "ARS";
                        System.out.println("Ingrese la Cantidad en USD:");
                        cantidadUSD = scanner.nextDouble();
                    case 2:
                        monedaDestino = "USD";
                        System.out.println("Ingresa la cantidad en Pesos Argentinos:");
                        cantidadUSD = scanner.nextDouble();
                    case 3:
                        monedaDestino = "COP";
                        System.out.println("Ingrese la cantidad en USD:");
                        cantidadUSD = scanner.nextDouble();
                    case 4:
                        monedaDestino = "USD";
                        System.out.println("Ingrese la cantidad en Peso Colombiano:");
                        cantidadUSD = scanner.nextDouble();
                    case 5:
                        monedaDestino = "BRL";
                        System.out.println("Ingrese la cantidad en USD:");
                        cantidadUSD = scanner.nextDouble();
                    case 6:
                        monedaDestino = "BRL";
                        System.out.println("Ingrese la cantidad en Real Brasileño:");
                        cantidadUSD = scanner.nextDouble();
                    case 7:
                        System.out.println("Gracias por usar el mejor conversor, Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción inválida, por favor ingrese una opción válida (1-7).");
                }
                double cantidadConvertida = 0;
                try {
                    cantidadConvertida = Conversor.convertirMoneda(cantidadUSD, monedaDestino);
                    System.out.println("Cantidad convertida a " + monedaDestino + ":" + cantidadConvertida);
                } catch (IOException e) {
                    System.out.println("error al obtener tasa de cambio:" + e.getMessage());
                }


                Repositorio repositorio = new Repositorio();
                repositorio.guardarConversion(monedaDestino, cantidadConvertida);
                System.out.println("Cantidad convertida a" + monedaDestino + ":" + cantidadConvertida);

            }
                }


}



