package Ejercicios;

public class Porcentaje {

    /**
     * Cuánto es X por ciento de X número?
     * 
     * Calcula a cuánto equivale el X por ciento de X número.
     *
     * Puedes usar la siguiente fórmula:
     * numero * (porcentaje / 100)
     * 
     * Imprime un mensaje de resultado con el siguiente formato:
     *
     * "El <porcentaje>% de <numero> es: <resultado>"
     */


    public static void main(String[] args) {
        int numero = 230;
        double porcentaje = 23;

        double resultado = numero * (porcentaje / 100);

        System.out.println("El " + porcentaje + "% de " + numero + " es: " + resultado);
    }
}
