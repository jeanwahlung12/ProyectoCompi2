/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;

/**
 *
 * @author TOSHIBA
 */
public class Cuadruplo {

    String Op;
    String arg1;
    String arg2;
    String res;

    public Cuadruplo() {
    }

    public Cuadruplo(String Op, String arg1, String arg2, String res) {
        this.Op = Op;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.res = res;
    }

    public Cuadruplo(String Op, String arg1) {
        this.Op = Op;
        this.arg1 = arg1;
        this.arg2 = "";
        this.res = "";
    }

    public String getOp() {
        return Op;
    }

    public void setOp(String Op) {
        this.Op = Op;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "Cuadruplo{" + "Op: " + Op + ", arg1: " + arg1 + ", arg2: " + arg2 + ", res: " + res + '}';
    }

}
