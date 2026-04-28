package Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        /**
         * Crea un programa que declare variables para el nombre de un producto,
         * su precio y si está disponible.
         * 
         * Ejemplo de resultado:
         * 
         * "Teclado gamer | $100.5 | Disponible/No Disponible"
         * 
         */

        String nombre = "Teclado Gamer";
        double precio = 100.5;
        boolean estaDisponible = false;

        String resultado = nombre + " | " + precio + " | ";

        if (estaDisponible) {
            resultado = resultado + "Disponible";
        } else {
            resultado = resultado + "No Disponible";
        }

        System.out.println(resultado);
    }
}
