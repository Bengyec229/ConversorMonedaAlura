import java.util.Scanner;

public class ConversorDeMonedaAlura {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        int opcion;
        int continuar;
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

        System.out.println(menu);
        System.out.println("Elija la Conversion que desea realizar de cuerdo al menú");
        opcion = scaner.nextInt();
        
        switch (opcion){
            case 1:

        }

    }
}
