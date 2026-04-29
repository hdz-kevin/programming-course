public class StringMethods {
    public static void main(String[] args) {
        String text = "    Programacion Java    ";

        /** int length();
         * 
         * Devuelve el número de caracters que contiene una cadena
         */
        int length = text.length();
        System.out.println(length);


        /** boolean isEmpty();
         * 
         * Devuelve true si la cadena está vacia y false si no está vacia
         */
        boolean estaVacia = text.isEmpty();
        System.out.println(estaVacia);
        

        /** char charAt(int index);
         * 
         * Devuelve el carácter en un índice específico (los índices empiezan en 0)
         */
        char c = text.charAt(3);
        System.out.println(c);


        /** boolean contains(CharSequence s);
         * 
         * Verifica si una secuencia de caracteres está dentro de la cadena original
         */
        boolean b = text.contains("Java"); 
        System.out.println(b);


        /** boolean equals(Object anObject)
         * 
         * Compara si dos cadenas son exactamente iguales.
         */
        boolean esIgual = text.equals("Programacion java");
        System.out.println(esIgual);
        
        
        /** boolean equalsIgnoreCase(String anotherString)
         * 
         * Compara si dos cadenas son iguales ignorando si hay mayúsculas o minúsculas.
         */
        esIgual = text.equalsIgnoreCase("programacion java");
        System.out.println(esIgual);


        /** String toLowerCase() y String toUpperCase()
         * 
         * Convierte todo el texto a minúsculas o mayúsculas.
         */
        String minusculas = text.toLowerCase();
        System.out.println(minusculas);
        
        String mayusculas = text.toUpperCase();
        System.out.println(mayusculas);


        /** String trim()
         * 
         * Elimina los espacios en blanco al principio y al final.
         */
        String clean = text.trim();
        System.out.println(clean);
        System.out.println(text);


        /** String replace(char old, char new)
         *  String replace(CharSequence target, CharSequence replacement)
         *
         * Intercambia un carácter por otro o una secuencia de caracteres por otra
         */
        


        /** String substring(int beginIndex)
         *  String substring(int beginIndex, int endIndex)
         * 
         * Extrae una parte de la cadena.
         * Nota: beginIndex se incluye y endIndex se excluye
         */ 



        /** int indexOf(String str)
         *
         * Devuelve la posición de la primera vez que aparece un texto. Si no lo encuentra, devuelve -1.
         */



        /** boolean startsWith(String prefix)
         *  boolean endsWith(String suffix)
         *
         * Comprueba si el texto empieza o termina con una subcadena específica.
         */
    }
    
}
