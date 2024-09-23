package poo;

public class Furgoneta extends Coche {
	
	private int capacidad_extra;
	
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_extra) {
		
		super(); //llamar al constructor de la clase padre
		
		this.capacidad_extra=capacidad_extra;
		
		this.plazas_extra=plazas_extra;
		
		
		
	}
	
	public String dime_datosf() {
		
		return "La capacidad de la furgoneta es " + capacidad_extra + " y las plazas son: " + plazas_extra + " plazas.";
		
	}

}
