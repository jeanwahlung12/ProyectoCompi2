/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;

/**
 *
 * @author erick
 */
public class Parametro {
    
    private final String tipo;
    private final String id;
    
    public Parametro(String tipo, String id) {
        this.tipo = tipo;
        this.id = id;
    }
    
    public Parametro(String tipo) {
        this.tipo = tipo;
        this.id = "N/A";
    }

    public String getTipo() {
        return tipo;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Parametro{" + "tipo = " + tipo + ", id = " + id + '}';
    }

}