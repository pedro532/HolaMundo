package es.florida.ej1;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        boolean contrasenaValida = false;

        // Bucle que sigue pidiendo una contraseña válida hasta que cumpla con todos los requisitos
        while (!contrasenaValida) {
            // Pedir al usuario que introduzca una contraseña
            System.out.print("Introduce una contraseña: ");
            String contrasena = scanner.nextLine();

            // Verificar si la contraseña cumple los requisitos
            if (esValidaContrasena(contrasena)) {
                // Pedir que repita la contraseña
                System.out.print("Repite la contraseña: ");
                String repetirContrasena = scanner.nextLine();

                // Verificar si ambas contraseñas coinciden
                if (contrasena.equals(repetirContrasena)) {
                    System.out.println("La contraseña es válida y ha sido confirmada correctamente.");
                    contrasenaValida = true;
                } else {
                    System.out.println("Las contraseñas no coinciden. Inténtalo de nuevo.");
                }
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
