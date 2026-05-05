public class Arimeticos {
    public static void main(String[] args) {
        
        /**
         * Operadores ariméticos
         *
         *  +  ->  Suma
         *  -  ->  Resta
         *  *  ->  Multiplicacion
         *  /  ->  Division
         *  %  ->  Módulo  // Devuelve el residuo de una division entera
         * 
         * Ejemplo:
         * 
         * a = 10 % 3 == 1
        */

        int num1 = 12;
        int num2 = 5;

        int suma = num1 + num2;
        System.out.println("Suma: " + suma);
 
        int resta = num1 - num2;
        System.out.println("Resta: " + resta);
 
        int mult = num1 * num2;
        System.out.println("Multiplicacion: " + mult);
 
        double div = (double) num1 / num2;
        System.out.println("Division: " + div);

        int residuo = num1 % num2;   //  12 % 5
        System.out.println("Residuo: " + residuo);
    }
}
