package es.florida.ej1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Pon el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Pon el segundo numero: ");
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2;
        
        System.out.println("La suma de"+ numero1 +" y " +numero2+ " es " + suma);
        
        scanner.close();
	}

}
