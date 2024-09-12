package es.florida.ej1;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		 // Tabla de letras del DNI en orden
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 
                            'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        Scanner scanner = new Scanner(System.in);

        // Pedir el número de DNI al usuario
        System.out.print("Introduce tu número de DNI (sin la letra): ");
        int dni = scanner.nextInt();

        // Calcular el resto del número del DNI dividido entre 23
        int resto = dni % 23;

        // Obtener la letra correspondiente de la tabla
        char letra = letrasDNI[resto];

        // Mostrar el DNI completo con la letra
        System.out.println("Tu DNI completo es: " + dni + letra);

        // Cerrar el scanner
        scanner.close();

	}

}
