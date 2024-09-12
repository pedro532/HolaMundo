package es.florida.ej1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Pon tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Hola " + nombre);
        
        scanner.close();

	}

}