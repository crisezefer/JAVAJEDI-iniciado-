package TrabajoNumero1Iniciado;

import java.util.Scanner;

public class SumaDeDosNumeros{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número entero
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número entero
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Cerrar el objeto Scanner, ya que no lo necesitaremos más
        scanner.close();

        // Realizar la suma de los dos números
        int resultado = numero1 + numero2;

        // Mostrar el resultado por pantalla
        System.out.println("El resultado es: " + resultado);
  }
}