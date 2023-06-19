package ejerciciosWhile.extra;

import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class EjercicioMPTC {

	/*
	 * 
	 * Escriba un programa que proponga sumas de números positivos (dos números entre 1 y 100) al usuario y compruebe la 
	 * respuesta. El programa continuará hasta que se acierten cinco sumas.
	 * 
	 */
	
	public static void main(String[] args) {

		// Contador para guardar el numero de aciertos y utilizarlo como condicion en el bucle while
		int count = 0;
		// Contador de los fallos cometidos por el usuario
		int failed = 0;
		
		
		System.out.println("Bienvenido al juego de las sumas!!!\n"
				+ "Para ganar debes hacertar 5 preguntas.");
		
		// Mientras la variable contador sea menor o igual a 5 el bucle seguira iterando
		while (count <= 5) {
			
			// Variable que contendra el primer numero aleatorio
			int number1 = 0;
			
			for (int x = 1; x <= 100; x++) {
				// 		  (int) (Math.random() *(HASTA-DESDE+1)+DESDE);
				number1 = (int) (Math.random() * (100 - 1 + 1) + 10);
			
			}

			// Variable que contendra el segundo numero aleatorio
			int number2 = 0;
			
			for (int y = 1; y <= 100; y++) {
			
				number2 = (int) (Math.random() * (100 - 3 + 1) + 30);
				
			}
			
			// Guardo el resultado de la suma de los 2 valores
			int result = number1 + number2;
			
			// Pregunto al usuario
			System.out.println("Cuanto es la suma: " + number1 + " + " + number2);
			
			// Creo un objeto Scanner para guardar el valor introducido por el usuario
			Scanner sc = new Scanner(System.in);
			
			// Guardo el valor
			int userValue = sc.nextInt();
			
			if (userValue == result) {
				
				System.out.println("Correcto el valor de " + number1 + " + " + number2 + " es " + userValue);
				
				// Sumo uno a la variable contador
				count ++;
				
				// Informo por consola al usuario
				System.out.println("Has hacertado " + count);
				
				// Si el contador es igual a 4
				if (count == 4) {
					System.out.println("Si haciertas una más ganas el juego!!!");
				}
				
			} else {
				// Si falla sumo uno a la variable que contendra el numero de fallos
				failed ++;
				// Informo por consola al usuario
				System.out.println("Has fallado: " + failed);
				System.out.println("El resultado correcto es: " + result);
			}
			
			
		}
		
		System.out.println("Fin de la partida has ganado con " + (count + 1) + " aciertos" + " y " + failed + " fallos.");
		
	}

}
