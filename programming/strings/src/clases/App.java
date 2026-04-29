package clases;

public class App {
    public static void main(String[] args) {
        // Instancia/objeto de la clase Email
        Email email = new Email("Pedrito", "Anexo", "Eh wey vamos al curso!");
        email.print();

        Email email2 = new Email("Manolo", "Roberto", "Hola compa");
        email2.print();
    }
}
