package TrabajoNumero1Iniciado;

import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese el primer número entero
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Solicita al usuario que ingrese el segundo número entero
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Calcular la suma de los dos números
        int suma = numero1 + numero2;

        // Determinar si el primer número es divisible por el segundo número
        if (numero1 % numero2 == 0) {
            System.out.println("El resultado es " + suma + " y es divisible por " + numero2);
        } else {
            System.out.println("El resultado es " + suma + " y no es divisible por " + numero2);
        }

        // Cierra el objeto Scanner como buena práctica de programación
        scanner.close();
    }
}