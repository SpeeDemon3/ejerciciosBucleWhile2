package ejerciciosWhile.extra;

import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio1 {

	/*
	 * Escriba un programa que pida dos números enteros. El programa pedirá de nuevo el segundo número mientras 
	 * no sea mayor que el primero. El programa terminará escribiendo los dos números.
	 */
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce el primer número:");
	int number1 = sc.nextInt();
	
	System.out.println("Introduce el segundo número:");
	int number2 = sc.nextInt();
	
	while(number1 > number2) {
		System.out.println("Introduce el segundo número:");
		number2 = sc.nextInt();
	}
	
	System.out.println("Primer valor: " + number1 
			+"\nSegundo valor: " + number2);
	
	}

}
