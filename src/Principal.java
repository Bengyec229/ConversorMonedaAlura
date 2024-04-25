import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        String menu = """ 
                Bienvenido al Conversor de Moneda de Benjamin Pantoja
                +*******************************************************
                *** Que tipo de Converion desea realizar ***
                        1.- de ARS a DOLAR
                        2.- de DOLAR a ARS
                        3.- de BRL a DOLAR
                        4.- de DOLAR a BRL
                        5.- de COP a DOLAR
                        6.- de DOLAR a COP
                        7.- SALIR """;

        do {
            System.out.println(menu);
            System.out.println("Elija la Conversion que desea realizar de cuerdo al menú");
            opcion = scanner.nextInt();


            if (opcion >= 1 && opcion <= 6) {
                convertirMoneda(opcion, scanner);
                System.out.println("Quiere seguir Convirtiendo? ");
                System.out.println("1-si");
                System.out.println("2-no");
                int continuar = scanner.nextInt();
                if (continuar != 1) {
                    System.out.println("Gracias por usar el conversor de monedas.");
                    break;
                }
            } else if (opcion == 7) {
                System.out.println("Gracias por usar el conversor de monedas.");
                break;
            } else {
                System.out.println("Opción no válida, por favor elija una opción del menú.");
            }
        } while (true);

        scanner.close();

        }

    private static void convertirMoneda(int opcion, Scanner scanner) {
        String deDivisa = null;
        String aDivisa = null;

        switch (opcion){
            case 1:
                deDivisa = "ARS";
                aDivisa = "USD";
                break;
            case 2:
                deDivisa = "USD";
                aDivisa = "ARS";
                break;
            case 3:
                deDivisa = "BRL";
                aDivisa = "USD";
                break;
            case 4:
                deDivisa = "USD";
                aDivisa = "BRL";
                break;
            case 5:
                deDivisa = "COP";
                aDivisa = "USD";
                break;
            case 6:
                deDivisa = "USD";
                aDivisa = "COP";
                break;
            case 7:
                break;

        }
        if ((deDivisa != null) && aDivisa !=null){
            System.out.println("Ingrese el monto a calcular:");
            double cantidad = scanner.nextDouble();
            Conversor conversor = new Conversor(deDivisa, aDivisa, cantidad);

            try {
                double resultado = conversor.convertir();
                System.out.println(cantidad+""+ deDivisa + "equivale" + resultado + "" + aDivisa );
            } catch (IOException | InterruptedException e) {
                System.out.println("Error al realizar la conversión" + e.getMessage());;
            }
        }
    }
}


