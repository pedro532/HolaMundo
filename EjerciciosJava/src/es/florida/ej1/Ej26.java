package es.florida.ej1;

import java.util.Scanner;

public class Ej26 {

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
            
            // Llamar al método para determinar la calificación y aumentar el contador correspondiente
            String calificacion = determinarCalificacion(nota);
            switch (calificacion) {
                case "suspenso":
                    suspensos++;
                    break;
                case "aprobado":
                    aprobados++;
                    break;
                case "notable":
                    notables++;
                    break;
                case "sobresaliente":
                    sobresalientes++;
                    break;
                case "matrícula":
                    matricula++;
                    break;
                default:
                    System.out.println("Nota no válida. Introduce un valor entre 0 y 10.");
                    i--;  // Restar el contador para que vuelva a pedir la nota si es incorrecta
            }
        }

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Notables: " + notables);
        System.out.println("Sobresalientes: " + sobresalientes);
        System.out.println("Matrículas de honor: " + matricula);

        // Cerrar el scanner
        scanner.close();
    }

    // Método para determinar la calificación según la nota
    public static String determinarCalificacion(int nota) {
        if (nota >= 0 && nota < 5) {
            return "suspenso";
        } else if (nota >= 5 && nota < 7) {
            return "aprobado";
        } else if (nota >= 7 && nota < 9) {
            return "notable";
        } else if (nota >= 9 && nota < 10) {
            return "sobresaliente";
        } else if (nota == 10) {
            return "matrícula";
        } else {
            return "inválido"; // Caso para notas fuera del rango válido
        }

	}

}
