package Ejercicios;

import java.util.Scanner;

public class CastingEjemplo {

    public static void main(String[] args) {
        // Inicar scanner
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir las calificaciones y convertirlas a tipo double
        String numeroEntrada = scanner.nextLine();
        double cal1 = Double.parseDouble(numeroEntrada);

        double cal2 = Double.parseDouble(scanner.nextLine());
        double cal3 = Double.parseDouble(scanner.nextLine());
        double cal4 = Double.parseDouble(scanner.nextLine());
        double cal5 = Double.parseDouble(scanner.nextLine());

        int numeroCalificaciones = 5;
        double calificacionMinima = 6.0;
        String resultado;

        // 2. Sacar promedio
        double promedio = (cal1 + cal2 + cal3 + cal4 + cal5) / numeroCalificaciones;

        resultado = "Promedio: " + promedio + " ";

        // 3. Comprobar se está aprobado o reprobado
        if (promedio >= calificacionMinima) {
            resultado = resultado + "Felicidades, Aprobado!";
        } else {
            resultado += "Reprobado :(";
        }

        // Hacer la comprobación usando el operador ternario
        resultado += (promedio >= calificacionMinima) ? "Aprobado" : "Reprobado";

        // Imprimir resultado
        System.out.println(resultado);

        /** 
         * Operador ternario
         * 
         * condicion ? "True" : "False"
         */

        int edad = 17;
        String mayorOMenor = edad >= 18 ? "Mayor" : "Menor";
        System.out.println(mayorOMenor);

        if (edad >= 18) {
            mayorOMenor = "Mayor";
        } else {
            mayorOMenor = "Menor";
        }
    }
}
