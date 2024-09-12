package es.florida.ej1;

public class Ej20 {

	public static void main(String[] args) {
		// Mostrar los caracteres ASCII estándar (0-127)
        System.out.println("ASCII Estándar (0-127)");
        System.out.println("-----------------------");
        for (int i = 0; i <= 127; i++) {
            System.out.printf("%11d | %c\n", i, (char) i);
        }

        // Mostrar una separación
        System.out.println("\nASCII Extendido (128-255)");
        System.out.println("-------------------------");

        // Mostrar los caracteres ASCII extendidos (128-255)
        for (int i = 128; i <= 255; i++) {
            System.out.printf("%11d | %c\n", i, (char) i);
        }

	}

}
