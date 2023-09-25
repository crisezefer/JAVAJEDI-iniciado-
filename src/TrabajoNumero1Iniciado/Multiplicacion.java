package TrabajoNumero1Iniciado;

import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese dos números reales
        System.out.print("Ingrese el primer número real: ");
        double numeroReal1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número real: ");
        double numeroReal2 = scanner.nextDouble();

        // Solicita al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numeroEntero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int numeroEntero2 = scanner.nextInt();

        // Multiplicación de dos números reales
        double resultadoReal = numeroReal1 * numeroReal2;

        // Multiplicación de dos números enteros
        int resultadoEntero = numeroEntero1 * numeroEntero2;

        // Suma de las dos multiplicaciones
        double suma = resultadoReal + resultadoEntero;

        // Mostrar resultados
        System.out.println("Resultado de la multiplicación de números reales: " + resultadoReal);
        System.out.println("Resultado de la multiplicación de números enteros: " + resultadoEntero);
        System.out.println("Suma de las dos multiplicaciones: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

/* el resultado es un numero real porque java como otros lenguajes tiene un sistema de conversion
automatica de tipos, esto se llama "promocion de tipos" y sirve para que no se pierdan datos en las
operaciones matemáticas
 */