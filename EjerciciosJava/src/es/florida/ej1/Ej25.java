package es.florida.ej1;

import java.util.Random;
import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca tres números entre 1 y 10
        System.out.println("Introduce tres números entre 1 y 10:");

        System.out.print("Primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Tercer número: ");
        int numero3 = scanner.nextInt();

        // Validar que los tres números estén entre 1 y 10
        if ((numero1 < 1 || numero1 > 10) || (numero2 < 1 || numero2 > 10) || (numero3 < 1 || numero3 > 10)) {
            System.out.println("Todos los números deben estar entre 1 y 10.");
            return;
        }

        // Generar un número aleatorio entre 1 y 10
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1; // Genera un número entre 1 y 10

        // Mostrar los números introducidos y el número aleatorio
        System.out.println("\nNúmeros introducidos: " + numero1 + ", " + numero2 + ", " + numero3);
        System.out.println("Número generado aleatoriamente: " + numeroAleatorio);

        // Comprobar si alguno de los tres números coincide con el número aleatorio
        if (numero1 == numeroAleatorio || numero2 == numeroAleatorio || numero3 == numeroAleatorio) {
            System.out.println("¡Felicitaciones! Uno de tus números coincide. Has ganado un premio.");
        } else {
            System.out.println("Lo siento, ninguno de tus números coincide. ¡Inténtalo de nuevo!");
        }

        // Cerrar el scanner
        scanner.close();

	}

}
