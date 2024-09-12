package es.florida.ej1;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Pon el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Pon el segundo numero: ");
        int numero2 = scanner.nextInt();
        
        
        if (numero1 > numero2) {
            System.out.println("El mayor es: " + numero1);
            System.out.println("El menor es: " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("El mayor es: " + numero2);
            System.out.println("El menor es: " + numero1);
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
        scanner.close();

	}

}
