/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinalCuestionario;
import java.util.*;

/**
 *
 * @author Miriam
 */
public class Arreglo {
    public static ArrayList<Pregunta> obtenerPregunta(){
        
        
        
      //OPCIONES   
        Opcion opc1p1=new Opcion("es muy importante para mi,dedico tiempo a elegir mi ropa", 5);
        Opcion opc2p1=new Opcion("intento no vestir mal,pero no es algo que me preocupe mucho", 3);
        Opcion opc3p1=new Opcion("No es algo que me preocupa", 1);
        
        ArrayList<Opcion> opcionesp1=new ArrayList<>();
                           opcionesp1.add(opc1p1);
                           opcionesp1.add(opc2p1);
                           opcionesp1.add(opc3p1);
                           
                           
        Opcion opc1p2=new Opcion("..mantego la calma y evitar la confrontacion directa", 5);
        Opcion opc2p2=new Opcion("..en ocasiones pierdo el control", 3);
        Opcion opc3p2=new Opcion("..me enfado con facilidad", 1);
        
        ArrayList<Opcion> opcionesp2=new ArrayList<>();
                           opcionesp2.add(opc1p2);
                           opcionesp2.add(opc2p2);
                           opcionesp2.add(opc3p2);
                           
        
        
                           
       //PREGUNTAS                    
        Pregunta p1=new Pregunta("Vestimr bien.....", opcionesp1);
        Pregunta p2=new Pregunta("En una fuerta discusion..", opcionesp2);
        
        ArrayList<Pregunta> preguntas=new ArrayList<>();
                            preguntas.add(p1);
                            preguntas.add(p2);
         
                            
       return preguntas;
                            
   
    
}
    
}
