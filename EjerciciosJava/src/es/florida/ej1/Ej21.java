package es.florida.ej1;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar los nombres de 5 personas
        String[] nombres = new String[5];

        // Bucle para pedir el nombre de cada persona
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine(); // Leer el nombre y almacenarlo en el array
        }

        // Mostrar los nombres introducidos
        System.out.println("\nLos nombres introducidos son:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Persona " + (i + 1) + ": " + nombres[i]);
        }

        // Cerrar el scanner
        scanner.close();

	}

}
