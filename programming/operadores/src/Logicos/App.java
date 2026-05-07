package Logicos;

public class App {

    /**
     * Operadores Lógicos
     * 
     * Los operadores lógicos permiten combinar múltiples condiciones en una sola expresión,
     * devolviendo true si la expresión completa se cumple y false si no se cumple.
     * Son esenciales para tomar decisiones más complejas.
     * 
     * Tipos de operadores lógicos:
     *     &&  ->  AND    Ambas condiciones deben ser verdaderas para que la expresión sea verdadera
     *     ||  ->  OR     Al menos una condición debe ser verdadera para que la expresión sea verdadera
     *     !   ->  NOT    Invierte el valor de la condición
     */

    public static void main(String[] args) {

        /**
         * Operador AND (&&)
         * 
         * Devuelve true SOLO si AMBAS condiciones son verdaderas.
         * Si una de las dos es falsa, el resultado es false.
         * 
         * Tabla de verdad:
         *  true && true    => true
         *  true  && false  => false
         *  false && true   => false
         *  false && false  => false
         */


        boolean a = false;
        boolean b = true;

        if (a && b) {
            System.out.println("Ambas son verdaderas");
        } else {
            System.out.println("La expresion no se cumple, no son verdaderas todas");
        }


        // Verificar si una persona puede entrar a un bar
        // Debe ser mayor de edad Y tener identificación
        int edad = 20;
        boolean tieneIdentificacion = true;

        if (edad >= 18 && tieneIdentificacion == true) {
            System.out.println("Puedes entrar al bar");
        } else {
            System.out.println("No puedes entrar al bar");
        }


        // Verificar si un número está en un rango
        // El número debe ser mayor que 10 Y menor que 20
        int numero = 10;

        if (numero > 10 && numero < 20) {
            System.out.println(numero + " está entre 10 y 20");
        } else {
            System.out.println(numero + " NO está entre 10 y 20");
        }


        // Comprobar que un numero es par y mayor que 10
        // num % 2 == 0

        numero = 10;

        if (numero % 2 == 0 && numero > 10) {
            System.out.println(numero + " es para y mayor que 10");
        } else {
            System.out.println(numero + " no es par o no es mayor que 10");
        }


        /**
         * Comprobar que un numero cumpla las siguientes condiciones:
         * Divisible entre 10
         * Divisible entre 20
         * Mayor o igual a 500
         */

        numero = 100;


        if (numero % 10 == 0 && numero % 20 == 0 && numero >= 500) {
            System.out.println("El numero cumple con las condiciones");
        } else {
            System.out.println("El numero cumple con alguna de las condiciones");
        }



        System.out.println("\n================================\n");


        /**
         * Operador OR (||)
         * 
         * Devuelve true si AL MENOS UNA de las condiciones es verdadera.
         * Solo devuelve false si AMBAS condiciones son falsas.
         * 
         * Tabla de verdad:
         *  true  || true   = true
         *  true  || false  = true
         *  false || true   = true
         *  false || false  = false
         */


        // Ejemplo básico
        boolean c = false;
        boolean d = false;

        if (c == true || d == true) {
            System.out.println("Una o ambas son verdaderas");
        } else {
            System.out.println("Ambas son falsas");
        }

    

        // Verificar si un estudiante aprobó
        // Puede aprobar si su examen final es mayor a 60
        // O su promedio de tareas es mayor a 80
        int examenFinal = 70;
        int promedioTareas = 90;

        if (examenFinal > 60 || promedioTareas > 80) {
            System.out.println("El estudiante aprobó");
        } else {
            System.out.println("El estudiante reprobó");
        }




        // Ejemplo: Verificar si es fin de semana dia.equalsIgnoreCase("")
        String dia = "Sabado";

        if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo")) {
            System.out.println("Es fin de semana");
        } else {
            System.out.println("Es dia habil");
        }


        System.out.println("\n================================\n");



        /**
         * Operador NOT (!)
         * 
         * Operador de negación.
         * Invierte el valor de una condición.
         * Si es true, se convierte a false y si es false, se convierte a true.
         * 
         * Tabla de verdad:
         *  !true  = false
         *  !false = true
         */


        boolean estaLloviendo = true;
        System.out.println("estaLloviendo: " + !estaLloviendo);


        // Verificar si NO está lloviendo
        if (!estaLloviendo) {
            System.out.println("No está lloviendo, vamos al parque!");
        } else {
            System.out.println("Nos quedamos en casa viendo pelis");
        }


        // Verificar si un usuario NO está bloqueado
        boolean estaBloqueado = false;

        if (!estaBloqueado) {
            System.out.println("Bienvenido al sistema");
        }


        // Verificar si un producto NO está agotado para poder comprarlo
        boolean agotado = false;

        if (!agotado) { // agotado == false // no agotado?
            System.out.println("Producto disponible, puedes comprarlo");
        } else {
            System.out.println("Producto agotado");
        }


        System.out.println("\n================================\n");


        /**
         * Podemos combinar varios operadores lógicos en una sola expresión
         * para crear condiciones más complejas.
         * 
         * Nota: Se recomienda usar paréntesis para hacer las expresiones más claras
         * 
         * Prioridad de operadores:
         *  1. !   (NOT)  - Se evalúa primero
         *  2. &&  (AND)  - Se evalúa segundo
         *  3. ||  (OR)   - Se evalúa al final
         */



        // Sistema de descuento
        // Tiene descuento si: es cliente frecuente o (su compra es mayor a $500 Y tiene cupón)
        boolean esClienteFrecuente = true;
        double totalCompra = 500;
        boolean tieneCupon = true;

        if ((totalCompra > 500 && tieneCupon == true) || esClienteFrecuente == true) {
            System.out.println("Tienes descuento!");
        } else {
            System.out.println("No aplica descuento");
        }


        // Verificar si una persona puede solicitar un préstamo
        // Debe: ser mayor de 18, tener empleo Y NO tener deudas pendientes
        int edadCliente = 25;
        boolean tieneEmpleo = true;
        boolean tieneDeudas = false;

        if (edadCliente > 18 && tieneEmpleo && !tieneDeudas) {
            System.out.println("Descuento Aprobado!");
        } else {
            System.out.println("Descuente NO Aprobado");
        }



        // Verificar si una persona puede subirse a una montaña rusa
        // Debe: tener al menos 10 años Y medir al menos 1.40m
        int edadVisitante = 12;
        double estatura = 1.50;

        if (edadVisitante >= 10 && estatura >= 1.40) {
            System.out.println("Puedes subirte a la montaña rusa!");
        } else {
            System.out.println("No cumples los requisitos para la montaña rusa");
        }


        // Verificar si un pedido califica para envío gratis
        // Envío gratis si: el total es mayor a $300 O el usuario es premium
        double totalPedido = 150;
        boolean esPremium = true;

        if (totalPedido > 300 || esPremium) {
            System.out.println("Tu pedido tiene envío gratis!");
        } else {
            System.out.println("El envío tiene un costo adicional");
        }
    }

}
