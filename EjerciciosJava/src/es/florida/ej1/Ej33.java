package es.florida.ej1;

public class Ej33 {

	public static void main(String[] args) {
		int numero = 8;  // Puedes cambiar este valor para probar con otros números

        // Llamar al método sumaNumerosPares y mostrar el resultado
        int resultado = sumaNumerosPares(numero);
        System.out.println("La suma de los números pares hasta " + numero + " es: " + resultado);
    }

    // Método que suma los números pares hasta el número dado
    public static int sumaNumerosPares(int numero) {
        int suma = 0;

        // Bucle que suma los números pares
        for (int i = 2; i <= numero; i += 2) {
            suma += i;
        }

        return suma;  // Devolver el resultado de la suma

	}

}
