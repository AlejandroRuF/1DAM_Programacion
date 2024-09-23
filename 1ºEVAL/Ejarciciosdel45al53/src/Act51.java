import java.util.Scanner;

public class Act51 {
    /*Escribir un programa que permita almacenar una contraseña y acceder al sistema. El
programa debe presentar un menú con las siguientes opciones:
Introducir contraseña.
Cambiar contraseña. (Para permitir esta opción será necesario ingresar la contraseña
antigua).
Acceder al sistema. (Esta opción mostrará un mensaje al usuario de que está dentro del
sistema y le preguntará si desea salir; si es así volverá al menú principal. Para acceder a esta
opción la contraseña introducida debe ser correcta.)
Salir.
La contraseña estará formada por 4 dígitos entre el 0 y el 9.*/


    public static void main(String[] args) {

        String pass="0000";
        String introducepass;
        String[] numeros= {"0","1","2","3","4","5","6","7","8","9"};
        int nuevapass;
        int opcion;
        int opcionmenu2;
        int errores=0;
        int largopass;
        int compruebanumero;
        boolean correcto=false;
        boolean letra=false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Que quieres hacer\n1- Acceder al Sistema\n2- Salir");
            opcion= sc.nextInt();
            if (opcion==1){
                System.out.println("Introduce la contraseña por favor tienes "+(3-errores)+" intentos");
                introducepass= sc.next();
                if (introducepass.equals(pass)){
                    System.out.println("Correcto!!");
                    errores=0;
                    do {
                        System.out.println("Que quieres hacer\n1- Cambiar la contraseña\n2- Leer el mensaje\n3- Salir");
                        opcionmenu2= sc.nextInt();
                        if (opcionmenu2==1){
                            System.out.println("Para cambiar la contraseña debes introducir primero la contraseña anterior");
                            introducepass=sc.next();
                            if (introducepass.equals(pass)){

                                do {
                                    System.out.println("Introduce la nueva contraseña por favor debe ser numerica ");
                                    introducepass = sc.next();
                                    largopass= introducepass.length();
                                    try{
                                        compruebanumero=Integer.parseInt(introducepass);
                                        letra=false;
                                    }catch(Exception e) {
                                        letra = true;
                                    }

                                    if (largopass == 4 && !letra) {

                                        System.out.println("La contraseña ha sido cambiada");
                                        pass = introducepass;
                                        correcto=true;

                                    } else {

                                        System.out.println("La contraseña debe ser numerica y tener cuatro caracteres de extension");

                                    }
                                }while(!correcto);
                                correcto=false;
                            }else {

                                System.out.println("No has introducido la contraseña correctamente");

                            }


                        } else if (opcionmenu2==2) {

                            System.out.println("jaja no hay ningun mensaje");

                        }


                    }while (opcionmenu2!=3);

                }else {

                    System.out.println("Error!!! La contraseña es incorrecta");
                    errores++;
                    if (errores>=3){

                        opcion=2;

                    }

                }

            }
        }while(opcion!=2);

    }

}
