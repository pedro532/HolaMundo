package es.florida.ej1;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int mes;

	        // Bucle que se repetirá hasta que se introduzca un número válido entre 1 y 12
	        do {
	            // Pedir al usuario que introduzca un número entre 1 y 12
	            System.out.print("Introduce un número del 1 al 12: ");
	            mes = scanner.nextInt();

	            if (mes < 1 || mes > 12) {
	                System.out.println("El número introducido no es válido. Debe estar entre 1 y 12.");
	            }

	        } while (mes < 1 || mes > 12);  // Repetir mientras el número no sea válido

	        // Utilizar la estructura switch para identificar el mes correspondiente
	        switch (mes) {
	            case 1:
	                System.out.println("Enero");
	                break;
	            case 2:
	                System.out.println("Febrero");
	                break;
	            case 3:
	                System.out.println("Marzo");
	                break;
	            case 4:
	                System.out.println("Abril");
	                break;
	            case 5:
	                System.out.println("Mayo");
	                break;
	            case 6:
	                System.out.println("Junio");
	                break;
	            case 7:
	                System.out.println("Julio");
	                break;
	            case 8:
	                System.out.println("Agosto");
	                break;
	            case 9:
	                System.out.println("Septiembre");
	                break;
	            case 10:
	                System.out.println("Octubre");
	                break;
	            case 11:
	                System.out.println("Noviembre");
	                break;
	            case 12:
	                System.out.println("Diciembre");
	                break;
	        }
	        
	        // Cerrar el scanner
	        scanner.close();

	}

}
