package es.florida.ej1;

import java.util.Scanner;

public class Ej27 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca el número del DNI
        System.out.print("Introduce el número de DNI (sin la letra): ");
        int dni = scanner.nextInt();

        // Llamar al método para calcular la letra del DNI
        char letra = calcularLetraDNI(dni);

        // Mostrar el DNI completo con la letra
        System.out.println("Tu DNI completo es: " + dni + letra);

        // Cerrar el scanner
        scanner.close();
    }

    // Método para calcular la letra del DNI
    public static char calcularLetraDNI(int dni) {
        // Tabla de letras según el resto de la división entre 23
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 
                            'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        // Calcular el resto de dividir el número del DNI entre 23
        int resto = dni % 23;

        // Devolver la letra correspondiente según el resto
        return letrasDNI[resto];

	}

}
