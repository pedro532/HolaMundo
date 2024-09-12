package es.florida.ej1;

import java.util.Random;
import java.util.Scanner;

public class Ej24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca un número entre 1 y 10
        System.out.print("Introduce un número entre 1 y 10: ");
        int numeroUsuario = scanner.nextInt();

        // Verificar que el número está entre 1 y 10
        if (numeroUsuario < 1 || numeroUsuario > 10) {
            System.out.println("El número debe estar entre 1 y 10.");
            return;
        }

        // Generar un número aleatorio entre 1 y 10
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1; // Genera un número entre 1 y 10

        // Mostrar los números
        System.out.println("Número introducido por el usuario: " + numeroUsuario);
        System.out.println("Número generado aleatoriamente: " + numeroAleatorio);

        // Comparar los números
        if (numeroUsuario == numeroAleatorio) {
            System.out.println("¡Felicitaciones! Los números coinciden. Has ganado un premio.");
        } else {
            System.out.println("Lo siento, los números no coinciden. ¡Inténtalo de nuevo!");
        }

        // Cerrar el scanner
        scanner.close();

	}

}
