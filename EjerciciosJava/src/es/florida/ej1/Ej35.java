package es.florida.ej1;

public class Ej35 {

	public static void main(String[] args) {
		 int[] numeros = {10, 25, 3, 45, 7, 89, 2};

	        // Llamar al método para obtener el mayor número en el array
	        int mayor = encontrarMayorEnArray(numeros);
	        System.out.println("El mayor número en el array es: " + mayor);
	    }

	    // Método que acepta un array y devuelve el mayor de sus elementos
	    public static int encontrarMayorEnArray(int[] array) {
	        int mayor = array[0];  // Inicializar con el primer elemento del array

	        // Recorrer el array y encontrar el mayor elemento
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > mayor) {
	                mayor = array[i];
	            }
	        }

	        return mayor;  // Devolver el mayor número
	}

}
