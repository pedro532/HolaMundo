package es.florida.ej1;

import java.util.Scanner;

public class Ej37 {

	public static void main(String[] args) {
		// Llamar al método para pedir datos y mostrar el nivel y salario
        mostrarNivelYSalario();
    }

    // Método que pide el nombre y años de experiencia y muestra el nivel y salario
    public static void mostrarNivelYSalario() {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        // Pedir los años de experiencia
        System.out.print("Introduce tus años de experiencia como desarrollador de software: ");
        int experiencia = scanner.nextInt();

        // Mostrar el nivel y el salario en base a la experiencia
        System.out.println("\nNombre: " + nombre);

        if (experiencia < 1) {
            System.out.println("Nivel: Desarrollador Junior L1");
            System.out.println("Salario: 15000-18000 EUR");
        } else if (experiencia >= 1 && experiencia <= 2) {
            System.out.println("Nivel: Desarrollador Junior L2");
            System.out.println("Salario: 18000-22000 EUR");
        } else if (experiencia >= 3 && experiencia <= 5) {
            System.out.println("Nivel: Desarrollador Senior L1");
            System.out.println("Salario: 22000-28000 EUR");
        } else if (experiencia >= 5 && experiencia <= 8) {
            System.out.println("Nivel: Desarrollador Senior L2");
            System.out.println("Salario: 28000-36000 EUR");
        } else if (experiencia > 8) {
            System.out.println("Nivel: Analista / Arquitecto");
            System.out.println("Salario: A convenir en base a rol");
        }

        // Cerrar el scanner
        scanner.close();

	}

}
