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
public class ProbarPreguntas {
    public static void main(String[] args) {
         ArrayList<Pregunta> preguntas=GeneradoPreguntas.obtenerPreguntas();
         
        for(Pregunta p:preguntas)
        {
            System.out.println(p.getTitulo());
            for(Opcion  o:p.getOpciones()){
                System.out.println(o.getTituloOpc());
            }
        }
            
        
    }
    
}
