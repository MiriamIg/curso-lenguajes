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
public class GeneradoPreguntas {
    public static ArrayList<Pregunta> obtenerPreguntas(){
        
        Opcion op1=new Opcion("Moscu",true);
        Opcion op2=new Opcion("Florencia ", false);
        Opcion op3=new Opcion("Paris", false);
        Opcion op4=new Opcion("Londres", false);
        
                
        Opcion op1p2=new Opcion("Tokio",false);
        Opcion op2p2=new Opcion("Beijing ", true);
        Opcion op3p2=new Opcion("Seul", false);
        Opcion op4p2=new Opcion("Pyonjiang", false);
        
                
        ArrayList<Opcion>   opciones=new ArrayList<Opcion>();
                            opciones.add(op1);
                            opciones.add(op2);
                            opciones.add(op3);
                            opciones.add(op4);
        
        ArrayList<Opcion>   opciones2=new ArrayList<Opcion>();
                            opciones2.add(op1p2);
                            opciones2.add(op2p2);
                            opciones2.add(op3p2);
                            opciones2.add(op4p2);
                            
                            
        Pregunta p1=new Pregunta("Capital de Rusia",opciones);
        Pregunta p2=new Pregunta("Capital de China ", opciones2);
        
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
                            preguntas.add(p1);
                            preguntas.add(p2);
                            
       
        
                            
        return preguntas;
        
        
    
        
        
    }
    
}
