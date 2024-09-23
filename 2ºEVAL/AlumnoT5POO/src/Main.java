import java.util.Scanner;

public class Main {

    public static void leerAlumno(Alumno a){

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nombre del alumno");
        a.setNombre(sc.next());
        System.out.println("Escriba el curso del alumno");
        a.setCurso(sc.next());
        System.out.println("Escriba la edad del alumno");
        a.setEdad(sc.nextInt());
        System.out.println("Escriba el numero del alumno");
        a.setNum(sc.nextInt());

    }

    public static void imprimirAlumno(Alumno a){

        System.out.println("Alumno:\n" +
                "   Nombre: "+a.getNombre()+
                "   Curso: "+a.getCurso()+
                "   Edad: "+a.getEdad()+
                "   Numero: "+a.getNum());

    }

    public static void copiaAlumno(Alumno origen, Alumno destino){
        destino.setNombre(origen.getNombre());
        destino.setCurso(origen.getCurso());
        destino.setEdad(origen.getEdad());
        destino.setNum(origen.getNum());


    }

    public static boolean igualAlumno(Alumno origen, Alumno destino){

        if (origen.getNombre() == destino.getNombre() && origen.getCurso() == destino.getCurso() && origen.getEdad() == destino.getEdad() && origen.getNum() == destino.getNum()){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {

        Alumno al1 = new Alumno(125,20,"1ºDAM","EMI");

        imprimirAlumno(al1);

        Alumno al2 =new Alumno();

        leerAlumno(al2);

        imprimirAlumno(al2);

        System.out.println("\nCopiamos al1 a al3\n");

        Alumno al3 = new Alumno();

        copiaAlumno(al1,al3);

        imprimirAlumno(al3);

        System.out.println("Al1 == Al3? --> "+igualAlumno(al1,al3));


    }
}