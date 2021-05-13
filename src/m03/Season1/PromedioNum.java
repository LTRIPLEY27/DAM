package m03.Season1;

import java.util.Scanner;

public class PromedioNum {

	public static void main(String[] args) {
		/* Realizar un programa que lea cuatro valores numéricos e informar su 
		 * suma y promedio*/

		Scanner ask = new Scanner(System.in);
		
		int num1, num2, num3, num4, sum = 0, prom = 0;
		
		System.out.println("ingrese num");
		num1 = ask.nextInt();
		
		System.out.println("ingrese num");
		num2 = ask.nextInt();
		
		System.out.println("ingrese num");
		num3 = ask.nextInt();
		
		System.out.println("ingrese num");
		num4 = ask.nextInt();
		
		sum = num1 + num2 + num3 + num4;
		
		prom = sum / 4;
		
		System.out.println("la suma de todos los valores es : " + sum);
		
		System.out.println("el promedio de todos los valores es : " + prom);
	}
	

}
