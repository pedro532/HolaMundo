package es.florida.ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Usar un ArrayList para almacenar una cantidad indefinida de vehículos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Variable para controlar si el usuario quiere seguir agregando vehículos
        String continuar = "s";

        // Bucle para pedir los datos de los vehículos hasta que el usuario decida parar
        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Introduce los datos del vehículo:");

            System.out.print("Tipo (coche, motocicleta,...): ");
            String tipo = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            // Crear un nuevo objeto Vehiculo con los datos introducidos
            Vehiculo vehiculo = new Vehiculo(tipo, marca, modelo);

            // Añadir el vehículo a la lista
            vehiculos.add(vehiculo);

            // Preguntar si se quiere añadir otro vehículo
            System.out.print("¿Quieres introducir otro vehículo? (s/n): ");
            continuar = scanner.nextLine();
        }

        // Mostrar la información de todos los vehículos introducidos
        System.out.println("\nInformación de los vehículos introducidos:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.print("Vehículo " + (i + 1) + ": ");
            vehiculos.get(i).mostrarInformacion();
        }

        // Cerrar el scanner
        scanner.close();

	}

}
