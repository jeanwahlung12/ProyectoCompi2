/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;

import java.util.ArrayList;

/**
 *
 * @author TOSHIBA
 */
public class Inter {
   String etiqueta;
   ArrayList<String> temporales;

    public Inter(String etiqueta, ArrayList<String> temporales) {
        this.etiqueta = etiqueta;
        this.temporales = temporales;
    }

    public Inter() {
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public ArrayList<String> getTemporales() {
        return temporales;
    }

    public void setTemporales(ArrayList<String> temporales) {
        this.temporales = temporales;
    }

    @Override
    public String toString() {
        return "Inter{" + "etiqueta=" + etiqueta + ", temporales=" + temporales + '}';
    }
   
   
    
}
