package es.florida.ej1;

public class Ej19 {

	public static void main(String[] args) {
		// Mostrar el encabezado de la tabla
        System.out.println("Código ASCII | Carácter");
        System.out.println("-----------------------");

        // Bucle para recorrer los códigos ASCII del 0 al 227
        for (int i = 0; i <= 227; i++) {
            // Mostrar el código ASCII y su carácter correspondiente
            System.out.printf("%11d | %c\n", i, (char) i);
        }

	}

}
