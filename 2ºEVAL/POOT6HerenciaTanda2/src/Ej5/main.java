package Ej5;

public class main {

    public static void main(String[] args) {
// write your code here
        Region esp = new RegionEspanyola("Valencia");
        Region ing = new RegionInglesa("Manchester");
        String fechaEspanyola = esp.formatear(3, 2, 2022);
        String fechaInglesa = ing.formatear(3, 2, 2022);
        System.out.println("Fecha Española: " + fechaEspanyola);
        System.out.println("Fecha Inglesa: " + fechaInglesa);

    }
}
