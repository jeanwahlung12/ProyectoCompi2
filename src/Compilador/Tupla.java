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
public class Tupla {
    
    private String dominio;
    private String rango;
    
    public Tupla(String dominio, String rango) {
        this.dominio = dominio;
        this.rango = rango;
    }

    public String getDominio() {
        return dominio;
    }

    public String getRango() {
        return rango;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Tupla{" + "dominio = " + dominio + ", rango = " + rango + '}';
    }
    
}