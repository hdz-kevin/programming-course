package Ejercicios;

public class PorcentajeSolucion {

    /**
     * Cuánto es X por ciento de X número?
     * 
     * Calcula a cuánto equivale el X por ciento de X número.
     * Puedes usar la siguiente fórmula: 
     * 
     * numero * (porcentaje / 100)
     * 
     * Al final imprime un mensaje de resultado con el siguiente formato:
     *
     * "El <porcentaje>% de <numero> es: <resultado>"
     */

    public static void main(String[] args) {
        
        double porcentaje = 25;
        double numero = 150;
        double resultado = numero * (porcentaje / 100);

        System.out.println("El " + porcentaje + "% de " + numero + ": " + resultado);

        System.out.println(resultado * 100 / porcentaje);
    }
}
