/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Jean Wahlung
 */
public class Arbol {

    public Arbol() {
    }

    public void CrearArchivo(String ast) {
        String[] arbolito = ast.split("\n");
        String superarbolito = "\n";
        for (int i = 0; i < arbolito.length; i++) {
            if (arbolito[i].equals("") || arbolito[i].contains("->")) {
                superarbolito += arbolito[i] + "\n";
            }
        }
        String grafo = "digraph G{" + superarbolito + "\n}";
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("src/Compilador/AFT.txt");
            pw = new PrintWriter(fichero);
            pw.print(grafo);
            if (null != fichero) {
                fichero.close();
            }

        } catch (Exception e) {

        }
    }

}
