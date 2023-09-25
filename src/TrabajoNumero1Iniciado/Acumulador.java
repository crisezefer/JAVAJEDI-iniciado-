package TrabajoNumero1Iniciado;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        double acumulacion = 0.0;

        for (int i = 1; i <= 15; i++) {
            double resultado = (double) (numero1 * numero2) / i;
            acumulacion += resultado;

            // Mostrar la operación actual y la acumulación parcial
            System.out.println("Operación " + i + ": " + numero1 + " * " + numero2 + " / " + i + " = " + resultado);
            System.out.println("Acumulación parcial en la operación " + i + ": " + acumulacion);
        }

        // Mostrar el resultado de la acumulación final
        System.out.println("El resultado de la acumulación final es: " + acumulacion);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}