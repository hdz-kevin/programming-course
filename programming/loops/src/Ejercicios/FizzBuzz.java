package Ejercicios;

public class FizzBuzz {

    /**
     * FizzBuzz
     * 
     * El programa debe imprimir los números del 1 al 100, pero con tres condiciones especiales:
     * 
     * Si el número es divisible por 3, en lugar del número se imprime la palabra "Fizz".
     * Si el número es divisible por 5, se imprime la palabra "Buzz".
     * Si el número es divisible por 3 y por 5 a la vez, se imprime "FizzBuzz".
     * Si no cumple ninguna de las anteriores, simplemente se imprime el número.
     */

    public static void main(String[] args) {
        int num = 1;

        while (num <= 100) {
            if (num % 3 == 0 && num % 5 == 0)
                System.out.println("FizzBuzz");
            else if (num % 3 == 0)
                System.out.println("Fizz");
            else if (num % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(num);

            num += 1;
        }

    }
}
