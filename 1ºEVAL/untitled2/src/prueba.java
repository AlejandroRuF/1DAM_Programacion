import java.util.Scanner;
public class prueba {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String genero;
	        do {
	            System.out.print("Introduce tu género (H/M): ");
	            genero = sc.nextLine().toUpperCase();
	        } while(!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));

	        int altura;
	        do {
	            System.out.print("Introduce tu altura en centímetros: ");
	            while(!sc.hasNextInt()) {
	                System.out.println("La altura debe ser un número entero.");
	                sc.next();
	            }
	            altura = sc.nextInt();
	        } while(altura <= 0);

	        int pesoIdeal;
	        if(genero.equalsIgnoreCase("H")) {
	            pesoIdeal = altura - 110;
	        } else {
	            pesoIdeal = altura - 120;
	        }

	        System.out.printf("Tu peso ideal sería %d kg.", pesoIdeal);

	        sc.close();
	    }

	}
