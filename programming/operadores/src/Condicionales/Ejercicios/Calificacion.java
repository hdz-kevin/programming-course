package Condicionales.Ejercicios;

import java.util.Scanner;

public class Calificacion {

    /**
     * Declara tres variables para tres notas de un examen (ej. nota1, nota2, nota3).
     * Calcula el promedio.
     * 
     * promedio = (nota1 + nota2 + nota3) / 3
     * 
     * Si el promedio es mayor o igual a 6.0, imprime "Aprobado", si no, "Reprobado".
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingresa la nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingresa la nota 3: ");
        double nota3 = scanner.nextDouble();

        // Calcular promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

    }

}
