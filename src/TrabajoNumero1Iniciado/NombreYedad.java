package TrabajoNumero1Iniciado;

import java.util.Scanner;

public class NombreYedad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese su nombre y apellido
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        // Solicita al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Muestra la información
        System.out.println("Mi nombre es " + nombre + " " + apellido);
        System.out.println("Mi edad es " + edad + " años.");
        // Cerrar el objeto Scanner
        scanner.close();
    }
}