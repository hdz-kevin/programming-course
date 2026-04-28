public class CastingCadenasPrimitivos {
    public static void main(String[] args) {
        /**
         * En Java, para realizar estas conversiones, utilizamos principalmente las Clases Envolventes (Wrapper Classes)
         * como Integer, Double o Boolean, las cuales contienen los métodos necesarios para transformar los datos
         */

        /* Primitivo -> String */
        int edad = 25;

        // Opción A: Usando String.valueOf() (La forma más limpia y profesional)
        String textoEdad = String.valueOf(edad);

        // Opción B: Usando el método toString() de la clase envolvente
        String textoEdad2 = Integer.toString(edad);



        /* String -> primitivos */
        String textoEntero = "100";

        // Convertir a int
        int numero1 = Integer.parseInt(textoEntero);


        System.out.println(Boolean.parseBoolean("hola xdddd jajajca")); // false



        // Ejemplo
        String input1 = "10";
        String input2 = "20";

        // Si intentamos sumar Strings: "10" + "20" = "1020" (Concatenación)
        System.out.println("Suma como texto: " + (input1 + input2));

        // Convertimos a enteros para poder sumar matemáticamente
        int n1 = Integer.parseInt(input1);
        int n2 = Integer.parseInt(input2);

        int resultado = n1 + n2;
        System.out.println("Suma real: " + resultado);


        System.out.println("\nEjemplo:");

    }

}
