public class CastingPrimitivos {
    public static void main(String[] args) {
        
        /** Conversión Implícita (Implicit Cast)
         * 
         * Ocurre cuando convertimos un tipo de dato a otro más grande.
         * No hay pérdida de información.
         * 
         * Orden de menor a mayor tamaño:
         * byte -> short -> int -> long -> float -> double
        */

        /** byte to short */
        byte numByte = 127;
        short byteToShort = numByte;
        byteToShort = 2000;

        System.out.println(byteToShort);

        /** int to long */
        int numInt = 32000;
        long intToLong = numInt;
        System.out.println(intToLong);

        /** long to float */
        long numLong = 933333333333L; 
        float longToFloat = numLong;
        System.out.println(longToFloat);

        /** float to double */
        float numFloat = 23.45F;
        double floatToDouble = numFloat;
        System.out.println(floatToDouble);


        /** Conversión Explícita (Explicit Cast)
         * 
         * Ocurre cuando queremos convertir un tipo de dato grande o uno más pequeño
         * Puede haber pérdida de información, por lo que Java nos obliga a escribir
         * el tipo de dato entre paréntesis.
         * 
        */

        /** long to int */
        long numeroLong = 93322323;
        int longToInt = (int) numLong;

        /** int to short */
        int numeroInt = 20000;
        short intToShort = (short) numInt;

        /** double to float */
        double numeroDouble = 34.6;
        float doubleToFloat = (float) numeroDouble;

        

        /** Desbordamiento (Overflow)
         * 
         * Si intentamos forzar un número muy grande a un tipo de dato más pequeño,
         * el número "vuelve" al inicio del rango (los bits se "truncan").
        */

        // byte -128 <-> 127
        
        int i = 130; // -128, -127, -126
        byte b = (byte) i;
        System.out.println(b); // -126
    }
}
