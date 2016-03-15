/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;

/**
 *
 * @author T-101
 */
public class Opcion {
    private String TituloOpc;
    private Boolean estatus;

    public Opcion(String TituloOpc, Boolean estatus) {
        this.TituloOpc = TituloOpc;
        this.estatus = estatus;
    }

    /**
     * @return the TituloOpc
     */
    public String getTituloOpc() {
        return TituloOpc;
    }

    /**
     * @param TituloOpc the TituloOpc to set
     */
    public void setTituloOpc(String TituloOpc) {
        this.TituloOpc = TituloOpc;
    }

    /**
     * @return the estatus
     */
    public Boolean getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }
    
}
