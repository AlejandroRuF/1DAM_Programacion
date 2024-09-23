package org.example.calculadoracompleja;

public class Operaciones {

    private double op1;
    private double op2;

    public Operaciones() {
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public Double resta(double op1, double op2){
        return op1 - op2;
    }

    public Double multiplica(double op1, double op2){
        return op1 * op2;
    }

    public Double divide(double op1, double op2) throws Exception {
        if (op2 == 0) {

            throw new Exception("No puedes dividir entre 0");

        }else{
        return op1 / op2;
        }
    }
    public Double suma(double op1, double op2){
        return op1 + op2;
    }
    public Double resto(double op1, double op2) throws Exception {
        if (op2 == 0) {

            throw new Exception("No puedes dividir entre 0");

        }else{
        return op1%op2;
        }
    }


}
