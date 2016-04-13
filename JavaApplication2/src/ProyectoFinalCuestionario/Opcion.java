/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinalCuestionario;

/**
 *
 * @author T-101
 */
public class Opcion {
    private String opc;
    private int puntos;
    

    public Opcion(String opc, int puntos) {
        this.opc = opc;
        this.puntos = puntos;
    }

    public String getOpc() {
        return opc;
    }

    public void setOpc(String opc) {
        this.opc = opc;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    

    

    
    
}
