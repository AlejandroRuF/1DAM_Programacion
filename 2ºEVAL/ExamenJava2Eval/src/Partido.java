import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Partido {

    private int goles_Locales;
    private int gols_Visitantes;

    private ArrayList<Jugador> locales = new ArrayList<Jugador>();
    private ArrayList<Arbitro> arbitros = new ArrayList<Arbitro>();
    private ArrayList<Jugador> visitantes = new ArrayList<Jugador>();

    private ArrayList<String> goleador_Local = new ArrayList<String>();
    private ArrayList<String> goleador_visitante = new ArrayList<String>();

    private ArrayList<Integer> goles_Local_Minuto = new ArrayList<>();
    private ArrayList<Integer> goles_Visitante_Minuto = new ArrayList<>();

    public Partido()
    {
        this.locales.add(new Jugador("Domenech",32,"Española",1,"Portero","Valencia CF"));
        this.locales.add(new Jugador("Thierry R.",33,"Portuguesa",2,"Defensa","Valencia CF"));
        this.locales.add(new Jugador("G.paulista",32,"Brasileña",5,"Defensa","Valencia CF"));
        this.locales.add(new Jugador("Gayà",27,"Española",14,"Defensa","Valencia CF"));
        this.locales.add(new Jugador("Lato",25,"Española",3,"Defensa","Valencia CF"));
        this.locales.add(new Jugador("Guedes",26,"Portuguesa",7,"Centrocampista","Valencia CF"));
        this.locales.add(new Jugador("Račić",24,"Serbia",8,"Centrocampista","Valencia CF"));
        this.locales.add(new Jugador("C.soler",25,"Española",10,"Centrocampista","Valencia CF"));
        this.locales.add(new Jugador("Ilaix",19,"Guineana",23,"Centrocampista","Valencia CF"));
        this.locales.add(new Jugador("Hugo Duro",23,"Española",19,"Delantero","Valencia CF"));
        this.locales.add(new Jugador("Bryan",21,"Española",21,"Portero","Valencia CF"));


        this.visitantes.add(new Jugador("Aitor Fdez.",31,"Española",1,"Portero","Levante UD"));
        this.visitantes.add(new Jugador("Rober Pier",27,"Española",4,"Defensa","Levante UD"));
        this.visitantes.add(new Jugador("Martin Caceres",35,"Uruguaya",7,"Defensa","Levante UD"));
        this.visitantes.add(new Jugador("Mustafi",30,"Alemana",13,"Defensa","Levante UD"));
        this.visitantes.add(new Jugador("Postigo",34,"Española",15,"Defensa","Levante UD"));
        this.visitantes.add(new Jugador("Son",28,"Española",2,"Centrocampista","Levante UD"));
        this.visitantes.add(new Jugador("Radoja",29,"Serbia",5,"Centrocampista","Levante UD"));
        this.visitantes.add(new Jugador("Bardhi",27,"Macedonio",10,"Centrocampista","Levante UD"));
        this.visitantes.add(new Jugador("De Frutos",25,"Española",18,"Centrocampista","Levante UD"));
        this.visitantes.add(new Jugador("A. J. Morales",35,"Española",11,"Delantero","Levante UD"));
        this.visitantes.add(new Jugador("Roger Ms.",31,"Española",9,"Centrocampista","Levante UD"));


        this.arbitros.add(new Arbitro("DEL CERRO GRANDE",36,"Española","Principal"));
        this.arbitros.add(new Arbitro("ALBEROLA ROJAS",39,"Española","Linier"));
        this.arbitros.add(new Arbitro("GIL MANZANO",45,"Española","VAR"));

    }

    public void mostrarAlineaciones()
    {
        System.out.println("Jugadores locales");
        System.out.println("****************************************\n");
        for (int i = 0; i < this.locales.size(); i++) {

            System.out.println(this.locales.get(i));

        }

        // Escribe aquí el código para mostrar los jugadores locales.


        System.out.println("****************************************");
        System.out.println();
        System.out.println("Jugadores visitantes");
        System.out.println("****************************************");
        System.out.println();
        for (int i = 0; i < this.visitantes.size(); i++) {

            System.out.println(this.visitantes.get(i));

        }


        // Escribe aquí el código para mostrar los jugadores visitantes.

        System.out.println("****************************************");
        System.out.println();
        System.out.println("Arbritos");
        System.out.println("****************************************");
        System.out.println();

        for (int i = 0; i < this.arbitros.size(); i++) {

            System.out.println(this.arbitros.get(i));

        }

        // Escribe aquí el código para mostrar los arbritos.

        System.out.println("****************************************");
        System.out.println();
    }

    public void alineacionOrdenadaDorsal()
    {
        Collections.sort(this.locales);
        Collections.sort(this.visitantes);

    }

    public void jugar() {
        this.goles_Locales = 0;
        this.gols_Visitantes = 0;
        int minutos = 0;
        while(minutos<=90)
        {
            int aleatorio_Local = (int) (Math.random()*(this.locales.size()));
            int aleatorio_Visitante = (int) (Math.random()*this.visitantes.size());
            int aleatorio_Arbitro = (int) (Math.random()*this.arbitros.size());

            String accion_Local = this.locales.get(aleatorio_Local).Accion();
            String accion_Visitante = this.visitantes.get(aleatorio_Local).Accion();

            if (accion_Local.equalsIgnoreCase("Rematar") && this.arbitros.get(aleatorio_Arbitro).Accion().equalsIgnoreCase("Gol")){

                this.goles_Locales += 1;
                this.goleador_Local.add(this.locales.get(aleatorio_Local).getNombre());
                this.goles_Local_Minuto.add(minutos);

            }
            if (accion_Visitante.equalsIgnoreCase("Rematar") && this.arbitros.get(aleatorio_Arbitro).Accion().equalsIgnoreCase("Gol")) {

                this.gols_Visitantes += 1;
                this.goleador_visitante.add(this.visitantes.get(aleatorio_Visitante).getNombre());
                this.goles_Visitante_Minuto.add(minutos);

            }

            minutos=minutos+1;

        }

        // Una vez finalizado el partido mostramos las estadísticas.

        System.out.println("El resultado del partido es:");
        System.out.println("*******************************");

        System.out.println("Valencia CF: "+this.goles_Locales);
        System.out.print("[");
        for (int i = 0; i < this.goleador_Local.size(); i++) {

            if (i!=(this.goleador_Local.size()-1)) {
                System.out.print(this.goleador_Local.get(i) + " ---> " + this.goles_Local_Minuto.get(i) + ", ");
            }else {
                System.out.print(this.goleador_Local.get(i) + " ---> " + this.goles_Local_Minuto.get(i));

            }

        }
        System.out.println("]");
        System.out.println();
        System.out.println();


        System.out.println("Levante UD: "+this.gols_Visitantes);
        System.out.print("[");
        for (int i = 0; i < this.goleador_visitante.size(); i++) {

            if (i!=(this.goleador_visitante.size()-1)) {
                System.out.print(this.goleador_visitante.get(i) + " ---> " + this.goles_Visitante_Minuto.get(i) + ", ");
            }else {
                System.out.print(this.goleador_visitante.get(i) + " ---> " + this.goles_Visitante_Minuto.get(i));

            }

        }
        System.out.println("]");


        System.out.println("*******************************");
    }


}
