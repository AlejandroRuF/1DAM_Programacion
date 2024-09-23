import java.util.ArrayList;
import java.util.Collections;

public class Coto {

    private ArrayList<Animal> anim = new ArrayList<Animal>();
    private ArrayList<Cazador> cazadores = new ArrayList<Cazador>();

    private ArrayList<String> piezasDeCaza = new ArrayList<String>();

    public Coto() {

        this.anim.add(new Corzo("Corzo 1", 4, "Negro", 30));
        this.anim.add(new Corzo("Corzo 2", 4, "Rallado", 32));
        this.anim.add(new Corzo("Corzo 3", 4, "Negro", 28));
        this.anim.add(new Corzo("Corzo 4", 4, "Pardo", 20));
        this.anim.add(new Corzo("Corzo 5", 4, "Marron", 17));
        this.anim.add(new Jabali("Jabali 1", 4, "Rallado", 15, 2));
        this.anim.add(new Jabali("Jabali 2", 4, "Rallado", 12, 1));
        this.anim.add(new Jabali("Jabali 3", 4, "Marron", 10, 2));
        this.anim.add(new Jabali("Jabali 4", 4, "Pardo", 5, 1));
        this.anim.add(new Jabali("Jabali 5", 4, "Pardo", 20, 2));
        this.anim.add(new Perdiz("Perdiz 1", 2, "Pardo", 30, true));
        this.anim.add(new Perdiz("Perdiz 2", 2, "Pardo", 30, true));
        this.anim.add(new Perdiz("Perdiz 3", 2, "Pardo", 30, false));
        this.anim.add(new Perdiz("Perdiz 4", 2, "Pardo", 30, true));
        this.anim.add(new Perdiz("Perdiz 5", 2, "Pardo", 30, true));

        this.cazadores.add(new Cazador("Manu", 40, "Benelli Belmonte"));
        this.cazadores.add(new Cazador("Loren", 42, "Blaser F16 Caza"));
    }

    public void ordenarCazadorNombre() {

        Collections.sort(this.cazadores, new ComparadorNombre());

    }

    public void ordenarCazadorEdad() {

        Collections.sort(this.cazadores, new ComparadorEdad());

    }

    public void mostrarCoto() {

        for (int i = 0; i < this.anim.size(); i++) {

            if (this.anim.get(i) instanceof Corzo a) {
                a = (Corzo) this.anim.get(i);
                System.out.println(a.toString());
            } else if (this.anim.get(i) instanceof Jabali b) {
                b = (Jabali) this.anim.get(i);
                System.out.println(b.toString());
            } else if (this.anim.get(i) instanceof Perdiz c) {
                c = (Perdiz) this.anim.get(i);
                System.out.println(c.toString());
            }


        }

    }

    public void Batida() {

        int contador = 0;
        while (contador < 40) {

            int aleatorio = (int) (Math.random() * this.anim.size());
            String acc;

            if (this.cazadores.get(0).Accion().equalsIgnoreCase("Disparar") && this.anim.size() > 0) {

                if (this.anim.get(aleatorio) instanceof Corzo a) {
                    a = (Corzo) this.anim.get(aleatorio);
                    acc = a.Accion();
                    if (acc.equalsIgnoreCase("Comer") || acc.equalsIgnoreCase("Beber Agua")) {

                        this.piezasDeCaza.add(this.cazadores.get(0).getNombre()+", cazó " + a.toString());
                        this.anim.remove(aleatorio);

                    }
                } else if (this.anim.get(aleatorio) instanceof Jabali b) {
                    b = (Jabali) this.anim.get(aleatorio);
                    acc = b.Accion();
                    if (acc.equalsIgnoreCase("Atacar") || acc.equalsIgnoreCase("Beber Agua")) {

                        this.piezasDeCaza.add(this.cazadores.get(0).getNombre()+", cazó " + b.toString());
                        this.anim.remove(aleatorio);
                    }

                } else if (this.anim.get(aleatorio) instanceof Perdiz c) {
                    c = (Perdiz) this.anim.get(aleatorio);
                    acc = c.Accion();
                    if (acc.equalsIgnoreCase("Volar Alto") || acc.equalsIgnoreCase("Beber Agua")) {

                        this.piezasDeCaza.add(this.cazadores.get(0).getNombre()+", cazó " + c.toString());
                        this.anim.remove(aleatorio);
                    }
                }

            }else if (this.cazadores.get(1).Accion().equalsIgnoreCase("Disparar") && this.anim.size() > 0) {

                if (this.anim.get(aleatorio) instanceof Corzo a) {
                    a = (Corzo) this.anim.get(aleatorio);
                    acc = a.Accion();
                    if (acc.equalsIgnoreCase("Comer") || acc.equalsIgnoreCase("Beber Agua")) {

                        this.piezasDeCaza.add(this.cazadores.get(1).getNombre()+", cazó " + a.toString());
                        this.anim.remove(aleatorio);

                    }
                } else if (this.anim.get(aleatorio) instanceof Jabali b) {
                    b = (Jabali) this.anim.get(aleatorio);
                    acc = b.Accion();
                    if (acc.equalsIgnoreCase("Atacar") || acc.equalsIgnoreCase("Beber Agua")) {

                        this.piezasDeCaza.add(this.cazadores.get(1).getNombre()+", cazó " + b.toString());
                        this.anim.remove(aleatorio);
                    }

                } else if (this.anim.get(aleatorio) instanceof Perdiz c) {
                    c = (Perdiz) this.anim.get(aleatorio);
                    acc = c.Accion();
                    if (acc.equalsIgnoreCase("Volar Alto") || acc.equalsIgnoreCase("Beber Agua")) {

                        this.piezasDeCaza.add(this.cazadores.get(1).getNombre()+", cazó " + c.toString());
                        this.anim.remove(aleatorio);
                    }
                }

            }

                contador++;
        }

    }

    public void mostrarCaza(){

        for (int i = 0; i < this.piezasDeCaza.size(); i++) {

            System.out.println(piezasDeCaza.get(i));
            System.out.println();

        }

    }

}

