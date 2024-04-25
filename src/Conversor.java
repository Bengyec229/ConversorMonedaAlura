import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
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

                String menu = """
                        ***********************************************
                          Cual es la Conversion que desea realizar:
                          1.- De USD a PesoArgentino
                          2.- De Peso Argentino a USD
                          3.- De USD a Real Brasileño
                          4.- De Real Brasileño a USD
                          5.- De USD a Peso Colombiano
                          6.- De Peso Colombiano A USD
                          7.- Salir
                          
                          
                \n******************************************
                        """;
                Scanner scanner = new Scanner(System.in);
                int opcion = scanner.nextInt(); scanner.nextLine();
                if (opcion == 7);{
                    System.out.println("Gracias por usar el mejor conversor, hasta luego");
                }
                System.out.println("ingresa la cantidad a convertir");
                double cantidad = scanner.nextDouble();

                }


        }
    }