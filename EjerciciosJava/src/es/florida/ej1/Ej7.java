package es.florida.ej1;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int suma = 0;  // Variable para almacenar la suma
	        int contador = 1;  // Variable para contar cuántos números se han leído

	        // Bucle while que se ejecuta hasta que se hayan leído 5 números
	        while (contador <= 5) {
	            System.out.print("Introduce el número " + contador + ": ");
	            int numero = scanner.nextInt();
	            suma += numero;  // Añadir el número a la suma
	            contador++;  // Incrementar el contador
	        }

	        // Mostrar la suma total de los 5 números
	        System.out.println("La suma de los cinco números es: " + suma);

	        // Cerrar el scanner
	        scanner.close();

	}

}
