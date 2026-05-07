package Ejercicios;

import java.util.Scanner;

public class RepartiendoPizza {

    /**
     * Repartiendo Pizza
     * 
     * Tenemos una cantidad de rebanadas de pizza y un número de amigos.
     * Queremos saber cuántas rebanadas le tocan a cada uno y cuántas sobran
     * en la caja para el desayuno.
     * 
     * Por ejemplo:
     * Para 10 rebanadas y 3 amigos, a cada uno le tocan 3 rebanadas y sobra 1
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero de rabanadas: ");
        int rebanadas = scanner.nextInt();
        System.out.print("Cuanto amigos son? ");
        int amigos = scanner.nextInt();

        int rebanadasPorAmigo = rebanadas / amigos;
        int rebanadasRestantes = rebanadas % amigos;

        String mensaje = "\nPara " + rebanadas + " rebanadas y " + amigos +
            " amigos, a cada uno le tocan " + rebanadasPorAmigo + " rebanadas" + 
            " y sobran " + rebanadasRestantes + " rebanadas";

        System.out.println(mensaje);
    }
}
