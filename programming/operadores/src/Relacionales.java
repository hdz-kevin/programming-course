public class Relacionales {

    /**
     * 
     * Operadores relacionales o de comparación
     * 
     * Los operadores relacionales comparan dos valores y devuelven un valor boolean (true o false).
     * Se utilizan mucho en flujos de control, como condicionales y bucles.
     * 
     *  == ->  Igualdad
     *  != ->  Desigualdad
     *  >  ->  Mayor que
     *  <  ->  Menor que
     *  >= ->  Mayor o igual que
     *  <= ->  Menor o igual que
     * 
     *  Ejemplos:
     * 
     *  10 == 10  -> true
     *  10 != 10  -> false
     *  10 > 10   -> false
     *  10 < 10   -> false
     *  10 >= 10  -> true
     *  10 <= 10  -> true
     * 
     */
    
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 10;

        boolean sonIguales = num1 == num2;
        System.out.println("son iguales = " + sonIguales);

        boolean sonDistintos = num1 != num2;
        System.out.println("son distintos = " + sonDistintos);

        boolean num1MayorNum2 = num1 > num2;
        System.out.println("5 es mayor que 10 = " + num1MayorNum2);

        boolean num2MayorNum1 = num2 > num1;
        System.out.println("10 es mayor que 5 = " + num2MayorNum1);

    }
    
}
