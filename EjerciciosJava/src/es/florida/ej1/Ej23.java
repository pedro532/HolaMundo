package es.florida.ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Crear una lista para almacenar los nombres de las personas
        ArrayList<String> nombres = new ArrayList<>();

        // Variable para almacenar temporalmente el nombre introducido
        String nombre;

        // Bucle para pedir nombres hasta que se introduzca "0"
        while (true) {
            System.out.print("Introduce el nombre de una persona (o '0' para finalizar): ");
            nombre = scanner.nextLine();

            // Condición de salida del bucle
            if (nombre.equals("0")) {
                break;  // Si se introduce "0", el bucle se rompe y finaliza
            }

            // Agregar el nombre introducido a la lista
            nombres.add(nombre);
        }

        // Mostrar los nombres en el formato solicitado
        System.out.println("\nLos nombres introducidos son:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i));
        }

        // Cerrar el scanner
        scanner.close();

	}

}
