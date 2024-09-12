package es.florida.ej1;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Pedir al usuario que introduzca la temperatura en grados Celsius
	        System.out.print("Introduce la temperatura en grados Celsius: ");
	        double celsius = scanner.nextDouble();
	        
	        // Convertir Celsius a Fahrenheit
	        double fahrenheit = (celsius * 9/5) + 32;
	        
	        // Mostrar el resultado con 1 decimal
	        System.out.printf("La temperatura en grados Fahrenheit es: %.1f°F\n", fahrenheit);
	        
	        // Cerrar el scanner
	        scanner.close();

	}

}
