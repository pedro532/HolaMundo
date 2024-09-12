package es.florida.ej1;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        // Contadores para cada grupo de notas
	        int suspensos = 0;
	        int aprobados = 0;
	        int notables = 0;
	        int sobresalientes = 0;
	        int matricula = 0;

	        // Leer 10 notas
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Introduce la nota " + i + " (entre 0 y 10): ");
	            int nota = scanner.nextInt();
	            
	            // Agrupar la nota según el valor
	            if (nota >= 0 && nota < 5) {
	                suspensos++;
	            } else if (nota >= 5 && nota < 7) {
	                aprobados++;
	            } else if (nota >= 7 && nota < 9) {
	                notables++;
	            } else if (nota >= 9 && nota < 10) {
	                sobresalientes++;
	            } else if (nota == 10) {
	                matricula++;
	            } else {
	                System.out.println("Nota no válida. Introduce un valor entre 0 y 10.");
	                i--; // Restar el contador para que vuelva a pedir la nota
	            }
	        }

	        // Mostrar los resultados
	        System.out.println("Suspensos: " + suspensos);
	        System.out.println("Aprobados: " + aprobados);
	        System.out.println("Notables: " + notables);
	        System.out.println("Sobresalientes: " + sobresalientes);
	        System.out.println("Matrículas de honor: " + matricula);

	        // Cerrar el scanner
	        scanner.close();

	}

}
