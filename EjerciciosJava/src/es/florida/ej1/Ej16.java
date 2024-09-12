package es.florida.ej1;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca su fecha de nacimiento
        System.out.print("Introduce el día de tu nacimiento (dd): ");
        int dia = scanner.nextInt();
        
        System.out.print("Introduce el mes de tu nacimiento (mm): ");
        int mes = scanner.nextInt();
        
        System.out.print("Introduce el año de tu nacimiento (aaaa): ");
        int ano = scanner.nextInt();
        
        // Sumar los dígitos del día, mes y año
        int suma = sumarDigitos(dia) + sumarDigitos(mes) + sumarDigitos(ano);
        
        // Reducir la suma a un solo dígito
        while (suma > 9) {
            suma = sumarDigitos(suma);
        }
        
        // Mostrar el número de la suerte
        System.out.println("Tu número de la suerte es: " + suma);
        
        // Cerrar el scanner
        scanner.close();
    }
    
    // Función auxiliar para sumar los dígitos de un número
    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;  // Obtener el último dígito
            numero /= 10;  // Eliminar el último dígito
        }
        return suma;

	}

}
