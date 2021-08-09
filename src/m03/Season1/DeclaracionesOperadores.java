package m03.Season1;

public class DeclaracionesOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a = 5;
		
		int b;
		
		b = 7;
		
		int c = b / a;
		
		//c+= 6;
		*/
		
		final double apulgadas = 2.54;  // no permite modificar su valor pues es una constante
		
		double cm = 6;
		
		double res = cm / apulgadas;
		
		System.out.println("En " + cm + " centimetros hay " + res + " de pulgadas");

	}

}
