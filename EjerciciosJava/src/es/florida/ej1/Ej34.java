package es.florida.ej1;

import java.math.BigInteger;

public class Ej34 {
	
	//El factorial de 15 se calcula como: 15 ! = 15 × 14 × 13 × ⋯ × 2 × 1 = 1307674368000
	
	//Uso de BigInteger:

	//Para evitar desbordamientos debido al tamaño del resultado, utilizamos la clase BigInteger, ya que el factorial de números grandes (como 15) supera el límite de los tipos de datos enteros primitivos en Java.
	//Cálculo en el bucle for:

	//El bucle for recorre los números desde 2 hasta 15 y multiplica el resultado acumulado en la variable factorial.
	//Número de instrucciones:

	//El cálculo del factorial está resumido en una sola línea dentro del bucle.

	public static void main(String[] args) {
		BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= 15; i++) factorial = factorial.multiply(BigInteger.valueOf(i));
        System.out.println("El factorial de 15 es: " + factorial);
    }
}

