package poo;

public class Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso_plataforma=500;
		
	}

	public String dime_largo() {//GETTER
		
		return "El largo del coche es " + largo + " cm";
		
	}
	
	public int ruedas() {//GETTER
		
		return ruedas;
		
	}
	
	public void e_color(String c_coche) {//SETTER
		
		//color="azul";
		color=c_coche;
		
	}
	
	public String d_color() {//GETTER
		
		return "El color del coche es " + color;
		
	}
	
	public String dime_datos() {
		
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas" + 
		". Mide " + largo/1000 + " metros, un ancho de " + ancho +
		" cm y un peso de plataforma de " + peso_plataforma + " kg.";
		
	}
	
	public void conf_asientos(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			
			this.asientos_cuero=true;
			
		}else {
			
			this.asientos_cuero=false;
			
		}
		
	}
	
	public String d_asientos() {
		
		if(asientos_cuero==true) {
			
			return "El coche tiene asientos de cuero";
			
		}else {
			
			return "El coche tiene asientos de serie";
			
		}
		
	}
	
	public void c_climatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")) {
			
			this.climatizador=true;
			
		}else {
			
			this.climatizador=false;
			
		}
		
	}
	
	public String d_climatizador() {
		
		if(climatizador==true) {
			
			return "El coche tiene climatizador.";
			
		}else {
			
			return "El coche no tiene climatizador";
			
		}
		
	}
	
	public String d_peso_coche() {
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true) {
			
			peso_total=peso_total+50;
			
		}
		if(climatizador==true) {
			
			peso_total=peso_total+20;
			
		}
		
		return "El peso del coche es " + peso_total + " kg.";
		
	}
	
	public int precio_coche(){
		
		int precio_final=10000;
		
		if(asientos_cuero==true) {
			
			precio_final+=2000;
			
		}
		if(climatizador==true) {
			
			precio_final+=1500;
			
		}
		
		return precio_final;
		
	}
	
}


