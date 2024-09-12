package es.florida.ej1;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int suma = 0; // Variable para almacenar la suma

	        // Bucle que se ejecuta 5 veces para leer 5 números
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Introduce el número " + i + ": ");
	            int numero = scanner.nextInt();
	            suma += numero; // Añadir el número a la suma
	        }

	        // Mostrar la suma total de los 5 números
	        System.out.println("La suma de los cinco números es: " + suma);

	        // Cerrar el scanner
	        scanner.close();

	}

}
