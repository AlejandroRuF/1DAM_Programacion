package Ej1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDoubleEstadistica implements Estadisticas {

    private ArrayList<Double> a;

    public ArrayListDoubleEstadistica(ArrayList<Double> a) {
        this.a = new ArrayList<Double>(a);
    }
    public ArrayListDoubleEstadistica() {
    }

    public ArrayList<Double> getA() {
        return a;
    }

    public void modifica(int pos, double valor){

        this.a.set(pos,valor);

    }

    public void anyadir(double num){

        this.a.add(num);

    }
    public void anyadir(int pos,double num){

        this.a.add(pos,num);

    }

    public boolean existe(double x){

      return this.a.contains(x);

    }

    public void borrar(double num){

    int ind = this.a.indexOf(num);
    this.a.remove(ind);

    }

    public void borrar(int num){

        this.a.remove(num);

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
        return this.a.size();
    }

    public void mostrar() {
        System.out.println("\nVector: ");
        for (int i = 0; i < this.a.size(); i++) {

            System.out.printf("%5.2f%n", this.a.get(i));

        }
    }
}
