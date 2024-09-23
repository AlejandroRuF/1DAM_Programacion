package Ej1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDoubleEstadistica implements Estadisticas{




    private double[] b;
    private ArrayList<Double> a = new ArrayList<Double>();

    public ArrayDoubleEstadistica(double[] b) {
        this.b = b;
        for (int i = 0; i < b.length; i++ ){

            this.a.add(b[i]);

        }
    }
    public ArrayDoubleEstadistica() {
    }

    public double[] getB() {
        return b;
    }

    public void modifica(int pos, double valor){

        this.a.set(pos,valor);
        this.b[pos] = valor;

    }


    public boolean existe(double x){

        return this.a.contains(x);

    }


    public void borrar(int num){

        this.a.set(num,0d);
        this.b[num]=0;

    }

    @Override
    public double minimo() {

        return  Collections.min(this.a);

    }

    @Override
    public double maximo() {
        return Collections.max(this.a);
    }

    @Override
    public double media() {
        double suma=0;
        for (int i = 0; i < this.a.size(); i++) {

            suma += this.a.get(i);

        }
        return suma/this.a.size();
    }

    @Override
    public int cuantos() {
        return this.b.length;
    }
    public void mostrar() {
        System.out.println("\nVector: ");
        for (int i = 0; i < this.b.length; i++) {

            System.out.printf("%5.2f%n", this.b[i]);

        }
    }
}