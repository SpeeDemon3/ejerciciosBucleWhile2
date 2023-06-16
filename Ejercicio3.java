package ejerciciosWhile.extra;

import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio3 {
	/*
	 * Escriba un programa que pida la cantidad de números positivos que se tienen que escribir 
	 * y a continuación pida números hasta que se haya escrito la cantidad de números positivos indicada.
	 */
	public static void main(String[] args) {

		System.out.println("Indica la cantidad de numeros positivos que se tienen que introducir:");
		
		Scanner sc = new Scanner(System.in);
		// Guardo el valor introducido por el usuario
		int amount = sc.nextInt();
		// Creo un array de tipo int al que le asigno la longitud del valor introiducido por el usuario
		int[] numbers = new int[amount];
		// Creo una variable para ir guardando el indice dentro del array comenzando en 0, ya que el primer elemento siempre esta en la posicion 0
		int position = 0;
		
		// Si la posicion del elemento es menor a la longitud del array
		while(position < numbers.length) {
			// Pido por consola y guardo el valor
			System.out.println("Introduce un valor:");
			int num = sc.nextInt();
			
			// Si el valor introducido es menor a 0 (negativo)
			if (num < 0) {
				// Informo por consola
				System.out.println("Debes introducir un valor positivo.");
				
			} else { // Si no
				// Guardo el valor introducido en la posicion indicada empezando en 0
				numbers[position] = num;
				// Sumo uno a la posicion para ir avanzando en las posiciones a rellenar
				position++;
				
			}
			
			
		}
		
		System.out.println("\nValores introducidos:");
		// Imprimo todos los elementos introducidos
		for (int n : numbers) {
			System.out.println(n);
		}
		
	}

}
