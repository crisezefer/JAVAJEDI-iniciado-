package TrabajoNumero1Iniciado;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        // Calcular la potencia al cuadrado
        double potenciaCuadrado = Math.pow(numero, 2);

        // Calcular la potencia al cubo
        double potenciaCubo = Math.pow(numero, 3);

        // Mostrar los resultados
        System.out.println("El número al cuadrado es: " + potenciaCuadrado);
        System.out.println("El número al cubo es: " + potenciaCubo);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}