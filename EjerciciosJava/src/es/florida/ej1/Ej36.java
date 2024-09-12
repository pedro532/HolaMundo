package es.florida.ej1;

import java.util.Scanner;

public class Ej36 {

	public static void main(String[] args) {
		// Llamar al método para obtener la suma de los 5 números
        int suma = pedirNumerosYCalcularSuma();
        System.out.println("La suma de los números es: " + suma);
    }

    // Método que pide 5 números, los muestra en orden inverso y devuelve la suma
    public static int pedirNumerosYCalcularSuma() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        // Pedir los 5 números
        System.out.println("Introduce 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];  // Acumular la suma
        }

        // Mostrar los números en orden inverso
        System.out.println("\nLos números en orden inverso son:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        // Cerrar el scanner
        scanner.close();

        // Devolver la suma de los números
        return suma;

	}

}
