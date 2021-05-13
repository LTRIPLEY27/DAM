package m03.Season1;

import java.util.Scanner;

public class init {

	public static void main(String[] args) {
		// Hallar la superficie de un cuadrado conociendo el valor de un lado
		
		Scanner ask = new Scanner(System.in);
		float num1;
		float cuadrado;
		
		System.out.println("ingrese el valor del lado del cuadrado");
		num1 = ask.nextFloat();
		
		cuadrado = num1 * num1;
		
		System.out.println("la superficie del cuadrado es igual a " + cuadrado);

	}

}
