package m03.Season1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Realizar la carga de dos números enteros por teclado e imprimir 
		//su suma y su producto

		Scanner ask = new Scanner(System.in);
		
		int num1, num2; 
		int suma = 0; 
		int prod = 0;
		
		System.out.println("ingrese valor 1");
		num1 = ask.nextByte();
		
		System.out.println("ingrese valor 2");
		num2 = ask.nextByte();
		
		suma = num1 + num2;
		
		prod = num1 * num2;
		
		System.out.println("la suma es igua a " + suma);
		
		System.out.println("la multiplicacion es igua a " + prod);
		
		
		
	}

}
