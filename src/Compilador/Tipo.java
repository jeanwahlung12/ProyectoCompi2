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
public class Tipo {

    private final String tipo;
    private final String id;
    private final String funcion;
    private final int offset;

    public Tipo(String tipo, String id, String funcion, int offset) {
        this.tipo = tipo;
        this.id = id;
        this.funcion = funcion;
        this.offset = offset;
    }


    public String getTipo() {
        return tipo;
    }

    public String getId() {
        return id;
    }

    public String getFuncion() {
        return funcion;
    }

    public int getOffset() {
        return offset;
    }

    @Override
    public String toString() {
        return "Tipo{" + "tipo = " + tipo + ", id = " + id + ", funcion = " + funcion + ", offset = " + offset + '}';
    }
    
}