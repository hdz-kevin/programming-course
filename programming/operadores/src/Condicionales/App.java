package Condicionales;

public class App {

    /**
     * Estructuras de control
     * 
     * Las estructuras de control son bloques de código que permiten controlar el flujo de un programa.
     * Permiten que el código tome decisiones, repita acciones o bien siga su flujo de ejecución.
     * 
     * Tipos de estructuras de control:
     *  - Secuenciales
    **  - Condicionales
     *  - Iterativas (Bucles)
     * 
     */

    public static void main(String[] args) {

        /**
         * Condicional if
         * 
         * Las condicionales son estructuras de control que permiten que el programa
         * decida qué bloque de código ejecutar en base a ciertas condiciones
         * 
         * if (condicion) {
         *  # Bloque de código a ejecutar si la condicion es verdadera
         * }
         * 
         */


        if (true) {
            System.out.println("La condicion es verdadera");
        }



        int x = 5;

        if (x > 4) {
            System.out.println("x es mayor que 4");
        }


        System.out.println("\n================================\n");


        /**
         * Sentencia else
         * 
         * Opcionalmente, puedes agregar una respuesta else que se ejecutará si la condición es false
         * 
         * if (condicion) {
         *  # Bloque de codigo si la condicion es verdadera
         * } else {
         *  # Bloque de codigo si la condicion es falsa
         * }
         * 
         */

        int y = 3;

        if (y > 4) {
            System.out.println("y es mayor que 4");
        } else {
            System.out.println("y no es mayor que 4");
        }



        int edad = 20;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }


        System.out.println("\n================================\n");


        /**
         * Sentencia else if
         * 
         * Puedes encadenar múltiples condiciones con else if
         * Ten en cuenta de que solo se ejecutara una condicion, la primera que sea verdadera
         * 
         ** if (condicion1) {
         * 
         *  # Bloque de codigo si la condicion1 es verdadera
         * 
         ** } else if (condicion2) {
         * 
         *  # Bloque de codigo si la condicion2 es verdadera
         * 
         ** } else {
         * 
         *  # Bloque de codigo si ninguna condicion es verdadera
         * 
         ** }
         */


        int a = 10;

        if (a > 10) {
            System.out.println("a es mayor que 10");
        } else if (a > 5) {
            System.out.println("a es mayor que 5");
        } else {
            System.out.println("a es menor o igual que 5");
        }

        /**
         * !Nota: Solo se ejecutará la primera condición que se evalúe como true
         * !El else solo se ejecutara si ninguna de las condiciones es verdadera
         */


        edad = 15;

        if (edad < 2) {
            System.out.println("Eres un bebé");
        } else if (edad < 12) {
            System.out.println("Eres un niño");
        } else if (edad < 18) {
            System.out.println("Eres un adolescente");
        } else if (edad < 40) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Estás más pa' ya que pa' ca");
        }





        System.out.println("\n================================\n");


        /**
         * Sentencias if anidadas
         * 
         * Podemos tener sentencias if dentro de otras sentencias if
         * 
         * Tomemos un ejemplo de comprobar que un número que sea par y también mayor que 10
         */

        int numero = 13;

        if (numero % 2 == 0 && numero > 10) {
            if (numero > 10) {
                System.out.println("Es par y mayor que 10");
            } else {
                System.out.println("Es par pero no es mayor 10");
            }
        } else {
            System.out.println("El número no es par");
        }
    }

}
