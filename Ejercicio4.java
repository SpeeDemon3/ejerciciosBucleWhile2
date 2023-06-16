package ejerciciosWhile.extra;

import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio4 {

	/*
	 * Escriba un programa que pida números mientras no se escriba un número negativo. 
	 * El programa terminará escribiendo la suma de los números introducidos.
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Variable para guardar el resultado final;
		int result = 0;
		
		System.out.println("Indica los valores positivos que deseas sumar:");
		
		while(true) {
			
			System.out.println("Indica un valor positivo:");
			// Guardo el valor introducido
			int value = sc.nextInt();
			// Compruebo si el valor es menor a 0 (negativo)
			if (value < 0) {
				System.out.println("Fin del sumatorio, no se aceptan números negativos.");
				break; // Salimos del bucle
			}
			// Sumamos el valor de la variable value en cada iteracion a la variable result para ir acumulando el resultado
			result += value;
			
		}
		// Imprimo el resultado final
		System.out.println("La suma total de los números positivos es: " + result);
		
	}

}
