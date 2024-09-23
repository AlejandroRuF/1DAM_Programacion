
public class CalculosMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double raiz=Math.sqrt(9);
		
		System.out.println((int)raiz);
		
		double num1=5.85;
		
		int resultado=(int)Math.round(num1);
		
		System.out.println(resultado);
		
		double base=5;
		
		double exponente=3;
		
		int resultado1=(int)Math.pow(base, exponente);
		
		System.out.println("El resultado de " + (int)base + " elevado a " + (int)exponente + " es " + resultado1);
		
		
	}

}
