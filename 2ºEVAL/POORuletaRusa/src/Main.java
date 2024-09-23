public class Main {
    public static void main(String[] args) throws Exception {
        Juego juego = new Juego(6);
        while( !juego.finJuego() ){
            juego.ronda();
        }
        System.out.println("Fin del juego");
    }
}