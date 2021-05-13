package m03.Season1;

import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {
		/* Se debe desarrollar un programa que pida el ingreso del precio de un
		 *  artículo y la cantidad que lleva el cliente. Mostrar lo que debe 
		 *  abonar el comprador.*/
		
		Scanner ask = new Scanner(System.in);
		
		int precio, valor, total;
		
		System.out.println("ingrese el precio del producto");
		precio = ask.nextInt();
		
		System.out.println("ingrese la cantidad");
		valor = ask.nextInt();
		
		total = precio * valor;
		
		System.out.println(" el total a pagar es igual a " + total);
		

	}

}
