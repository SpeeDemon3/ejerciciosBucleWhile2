package ejerciciosWhile.extra;

import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio2 {

	/*
	 * Escriba un programa que pida números decimales mientras el usuario escriba número mayores que el primero.
	 */
	public static void main(String[] args) {

		// Creo un objeto Scanner para guardar los datos introducidos
		Scanner sc = new Scanner(System.in);
		// Creo una varible de control para controlar el bucle
		boolean control = true;
		
		// Mientras la variable control sea true
		while(control) {
			// Pido por consola y guardo los valores
			System.out.println("Introduce el primer número:");
			float number1 = sc.nextInt();
			
			System.out.println("Introduce el segundo número mayor que " + number1 + ":");
			float number2 = sc.nextInt();
			
			// Si el valor 2 es menor al valor 1
			if (number2 < number1) {
				// Informo por consola
				System.out.println(number2 + " no es mayor que " + number1);
				// Cambio la variable control a false para salir del bucle
				control = false;
				
			} 
			
			
			
		}
		
		
	}

}
