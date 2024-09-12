package es.florida.ej1;

import java.util.ArrayList;
import java.util.Collections;

public class Ej35_2 {

	public static void main(String[] args) {
		// Crear una lista de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(3);
        numeros.add(45);
        numeros.add(7);
        numeros.add(89);
        numeros.add(2);

        // Llamar al método para obtener el mayor número en la lista
        int mayor = encontrarMayorEnLista(numeros);
        System.out.println("El mayor número en la lista es: " + mayor);
    }

    // Método que acepta una lista y devuelve el mayor de sus elementos
    public static int encontrarMayorEnLista(ArrayList<Integer> lista) {
        return Collections.max(lista);  // Utilizamos Collections.max() para encontrar el mayor

	}

}
