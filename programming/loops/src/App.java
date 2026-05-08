public class App {

    /**
     * Estructuras de control iterativas (Bucles / Loops)
     * 
     * Los bucles son estructuras de control que permiten repetir un bloque de código
     * múltiples veces mientras se cumpla una condición.
     * 
     * Tipos de bucles:
     *  - while       -> Repite mientras la condición sea verdadera
     *  - do while    -> Ejecuta al menos una vez, luego repite mientras la condición sea verdadera
     *  - for         -> Repite un número determinado de veces
     */

    public static void main(String[] args) {

        /**
         * Bucle while
         * 
         * Repite un bloque de código MIENTRAS la condición sea verdadera.
         * Primero evalúa la condición y luego ejecuta el bloque.
         * 
         * while (condicion) {
         *  # Bloque de código a ejecutar mientras la condición sea verdadera
         * }
         * 
         */




        // Contador del 1 al 5
        // Variable de contro
        int contador = 1;

        // condicion para que se siga ejecutando
        while (contador <= 5) {
            System.out.println("Contador: " + contador);

            // incrementar variable de control
            // contador = contador + 1;
            contador += 1;
        }



        // Cuenta regresiva del 10 al 1
        contador = 100;

        while (contador >= 1) {
            System.out.println("Cuenta regresiva: " + contador);
            contador -= 10; // contador = contador - 10;
        }




        // Sumar los numeros del 1 al 10
        int suma = 0;
        contador = 1;

        while (contador <= 10) {
            suma += contador;  // suma = suma + contador;
            contador += 1;  // contador = contador + 1;
        }


        System.out.println("La suma del 1 al 10 es: " + suma);


        // Imprimir solo números pares del 1 al 20
        int n = 1;

        while (n <= 20) {
            if (n % 2 == 0) {
                System.out.println(n + " es par");
            } else {
                System.out.println(n + " es impar");
            }

            n += 1;
        }




        System.out.println("\n================================\n");


        /**
         * Bucle do-while
         * 
         * Primero EJECUTA el bloque de código y DESPUÉS evalúa la condición.
         * Esto garantiza que el bloque se ejecute AL MENOS UNA VEZ.
         * 
         * do {
         *  # Bloque de código que se ejecuta al menos una vez
         * } while (condicion);
         * 
         */


        // Contar del 1 al 5 con do-while
        int contadorDo = 100;

        do {
            System.out.println("Contador: " + contadorDo);

            contadorDo++;
        } while (contadorDo <= 5);



        // Diferencia entre while y do-while
        // // Cuando la condición es falsa desde el inicio

        // Con while: NO se ejecuta el bloque
        int x = 10;

        while (x < 5) {
            System.out.println("Nunca se ejecutará");
            x++;
        }

        // Con do-while: SÍ se ejecuta el bloque al menos una vez
        int y = 10;

        do {
            System.out.println("Se ejecuta al menos una vez, y = " + y);
            y++;
        } while (y < 5);



        System.out.println("\n================================\n");

        
        
        /**
         * Bucle for
         * 
         * Es el bucle más utilizado cuando sabemos cuántas veces queremos repetir algo.
         * Combina la inicialización, condición e incremento en una sola línea.
         * 
         * for (inicializacion; condicion; incremento) {
         *  # Bloque de código a repetir
         * }
         * 
         * Partes del for:
         *  1. Inicialización -> Se ejecuta UNA sola vez al inicio (int i = 0)
         *  2. Condición      -> Se evalúa ANTES de cada iteración (i < 10)
         *  3. Ejecucion      -> Se ejecuta el bloque de código
         *  4. Incremento     -> Se ejecuta DESPUÉS de cada iteración (i++)
         */


        // Contar del 1 al 5
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }

            System.out.println("Contador for: " + i);
        }



        // Contar del 10 al 1 (decremento)
        for (int i = 10; i >= 1; i--) {
            System.out.println("Cuenta regresiva for: " + i);
        }



        // Tabla de multiplicar del 5
        int tabla = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }



        // Sumar los números del 1 al 100
        int sumaFor = 0;

        for (int i = 1; i <= 100; i++) {
            sumaFor += i;
        }
        System.out.println("La suma del 1 al 100 es: " + sumaFor);



        // Imprimir solo números impares del 1 al 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Impar: " + i);
            }
        }


        // Incrementar de 2 en 2
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("De 2 en 2: " + i);
        }


        System.out.println("\n================================\n");


        /**
         * Sentencia break
         * 
         * La sentencia break permite SALIR del bucle inmediatamente,
         * sin importar si la condición aún es verdadera.
         */


        // Buscar un número en una secuencia
        for (int i = 1; i <= 100; i++) {
            if (i == 15) {
                System.out.println("El número es 15, saliendo del bucle...");
                break; // Rompe el bucle inmediatamente
            }
            System.out.println("Numero: " + i);
        }


        // Buscar el primer número divisible entre 7 y 3
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i % 3 == 0) {
                System.out.println("Primer número divisible entre 7 y 3: " + i);
                break;
            }
        }


        System.out.println("\n================================\n");


        /**
         * Sentencia continue
         * 
         * La sentencia continue permite SALTAR la iteración actual
         * y continuar con la siguiente iteración del bucle.
         * 
         * Es útil cuando queremos omitir ciertos valores sin detener el bucle.
         */


        // Ejemplo: Imprimir todos los números del 1 al 10, excepto el 5
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                continue; // Salta esta iteración, no imprime el 5
            }
            System.out.println("Número: " + j);
        }


        // Ejemplo: Imprimir solo números que NO sean divisibles entre 3
        for (int j = 1; j <= 20; j++) {
            if (j % 3 == 0) {
                continue; // Salta los múltiplos de 3
            }
            System.out.println("No divisible entre 3: " + j);
        }


        System.out.println("\n================================\n");


        /**
         * Bucles anidados
         * 
         * Podemos tener un bucle dentro de otro bucle.
         * Por cada iteración del bucle externo, el bucle interno se ejecuta completamente.
         * 
         * for (int i = 0; i < n; i++) {
         *     for (int j = 0; j < m; j++) {
         *         # Este bloque se ejecuta n * m veces
         *     }
         * }
         * 
         */


        // Ejemplo: Tablas de multiplicar del 1 al 3
        for (int t = 1; t <= 3; t++) {
            System.out.println("--- Tabla del " + t + " ---");
            for (int j = 1; j <= 10; j++) {
                System.out.println(t + " x " + j + " = " + (t * j));
            }
            System.out.println(); // Línea en blanco entre tablas
        }


        // Ejemplo: Dibujar un rectángulo con asteriscos
        // 3 filas x 5 columnas
        int filas = 3;
        int columnas = 5;

        for (int f = 1; f <= filas; f++) {
            for (int c = 1; c <= columnas; c++) {
                System.out.print("* ");
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }


        // Ejemplo: Dibujar un triángulo con asteriscos
        int alturaTriangulo = 5;

        for (int fila = 1; fila <= alturaTriangulo; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("\n================================\n");


        /**
         * Ejemplos prácticos combinando bucles con lo aprendido anteriormente
         */


        // Verificar si un número es primo
        // Un número primo solo es divisible entre 1 y él mismo
        int numeroPrimo = 17;
        boolean esPrimo = true;

        for (int j = 2; j < numeroPrimo; j++) {
            if (numeroPrimo % j == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo && numeroPrimo > 1) {
            System.out.println(numeroPrimo + " es primo");
        } else {
            System.out.println(numeroPrimo + " no es primo");
        }


        // Calcular el factorial de un número
        // Factorial de 5 = 5 * 4 * 3 * 2 * 1 = 120
        n = 5;
        int factorial = 1;

        for (int j = n; j >= 1; j--) {
            factorial *= j; // factorial = factorial * j
        }

        System.out.println("El factorial de " + n + " es: " + factorial);


        // Contar cuántos números pares hay entre 1 y 50
        int contadorPares = 0;

        for (int j = 1; j <= 50; j++) {
            if (j % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Hay " + contadorPares + " números pares entre 1 y 50");


        // Encontrar el número mayor en una serie
        int[] numeros = {45, 12, 78, 34, 90, 23, 56};
        int mayor = numeros[0];

        for (int j = 1; j < numeros.length; j++) {
            if (numeros[j] > mayor) {
                mayor = numeros[j];
            }
        }

        System.out.println("El número mayor es: " + mayor);
    }

}
