package m03.Season1;

import java.util.Scanner;

public class CuadradoPerimetro {

	public static void main(String[] args) {
		/* Realizar la carga del lado de un cuadrado, mostrar por pantalla el 
		 * perímetro del mismo (El perímetro de un cuadrado se calcula
		 *  multiplicando el valor del lado por cuatro)
		 * */

		Scanner ask = new Scanner(System.in);
		
		int lado, perimetro;
		
		System.out.println("ingrese el valor del lado");
		lado = ask.nextInt();
		
		perimetro = lado * 4;
		
		System.out.println("el perimetro del cuadrado es igual a:" + perimetro);
		
	}

}
