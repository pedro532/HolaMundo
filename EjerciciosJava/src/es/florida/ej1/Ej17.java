package es.florida.ej1;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        boolean contrasenaValida = false;

        // Bucle que sigue pidiendo una contraseña hasta que sea válida
        while (!contrasenaValida) {
            // Pedir al usuario que introduzca una contraseña
            System.out.print("Introduce una contraseña: ");
            String contrasena = scanner.nextLine();

            // Verificar si la contraseña cumple con los requisitos
            if (esValidaContrasena(contrasena)) {
                System.out.println("La contraseña es válida.");
                contrasenaValida = true;
            } else {
                System.out.println("La contraseña no cumple los requisitos. Inténtalo de nuevo.");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Función para verificar si la contraseña cumple los requisitos
    public static boolean esValidaContrasena(String contrasena) {
        // Verificar si la longitud es al menos 5 caracteres
        if (contrasena.length() < 5) {
            return false;
        }

        boolean tieneNumero = false;
        boolean tieneMayuscula = false;

        // Recorrer cada caracter de la contraseña
        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);

            // Verificar si es un número
            if (Character.isDigit(c)) {
                tieneNumero = true;
            }

            // Verificar si es una letra mayúscula
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
        }

        // Devolver true si tiene al menos un número y una mayúscula
        return tieneNumero && tieneMayuscula;
	}

}
