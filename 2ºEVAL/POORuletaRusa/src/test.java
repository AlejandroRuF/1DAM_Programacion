public class test {

    public static void main(String[] args) {



        for (int i = 0; i < 10000; i++) {
            int bala = (int) (Math.random()*6)+1;
            if(bala == 0 || bala == 7){
            System.out.println(bala);
            }
        }

    }

}
