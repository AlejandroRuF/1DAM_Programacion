public class Main {
    public static void main(String[] args) {
// Se crea el Coto
        Coto c = new Coto();
// Ordenamos los cazadores descendentemente por nombre
        c.ordenarCazadorNombre();
        System.out.println();
// Mostramos el estado del coto
        c.mostrarCoto();
        System.out.println();
// Llevamos a cabo una batida
        c.Batida();
        System.out.println();
// Mostramos el resultado de la batida
        c.mostrarCaza();
        System.out.println();
// Reordenamos los cazadores por Edad
        c.ordenarCazadorEdad();
        System.out.println();
// Volvemos a mostrar el coto
        c.mostrarCoto();
        
    }
}