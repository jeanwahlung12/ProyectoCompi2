/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;

import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class Funcion {
    
    private final String tipo;
    private final String id;
    private final String clasificacion;
    private ArrayList<Parametro> parametros = new ArrayList();
    
     public Funcion(String tipo, String id, String Clasificacion) {
        this.tipo = tipo;
        this.id = id;
        this.clasificacion = Clasificacion;
    }


    public String getTipo() {
        return tipo;
    }

    public String getId() {
        return id;
    }
    
    public String getClasificacion() {
        return clasificacion;
    }

    public ArrayList<Parametro> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<Parametro> parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        return "Funcion{" + "tipo = " + tipo + ", id = " + id + ", clasificacion = " + clasificacion + '}';
    }

}