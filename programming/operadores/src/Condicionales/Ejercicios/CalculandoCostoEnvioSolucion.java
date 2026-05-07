package Condicionales.Ejercicios;

public class CalculandoCostoEnvioSolucion {

    /**
     * Calculadora de Costos de Envío
     * 
     * Crea un programa que calcule el costo de envío de un paquete basándose en la region de envío.
     * 
     * - Si la region es "Norte", el costo es de $100
     * - Si la region es "Centro", el costo es de $70
     * - Si la region es "Sur", el costo es de $120
     * - Cualquier otra region, imprimir "Destino no disponible"
     * 
     * Imprime el costo de envío con el siguiente formato:
     * 
     * "Para la region <region> el costo de envío es: $<costo>"
     */

    public static void main(String[] args) {
        String region = "Norte";
        double costo = 0;

        if (region.equals("Norte")) {
            costo = 100;
        } else if (region.equals("Centro")) {
            costo = 70;
        } else if (region.equals("Sur")) {
            costo = 120;
        } else {
            System.out.println("Destino no disponible");
        }

        if (costo != 0) {
            System.out.println("Para la region " + region + " el costo de envío es: " + costo);
        }
    }
     
}
