public class Main {

    public static void main(String[] args) {

        try{
            if (ConexionBD.getConnection()!=null){
                System.out.println("Conexion establecida");
            }else{
                System.err.println("Conexion no establecida");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            ConexionBD.closeConnection();
        }
    }
}
