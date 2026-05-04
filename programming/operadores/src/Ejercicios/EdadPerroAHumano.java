package Ejercicios;

/**
 * Calculadora de Edad de Perro
 * 
 * Crea un programa que convierta la edad de un perro a "años humanos".
 * Se dice que 1 año de perro equivale a 7 años humanos.
 *
 * Imprime un mensaje de resultado con el siguiente formato:
 *
 * "<edadPerro> años Perro equivalen a <edadHumano> años Humano"
 */

public class EdadPerroAHumano {

    public static void main(String[] args) {
        // Crear variables
        int edadPerro = 3;
        int factorEdad = 7;

        // Calcular/Convertir a edad humano
        int edadHumano = edadPerro * factorEdad;

        // Concatenar mensaje e imprimirlo
        String mensaje = edadPerro + " años Perro equivalen a " + edadHumano + " años Humano";
        System.out.println(mensaje);
    }

}
