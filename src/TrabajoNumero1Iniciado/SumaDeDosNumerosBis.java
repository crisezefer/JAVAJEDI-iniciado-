package TrabajoNumero1Iniciado;

import java.util.Scanner;

public class SumaDeDosNumerosBis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número entero
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número entero
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Cierra el objeto Scanner, sirve para que el programa sea mas eficiente (ahorra recursos del sistema)
        scanner.close();

        // Realizar la suma de los dos números
        int resultado = numero1 + numero2;

        if (resultado % 2 == 0) {
            System.out.println("El resultado es " + resultado + " y es un número par.");
        } else {
            System.out.println("El resultado es " +  resultado + " y es un un número impar.");
        }

    }
}
