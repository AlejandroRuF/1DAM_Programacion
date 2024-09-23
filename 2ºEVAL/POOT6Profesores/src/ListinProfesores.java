import java.util.ArrayList;

public class ListinProfesores{

    ArrayList<Profesor> listprofe;

    public ListinProfesores(ArrayList<Profesor> listprofe) {
        this.listprofe = new ArrayList<Profesor>(listprofe);
    }

    public ListinProfesores() {
        this.listprofe = new ArrayList<Profesor>();
    }

    public ArrayList<Profesor> getListprofe() {
        return listprofe;
    }

    public void setListprofe(ArrayList<Profesor> listprofe) {
        this.listprofe.addAll(listprofe);
    }

    public void listar(){

        for (int i = 0; i < this.listprofe.size(); i++) {

            if (listprofe.get(i) instanceof ProfesorInterino){

                ProfesorInterino a = (ProfesorInterino) listprofe.get(i);
                a.mostrarDatos();

            } else if (listprofe.get(i) instanceof ProfesorTitular){

                ProfesorTitular b = (ProfesorTitular) listprofe.get(i);
                b.mostrarDatos();

            }else {

                listprofe.get(i).mostrarDatos();

            }

        }

    }

    public void anyadirProfesor(Profesor profe){

        this.listprofe.add(profe);

    }

}
