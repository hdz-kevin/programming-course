public class Variables {

    public static void main(String[] args) {

        String saludo = "Hello ";

        // Pasar una variable a un método
        System.out.println(saludo);

        // Concatenar String
        System.out.println(saludo + "Vadhir".toUpperCase());

        // Importante: Tipos de referencia tienen métodos y propiedades
        // Los primitivos no tienen métodos ni propiedades, son un simple valor

        int numero = 10;
        System.out.println(numero);

        boolean llegaronPuntuales = false;

        int edadPersona = 0;

        if (llegaronPuntuales) {
            System.out.println("Felicidades!");
            // Reasignar una variable
            numero = 20;

            edadPersona = 18;
        }

        System.out.println(edadPersona);



        System.out.println(numero);




        String mensaje = "Hola me llamo \"Vadhir\"";

        System.out.println(mensaje);


        Integer alumnos = 4;
        Boolean b = false;

    }

}
