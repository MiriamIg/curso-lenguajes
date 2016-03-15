/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;
import java.util.*;



/**
 *
 * @author T-101
 */
public class Pregunta {
     private String Titulo;
     private ArrayList <Opcion> opciones;     

    public Pregunta(String Titulo, ArrayList<Opcion> opciones) {
        this.Titulo = Titulo;
        this.opciones = opciones;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the opciones
     */
    public ArrayList <Opcion> getOpciones() {
        return opciones;
    }

    /**
     * @param opciones the opciones to set
     */
    public void setOpciones(ArrayList <Opcion> opciones) {
        this.opciones = opciones;
    }
    
    
}
