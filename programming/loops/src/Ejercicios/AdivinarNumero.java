package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {

    /**
     * Adivina el número
     * 
     * Crea un programa que genere un número aleatorio entre 1 y 100.
     * Mientras el usuario no adivine el número, se le debe preguntar de nuevo.
     * El programa debe indicar si el número es mayor o menor al número generado.
     * Si el usuario acierta, mostrar un mensaje de felicitación.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numSecreto = random.nextInt(100 + 1);
        int numIngresado = 0;
        int intentos = 0;
        int intentosPermitidos = 10;
        int intentosRestantes = intentosPermitidos;

        System.out.println("\n============================================");
        System.out.println("     ADIVINA EL NUMERO SECRETO SI PUEDES    ");
        System.out.println("============================================");
        System.out.println("\nIntentos Permitidos: " + intentosPermitidos);

        while (numIngresado != numSecreto) {
            // Pedir numero
            System.out.print("\nAdivina el numero: ");
            numIngresado = scanner.nextInt();

            if (numIngresado == numSecreto) {
                System.out.println("\nFelicidades Adivinaste el numero: " + numSecreto);
            } else if (numIngresado > numSecreto) {
                System.out.println(numIngresado + " es mayor que el numero secreto");
            } else if (numIngresado < numSecreto) {
                System.out.println(numIngresado + " es menor que el numero secreto");
            }

            intentos++;
            intentosRestantes = intentosPermitidos - intentos;

            if (intentosRestantes == 0) {
                System.out.println("Intentos agotados :(");
                break;
            }

            System.out.println("Intentos restantes: " + intentosRestantes);
        }

        if (numIngresado == numSecreto) {
            System.out.println("Intentos: " + intentos);
        }
    }
}
