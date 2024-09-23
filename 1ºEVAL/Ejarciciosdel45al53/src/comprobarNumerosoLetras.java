import java.util.Scanner;

public class comprobarNumerosoLetras {

    // Método que verifica si la cadena de entrada es un número de 4 dígitos
    public static boolean comprobado(String suma2) {
        // Verifica si la cadena contiene solo dígitos y tiene longitud 4
        if (suma2.matches("\\d+") && suma2.length() == 4) {
            /*.	Cualquier carácter (puede coincidir o no con los terminadores de línea)
            \d	----> Un dígito:[0-9]
            \D	---->	Un no dígito:[^0-9]
            \s	---->	Un carácter de espacio en blanco:[ \t\n\x0B\f\r]
            \S	---->	Un carácter que no es un espacio en blanco:[^\s]
            \w	---->	Un carácter de palabra:[a-zA-Z_0-9]
            \W	---->	Un carácter que no es palabra:[^\w]*/
            System.out.println("Contraseña cambiada correctamente");
            return true;
        } else {
            System.out.println("Contraseña no valida, recuerde que debe tener 4 dígitos y no puede contener letras");
            return false;
        }
    }

    public static void main(String[] args) {
        // Declaración e inicialización de variables
        String contrasenya = "4444"; // Contraseña por defecto
        String contrasenya_aux; // Variable para almacenar la contraseña ingresada por el usuario
        int inicio; // Variable para almacenar la opción de inicio seleccionada por el usuario
        boolean contrasenyaC; // Variable para indicar si la contraseña es correcta

        // Objeto Scanner para la entrada de datos
        Scanner sc = new Scanner(System.in);

        // Mensaje de bienvenida
        do {
            System.out.println("------------BIENVENDIO USUARIO------------");
            System.out.println("(1) Iniciar Sesión\n(2) Cambiar Contraseña\n(3) Salir");
            inicio = sc.nextInt(); // Lee la opción de inicio seleccionada por el usuario


            // Estructura de control switch para manejar las opciones de inicio
            switch (inicio) {
                case 1:
                    // Iniciar sesión
                    System.out.println("Para iniciar sesión, introduzca su contraseña");
                    do {
                        contrasenya_aux = sc.next(); // Lee la contraseña ingresada por el usuario

                        // Verifica si la contraseña es correcta
                        if (contrasenya_aux.equals(contrasenya)) {
                            contrasenyaC = true;
                            System.out.println("Bienvenido al sistema");
                        } else {
                            contrasenyaC = false;
                            System.out.println("Contraseña incorrecta. Por favor, vuelva a intentarlo");
                        }
                    } while (!contrasenyaC); // Continúa solicitando la contraseña hasta que sea correcta
                    break;

                case 2:
                    // Cambiar contraseña
                    System.out.println("Para cambiar la contraseña primero debes iniciar sesión. Introduzca su contraseña");
                    contrasenya_aux = sc.next();

                    // Verifica si la contraseña es correcta para permitir el cambio
                    if (contrasenya_aux.equals(contrasenya)) {
                        contrasenyaC = true;
                        System.out.println("Bienvenido al sistema");

                        System.out.println("Introduzca su nueva contraseña");
                        // Lee la nueva contraseña ingresada por el usuario
                        contrasenya_aux = sc.next();

                        // Verifica si la nueva contraseña es válida mediante el método comprobado
                        if (comprobado(contrasenya_aux)) {
                            contrasenya = contrasenya_aux; // Actualiza la contraseña con la nueva contraseña
                            System.out.println("Tu nueva contraseña es: " + contrasenya);
                        }

                    } else {
                        contrasenyaC = false;
                        System.out.println("Contraseña incorrecta. Por favor, vuelva a intentarlo");
                    }
                    break;

                case 3:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Introduce una opcion valida");
            }
        }while (inicio!=3);
    }

}
