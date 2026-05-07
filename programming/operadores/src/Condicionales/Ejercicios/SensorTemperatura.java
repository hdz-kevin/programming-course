package Condicionales.Ejercicios;

public class SensorTemperatura {
    
    /**
     * Simula un sensor de una máquina.
     * 
     * Si la temperatura es menor a 10, imprime "Alerta: Temperatura muy baja".
     * 
     * Si la temperatura esta entre 10 y 30, imprime "Temperatura normal".
     * 
     * Si la temperatura es mayor a 30, imprime "Alerta: Sobrecalentamiento"
     */


    public static void main(String[] args) {

        int temperatura = 50;
        
        if (temperatura < 10) {
            System.out.println("Alerta: Temperatura muy baja");
        } else if (temperatura <= 30) {
            System.out.println("Temperatura normal");
        } else {
            System.out.println("Alerta: Sobrecalentamiento");
        }
        
    }

}
