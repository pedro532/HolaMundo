package es.florida.ej1;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int numero1, numero2;

        // Bucle repetitivo que continuará hasta que los dos números sean iguales
        do {
            // Leer los dos números desde el teclado
            System.out.print("Pon el primer número: ");
            numero1 = scanner.nextInt();
            System.out.print("Pon el segundo número: ");
            numero2 = scanner.nextInt();

            // Comparar los números
            if (numero1 > numero2) {
                System.out.println("El mayor es: " + numero1);
                System.out.println("El menor es: " + numero2);
            } else if (numero1 < numero2) {
                System.out.println("El mayor es: " + numero2);
                System.out.println("El menor es: " + numero1);
            } else {
                System.out.println("Ambos números son iguales.");
            }

        } while (numero1 != numero2); // Condición para continuar el bucle

        // Cerrar el scanner
        scanner.close();
	}

}
