import java.util.Scanner;

public class EntradaEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre por favor");
		
		String nombre_user=entrada.nextLine();
		
		System.out.println("Introduce edad por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_user + " el año que viene tendras " + (edad+1) + " años");

		
	}

}
