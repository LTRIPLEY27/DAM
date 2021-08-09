package m03.Season1;

import java.util.Scanner;

public class IfAnidado {

	public static void main(String[] args) {
	/*
	 * Confeccionar un programa que pida por teclado tres notas de un alumno,
	 *  calcule el promedio e imprima alguno de estos mensajes:
Si el promedio es >=7 mostrar "Promocionado".
Si el promedio es >=4 y <7 mostrar "Regular".
Si el promedio es <4 mostrar "Reprobado".
	 */

		Scanner ask = new Scanner(System.in);
		String name;
		int note, note1, note2, prom = 0;
		
		System.out.println("ingrese el nombre");
		name = ask.next();
		
		System.out.println("ingrese nota 1");
		note = ask.nextInt();
		
		System.out.println("ingrese nota2 ");
		note1 = ask.nextInt();
		
		System.out.println("ingrese nota 3");
		note2 = ask.nextInt();
		
		prom = (note + note1 + note2) / 3;
		
		if(prom >= 7) {
			System.out.println("Hola " + name + "Promocionado");
		} else if (prom <= 7 && prom >= 4 ) {
			System.out.println("Hola " + name + "Regular");
		} else {
			System.out.println("Hola " + name + "Reprobado");
		}
	}

}
