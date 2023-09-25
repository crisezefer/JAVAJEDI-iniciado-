package TrabajoNumero1Iniciado;

import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de filas del triángulo
        System.out.print("Ingrese el número de filas del triángulo: ");
        int filas = scanner.nextInt();

        // Dibujar el triángulo de asteriscos
        for (int i = 1; i <= filas; i++) {
            // Imprimir espacios en blanco en cada fila
            for (int j = 1; j <= (filas - i); j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos en cada fila
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Ir a la siguiente línea después de cada fila
            System.out.println();
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}