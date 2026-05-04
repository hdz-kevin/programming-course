package Ejercicios;

public class EdadPerroAHumanoSolucion {

    /**
     * Calculadora de Edad de Perro
     * 
     * Crea un programa que convierta la edad de un perro a "años humanos".
     * Se dice que 1 año de perro equivale a 7 años humanos.
     * Al final imprime un mensaje de resultado con el siguiente formato:
     *
     * "<edadPerro> años Perro equivalen a <edadHumano> años Humano"
     * 
     */


    public static void main(String[] args) {

        int edadPerro = 10;
        int edadHumano = edadPerro * 7;
        String mensajeResultado = edadPerro + " años Perro eqivalen a " + edadHumano + " años Humano";

        System.out.println(mensajeResultado);

    }

}
