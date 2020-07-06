/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creadores;

import java.io.File;

/**
 *
 * @author Jean Wahlung
 */
public class Lexico {
    public static void main(String[] args) {
        String ruta = "src/Compilador/Compilador.jflex";
        crear(ruta);
    }
    public static void crear(String ruta) {
        File file = new File(ruta);
        jflex.Main.generate(file);
    }
}
