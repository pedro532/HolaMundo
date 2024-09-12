package es.florida.ej1;

import java.util.ArrayList;
import java.util.List;

public class Ej32_2 {

	public static void main(String[] args) {
		 // Crear una lista para almacenar los nombres de los compañeros de clase
        List<String> companeros = new ArrayList<>();

        // Añadir los nombres a la lista
        companeros.add("Juan");
        companeros.add("María");
        companeros.add("Carlos");
        companeros.add("Ana");
        companeros.add("Luis");
        companeros.add("Sofia");

        // Mostrar los nombres en la consola, uno por línea
        for (String nombre : companeros) {
            System.out.println(nombre);
        }

	}

}
