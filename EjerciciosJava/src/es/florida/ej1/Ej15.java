package es.florida.ej1;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        // Pedir al usuario que introduzca el valor del radio
	        System.out.print("Introduce el valor del radio: ");
	        double radio = scanner.nextDouble();
	        
	        // Calcular el diámetro (2 * radio)
	        double diametro = 2 * radio;
	        
	        // Calcular el área (π * radio^2)
	        double area = Math.PI * Math.pow(radio, 2);
	        
	        // Calcular el volumen de la esfera (4/3 * π * radio^3)
	        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
	        
	        // Mostrar los resultados con 3 decimales de precisión
	        System.out.printf("El diámetro es: %.3f\n", diametro);
	        System.out.printf("El área de la circunferencia es: %.3f\n", area);
	        System.out.printf("El volumen de la esfera es: %.3f\n", volumen);
	        
	        // Cerrar el scanner
	        scanner.close();

	}

}
