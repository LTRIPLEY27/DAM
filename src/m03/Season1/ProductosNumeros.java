package m03.Season1;

import java.util.Scanner;

public class ProductosNumeros {

	public static void main(String[] args) {
		//Escribir un programa en el cual se ingresen cuatro números, calcular e 
		//informar la suma de los dos primeros y el producto del tercero y 
		//el cuarto
		
		Scanner ask = new Scanner(System.in);
		
		int num1, num2, num3, num4, sum, prod;
		
		System.out.println("ingrese el num");
		num1 = ask.nextInt();
		
		System.out.println("ingrese el num");
		num2 = ask.nextInt();
		
		System.out.println("ingrese el num");
		num3 = ask.nextInt();
		
		System.out.println("ingrese el num");
		num4 = ask.nextInt();
		
		sum = num1 + num2;
		
		prod = num3 * num4;
		
		System.out.println("la suma de los dos primeros elementsos es: " + sum);
		
		System.out.println("la multiplicacion de los dos ultimos elementsos es: " + prod);
		

	}

}
