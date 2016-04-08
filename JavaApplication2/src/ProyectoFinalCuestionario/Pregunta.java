/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinalCuestionario;
import java.util.*;
/**
 *
 * @author T-101
 */
public class Pregunta {
    private String pregunta;
    private ArrayList<Opcion> opciones;
    

    public Pregunta(String pregunta, ArrayList<Opcion> opciones) {
        this.pregunta = pregunta;
        this.opciones = opciones;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    
           
    
}
