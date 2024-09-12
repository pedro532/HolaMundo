package es.florida.ej1;

import java.util.Scanner;

public class Ej38 {

	public static void main(String[] args) {
		// Llamar al método para ejecutar la lógica
        mostrarNumerosEnIntervalo();
    }

    // Método que pide dos números como extremos de un intervalo y muestra si son primos o no
    public static void mostrarNumerosEnIntervalo() {
        Scanner scanner = new Scanner(System.in);

        // Pedir los dos números como extremos del intervalo
        System.out.print("Introduce el primer número del intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Introduce el segundo número del intervalo: ");
        int fin = scanner.nextInt();

        // Asegurarse de que inicio sea menor que fin
        if (inicio > fin) {
            int temp = inicio;
            inicio = fin;
            fin = temp;
        }

        // Registrar el tiempo de inicio
        long tiempoInicio = System.currentTimeMillis();

        // Mostrar los números del intervalo y si son primos o no
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " es un número primo");
            } else {
                System.out.println(i + " no es un número primo");
            }
        }

        // Registrar el tiempo de finalización
        long tiempoFin = System.currentTimeMillis();

        // Mostrar el tiempo consumido en la ejecución
        long tiempoConsumido = tiempoFin - tiempoInicio;
        System.out.println("\nTiempo consumido en la ejecución: " + tiempoConsumido + " milisegundos");

        // Cerrar el scanner
        scanner.close();
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;

	}

}
