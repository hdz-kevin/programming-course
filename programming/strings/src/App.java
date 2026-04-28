public class App {
    public static void main(String[] args) throws Exception {
        String curso = "Programación Java"; // recomendada
        String curso2 = new String("programación JAVA"); // poco usada

        // compara si los dos Strings apuntan al mismo objeto en memoria
        boolean esIgual = (curso == curso2); // false
        System.out.println(esIgual);

        // compara si ambos strings tienen el mismo valor y la misma capitalización
        esIgual = curso.equals(curso2); // true
        System.out.println(esIgual);

        // comparar si ambos strings tienen el mismo valor ignorando mayúsculas y minúsculas
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println(esIgual);

        /**
         * Case Sensitive: Toma en cuenta mayúsculas y minúsculas
         * Case Insensitive: No toma en cuenta mayúsculas y minúsculas
         */



        // Cuando se crean dos variables string de forma literal y con el mismo contenido,
        // Java asigna el mismo objeto o referencia a esas variables, esto ahorra mucha memoria si
        // se usan los mismo strings en el código
        String saludo = "Hola como estas";
        String saludo2 = "Hola como estas";

        System.out.println(saludo == saludo2); // true
        System.out.println(saludo.equals(saludo2)); // true
    }
}
