public class App {
    public static void main(String[] args) throws Exception {
        String curso = "Programación Java"; // recomendada
        String curso2 = new String("programación JAVA"); // poco usada

        // compara si los dos Strings apuntan al mismo objeto en memoria
        System.out.println(curso == curso2); // false


        System.out.println(curso.equals(curso2));
        System.out.println(curso.equalsIgnoreCase(curso2));

        // compara si ambos strings tienen el mismo valor y la misma capitalización
    }
}
