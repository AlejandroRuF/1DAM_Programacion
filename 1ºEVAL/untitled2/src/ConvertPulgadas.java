import java.util.Scanner;

public class ConvertPulgadas {

	public static void main(String[] args) {

		final double apulgadas=2.54;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce los centimetros que quieras convertir a pulgadas");
		
		double cm=entrada.nextDouble();
		
		double resultado=cm/apulgadas;
		
		System.out.println("En " + cm + "cm hay " + resultado + " pulgadas");
		
		
	}

}
