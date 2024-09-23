package Act5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {

        BufferedReader lector = null;
        String linea;
        List<Alumno> listaAlumnos = new ArrayList<Alumno>();

        try {
            lector = new BufferedReader(new FileReader("alumnos.csv"));

            while ((linea = lector.readLine()) != null) {

                linea = linea.replace(",", ".");

                String[] vector = linea.split(";");
                listaAlumnos.add(new Alumno(vector[0], vector[1], Integer.parseInt(vector[2]), Double.parseDouble(vector[3]), Double.parseDouble(vector[4]), Double.parseDouble(vector[5]), Double.parseDouble(vector[6]), Double.parseDouble(vector[7]), Double.parseDouble(vector[8])));

            }


        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {

            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        listaAlumnos = listaAlumnos.stream()
                .sorted((p1, p2) -> p1.getApellidos().compareTo(p2.getApellidos()))
                .toList();

        listaAlumnos.stream().forEach(System.out::println);


        BufferedWriter escribe = null;

        try {
            escribe = new BufferedWriter(new FileWriter("alumnosOrdenados.txt", true));

            linea = "nombre;apellidos;edad;nota1;nota2;nota3;nota4;nota5;nota6\n";

            escribe.write(linea);

            for (int i = 0; i < listaAlumnos.size(); i++) {

                escribe.write(listaAlumnos.get(i).toString() + "\n");

            }


        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (escribe != null) {
                    escribe.close();
                }

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }

        escribe = null;
        AtomicInteger todoaprovado = new AtomicInteger();
        int numEntre30y70;
        double mediaedad30y70;

        List<Alumno> alumStadisticas = new ArrayList<Alumno>();

        listaAlumnos.stream()
                .filter(p1 -> p1.suspendidas() == 0)
                .sorted((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()))
                .forEach(p1 -> {
                    alumStadisticas.add(p1);
                    todoaprovado.getAndIncrement();
                });
        int aprovad = todoaprovado.get();

        numEntre30y70 = (int) listaAlumnos.stream()
                .filter(p1 -> p1.getEdad() >= 30 && p1.getEdad() <= 70)
                .count();

        mediaedad30y70 = listaAlumnos.stream()
                .mapToDouble(p1 -> p1.getEdad())
                .filter(p1 -> p1 >= 30 && p1 <= 70)
                .average()
                .getAsDouble();

        int nummas90;
        double mediaedadmas90;

        nummas90 = (int) listaAlumnos.stream()
                .filter(p1 -> p1.getEdad() > 90)
                .count();

        mediaedadmas90 = listaAlumnos.stream()
                .mapToDouble(p1 -> p1.getEdad())
                .filter(p1 -> p1 > 90)
                .average()
                .getAsDouble();

        int alumnospasan = (int) listaAlumnos.stream()
                .filter(p1 -> p1.suspendidas() <= 2)
                .count();

        try {
            escribe = new BufferedWriter(new FileWriter("alumnosEstadisticas.txt", true));

            linea = String.valueOf(todoaprovado);
            escribe.write("Alumnos con todo aprovado -> " + linea + "\nAlumnos con todo aprobado:");

            for (int i = 0; i < alumStadisticas.size(); i++) {

                linea = "\n" + alumStadisticas.get(i).getNombre() + " " + alumStadisticas.get(i).getApellidos() + " ";
                escribe.write(linea);

            }

            System.out.println();
            escribe.write("\nAlumnos entre 30 y 70 años -> " + numEntre30y70 + " Media media de edad entre 30 y 70 años -> " + mediaedad30y70 + "\n");
            escribe.write("Alumnos más 90 -> " + nummas90 + "\n Media 90 -> " + mediaedadmas90 + "\n");
            escribe.write(alumnospasan + " Pasan de curso");
            escribe.flush();


        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (escribe != null) {
                    escribe.close();
                }

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        try {

            lector = new BufferedReader(new FileReader("alumnosEstadisticas.txt"));

            System.out.println();
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {

            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }


            FileWriter arch4 = null;
            PrintWriter pw = null;

            Alumno mayorMedia = null;
            Alumno menorMedia = null;
            double temp = 0;
            try {
                arch4 = new FileWriter("alumnosBuenos.txt");
                pw = new PrintWriter(arch4);


                double media;
                pw.println("Alumnos con media superior o igual a 7");

                for (int i = 0; i < listaAlumnos.size(); i++) {

                    media = listaAlumnos.get(i).getNotas().stream()
                            .mapToDouble(p2 -> p2)
                            .average()
                            .getAsDouble();

                    if (media >= 7) {
                        pw.println("Alumno: " + listaAlumnos.get(i).getNombre() + " " + listaAlumnos.get(i).getApellidos() + " Nota media: " + media);
                    }

                    if (media > temp) {
                        temp = media;
                        mayorMedia = listaAlumnos.get(i);
                    }

                }
                if (mayorMedia != null) {
                    pw.println("Mayor nota media: " + mayorMedia.getNombre() + " " + mayorMedia.getApellidos() + " nota media: " + temp);
                }
                temp = 99;
                for (int i = 0; i < listaAlumnos.size(); i++) {
                    media = listaAlumnos.get(i).getNotas().stream()
                            .mapToDouble(p2 -> p2)
                            .average()
                            .getAsDouble();

                    if (media < temp) {
                        temp = media;
                        menorMedia = listaAlumnos.get(i);
                    }

                }
                if (mayorMedia != null) {
                    pw.println("Menor nota media: " + menorMedia.getNombre() + " " + menorMedia.getApellidos() + " nota media: " + temp);
                }


            } catch (IOException e) {
                System.err.println(e.getMessage());
            } finally {

                if (lector != null) {
                    pw.flush();
                    pw.close();
                }

            }

            try {

                lector = new BufferedReader(new FileReader("alumnosBuenos.txt"));

                System.out.println();
                while ((linea = lector.readLine()) != null) {
                    System.out.println(linea);
                }

            } catch (IOException e) {
                System.err.println(e.getMessage());
            } finally {

                try {
                    if (lector != null) {
                        lector.close();
                    }
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }


            }

        }
    }
}
