package Repositorio;

import java.util.HashMap;
import java.util.Map;

public class Repositorio {
    private Map<String, Double> conversiones;
    public Repositorio(){
        this.conversiones = new HashMap<>();
    }
    public void guardarConversion (String monedaDestino, double cantidadConvertida){
        conversiones.put(monedaDestino, cantidadConvertida);
        
    }
    public double obtenerConversion (String monedaDestino){
        Double orDefault = conversiones.getOrDefault(monedaDestino,0.0);
        return orDefault;
    }
    
}
