package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		Empleado empleado2=new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		
		Empleado empleado3=new Empleado("Maria Martin", 105000, 2002, 3, 15);
		
		empleado1.sube_sueldo(5);
		empleado2.sube_sueldo(5);
		empleado3.sube_sueldo(5);
		
		System.out.println("Nombre " + empleado1.d_nombre() + " Sueldo " + empleado1.d_sueldo() + " Fecha Alta " +
		empleado1.d_fecha());
		
		System.out.println("Nombre " + empleado2.d_nombre() + " Sueldo " + empleado2.d_sueldo() + " Fecha Alta " +
				empleado2.d_fecha());
		
		System.out.println("Nombre " + empleado3.d_nombre() + " Sueldo " + empleado3.d_sueldo() + " Fecha Alta " +
				empleado3.d_fecha());*/
		
		
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		
		misEmpleados[2]=new Empleado("Maria Martin", 105000, 2002, 3, 15);
		
		misEmpleados[3]=new Empleado ("Antonio Fernandez");
		
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		misEmpleados[4]=jefe_RRHH;//polimorfismo principio de sustitucion.
		
		misEmpleados[5]=new Jefatura ("Maria", 95000, 1999, 5, 26);
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		
		jefa_Finanzas.estableceIncentivo(55000);
		
		
		/*for(int i=0; i<misEmpleados.length; i++) {
			
			misEmpleados[i].sube_sueldo(i);
			
		}
		
		for(int i=0; i<misEmpleados.length; i++) {
			
		System.out.println("Nombre " + misEmpleados[i].d_nombre() + " Sueldo " + misEmpleados[i].d_sueldo() + " Fecha Alta " +
				misEmpleados[i].d_fecha());
			
		}*/
		
		for(Empleado e: misEmpleados) {
			
			e.sube_sueldo(5);;
			
		}
		
		for(Empleado z: misEmpleados) {
			
		System.out.println("Nombre " + z.d_nombre() + " Sueldo " + z.d_sueldo() + " Fecha Alta " +
				z.d_fecha());
			
		}
		
		
		
	}

}


class Empleado{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		alta_contrato=calendario.getTime();
		
		++IdSiguiente;
		
		Id=IdSiguiente;
		
		
	}
	
	public Empleado(String nom) {
		
		this(nom,30000,2000,01,01);
		
	}
	
	public String d_nombre() {//getter
		
		return nombre + " Id: " + Id;
		
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
	
	private String nombre;
	
	private double sueldo;
	
	private Date alta_contrato;
	
	private static int IdSiguiente;
	
	private int Id;
	
}

class Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
		
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo=b;
		
	}
	
	public double d_sueldo(){
		
		double sueldoJefe=super.d_sueldo();
		
		return sueldoJefe + incentivo;
		
	}
	
	private double incentivo;
	
}



























