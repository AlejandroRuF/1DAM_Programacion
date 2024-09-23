public class Main {
    public static void main(String[] args) {

        Nombre yo = new Nombre("Alex","Ruiz", "Fora");
        Domicilio mid = new Domicilio("c/Joan Cristofol","18","9","8","46111","Manises");

        String art = "Tana";

        Fecha dat = new Fecha(18,02,1990);

        Concursante con = new Concursante(yo,art,mid,dat);

        System.out.println(con.mostrar());

    }
}