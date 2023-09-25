package TrabajoNumero1Iniciado;

import java.util.Scanner;

public class NombreDeBebida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese el nombre de su última mascota
        System.out.print("Ingrese el nombre de su última mascota: ");
        String nombreMascota = scanner.nextLine();

        // Solicita al usuario que ingrese el nombre de la última película vista
        System.out.print("Ingrese el nombre de la última película vista: ");
        String nombrePelicula = scanner.nextLine();

        // Mostrar la información en el formato deseado
        System.out.println("Nombre de la próxima bebida : " + nombreMascota + " " + nombrePelicula);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}