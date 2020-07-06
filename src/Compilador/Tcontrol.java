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
public class Tcontrol {
    private String temporal;
    private String activo;
    private String llamado;

    public Tcontrol(String temporal, String activo, String llamado) {
        this.temporal = temporal;
        this.activo = activo;
        this.llamado = llamado;
    }

    public String getTemporal() {
        return temporal;
    }

    public void setTemporal(String temporal) {
        this.temporal = temporal;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getLlamado() {
        return llamado;
    }

    public void setLlamado(String llamado) {
        this.llamado = llamado;
    }
    
    
}
