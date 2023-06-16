package ejerciciosWhile.extra;

import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio5 {

	/*
	 * Escriba un programa que pida un valor límite positivo y 
	 * a continuación pida números hasta que la suma de los números introducidos supere el límite inicial.
	 */
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce un valor positivo para indicar el límite del sumatorio:");
	int limitValue = sc.nextInt(); 
	
	// Variable para ir guardando el acumulado de la suma
	int result = 0;
	
	// Mientras la variable result sea menor o igual a limiteValue, el bucle seguira iterando
	while(result <= limitValue) {
		
		System.out.println("Introduce un valor:");
		int sum = sc.nextInt();
		// Sumo el valor de sum a la variable result
		result += sum;
		
	}
	// Imprimo el valor de la suma e indico que se supero el limite
	System.out.println("Limite superado!!! => " + result);
		
	}

}
