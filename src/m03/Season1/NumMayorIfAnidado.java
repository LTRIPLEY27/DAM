package m03.Season1;

import java.util.Scanner;

public class NumMayorIfAnidado {

	public static void main(String[] args) {
		//Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos

	Scanner ask = new Scanner(System.in);
	
	int num, num1, num2;
	
	System.out.println("ingrese num");
	num = ask.nextInt();
	
	System.out.println("ingrese num");
	num1 = ask.nextInt();
	
	System.out.println("ingrese num");
	num2 = ask.nextInt();
	
	if(num < num1 && num1 < num2) {
		System.out.println("el tercero es el mayor");
	} else if(num1 < num2 && num2 < num) {
		System.out.println("el primero  es el mayor");
	} else {
		System.out.println("el segundo es el mayor");
	}
	}

}
