import Repositorio.Repositorio;

import java.util.Scanner;

public class Principal {
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
                try {
                    double Scanner = 0;
                    double cantidadUSD = Scanner;
                    String monedaDestino = "moneda";
                    double cantidadConvertida = Conversor.convertirMoneda(cantidadUSD,monedaDestino);
                    Repositorio repositorio = new Repositorio();
                    repositorio.guardarConversion(monedaDestino,cantidadConvertida);
                    System.out.println("Cantidad convertida a" + monedaDestino + ":" + cantidadConvertida);
                    
                } catch (Exception e) {
                    System.out.println("Error al obtener la tasa de cambio"); e.printStackTrace();
                }


            }


        }
    }