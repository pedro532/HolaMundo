package es.florida.ej1;

import java.util.Scanner;

public class Ej28 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Array para almacenar los 5 vehículos
	        Vehiculo[] vehiculos = new Vehiculo[5];

	        // Pedir al usuario que introduzca los datos de los 5 vehículos
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Introduce los datos del vehículo " + (i + 1) + ":");

	            System.out.print("Tipo (coche, motocicleta,...): ");
	            String tipo = scanner.nextLine();

	            System.out.print("Marca: ");
	            String marca = scanner.nextLine();

	            System.out.print("Modelo: ");
	            String modelo = scanner.nextLine();

	            // Crear un nuevo objeto Vehiculo con los datos introducidos
	            vehiculos[i] = new Vehiculo(tipo, marca, modelo);
	        }

	        // Mostrar la información de los 5 vehículos
	        System.out.println("\nInformación de los vehículos introducidos:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Vehículo " + (i + 1) + ": ");
	            vehiculos[i].mostrarInformacion();
	        }

	        // Cerrar el scanner
	        scanner.close();

	}

}
