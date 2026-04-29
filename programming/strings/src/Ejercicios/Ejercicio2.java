package Ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * 2. Declara 5 variables numéricas asignándoles un valor arbitrario a cada una,
         * súmalos y muestra un mensaje con el resultado.
         * Ejemplo: Resultado = 356
         */

        // Declarar las variables que se usarán en el programa
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int suma;
        String mensaje;

        // Inicializar variables que ocuparemos para la suma
        n1 = 10;
        n2 = 15;
        n3 = 18;
        n4 = 26;
        n5 = 50;

        // Hacer la suma y guardar el resultado en la variable "suma" ya declarada en la parte superior
        suma = n1 + n2 + n3 + n4 + n5;

        // Crear el mensaje de resultado como un String y concatenarle el resultado de la suma
        mensaje = "Resultado: " + suma;

        // Imprimir el mensaje de resultado
        System.out.println(mensaje);
    }
}
