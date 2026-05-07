package Condicionales.Ejercicios;

import java.util.Scanner;

public class LoginSolucion {
    
    /**
     * Sistema de Login
     * 
     * Crea un programa que valide el acceso del usuario mediante su usuario y contraseña.
     * 
     * usuario y contraseña validos:
     *     usuario: "admin"
     *     contraseña: "test123"
     * 
     * - Si el usuario es válido:
     *   - Si la contraseña es correcta, imprimir "Acceso concedido"
     *   - Si la contraseña es incorrecta, imprimir "Contraseña incorrecta"
     * - Si el usuario no es válido, imprimir "Usuario no valido"
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String usuarioRegistrado = "admin";
        String passwordRegistrado = "password123";

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (usuario.equals(usuarioRegistrado)) {
            if (password.equals(passwordRegistrado)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Password incorrecto");
            }
        } else {
            System.out.println("Usuario no valido");
        }
    }
}
