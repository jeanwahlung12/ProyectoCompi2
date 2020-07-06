 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creadores;

/**
 *
 * @author Jean Wahlung
 */
public class Sintactico {

    public static void main(String[] args) {
        String lista[] = new String[7];
        lista[0] = "-destdir";
        lista[1] = "src/Compilador";
        lista[2] = "-symbols";
        lista[3] = "simbolo";
        lista[4] = "-parser";
        lista[5] = "Analizador";
        lista[6] = "src/Compilador/archivo_cup.cup";
        try {
            java_cup.Main.main(lista);
        } catch (Exception e) {
        }

    }
}
