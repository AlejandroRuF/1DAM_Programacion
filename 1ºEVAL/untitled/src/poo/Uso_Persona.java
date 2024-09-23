package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
	
	public static void main(String[] args) {
		
		Persona[] lasPersonas=new Persona[2];
		
		lasPersonas[0]=new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1]=new Alumno ("Ana Lopez", "Biologia");
		
		for(Persona p: lasPersonas) {
			
			System.out.println(p.d_nombre() + ", " + p.d_Descripcion());
			
		}
		
	}

}

abstract class Persona{
	
	public Persona(String nom) {
		
		nombre=nom;
		
	}
	
	public String d_nombre() {
		
		return nombre;
		
	}
	
	public abstract String d_Descripcion();
	
	private String nombre;
	
	
}


class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		alta_contrato=calendario.getTime();
		
		++IdSiguiente;
		
		Id=IdSiguiente;
		
		
	}
	
	public String d_Descripcion() {
		
		return "Este empleado tiene un Id igual a " + Id + " con un sueldo igual a " + sueldo;
		
	}
	
	public double d_sueldo() {//getter
		
		return sueldo;
		
	}
	
	public Date d_fecha() {//getter
		
		return alta_contrato;
		
	}
	
	public void sube_sueldo(double porcentaje) {//setter
		
		double aumento=sueldo*(porcentaje/100);
		
		sueldo+=aumento;
		
	}
	
	private double sueldo;
	
	private Date alta_contrato;
	
	private static int IdSiguiente;
	
	private int Id;
	
}

class Alumno extends Persona{
	
	public Alumno (String nom, String car) {
		
		super(nom);
		
		carrera=car;
		
		
	}
	
	public String d_Descripcion() {
		
		return "Este Alumno esta estudiando la carrera de " + carrera;
		
	}
	
	private String carrera;
	
}