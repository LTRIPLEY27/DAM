package m03.Season1;

import java.util.Scanner;

public class ProblemaSuelfoIfSimple {

	public static void main(String[] args) {
	/*Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar
	 *  un mensaje en pantalla indicando que debe abonar impuestos.
	 * 
	 */
		Scanner ask = new Scanner(System.in);
		int sueldo;
		
		System.out.println("ingrese sueldo");
		sueldo = ask.nextInt();
		
		if(sueldo <= 3000) {
			System.out.println("no debe de abonar impuestos");
		} else {
			System.out.println("sdebe de abonar impuestos");
		}
	}

}
