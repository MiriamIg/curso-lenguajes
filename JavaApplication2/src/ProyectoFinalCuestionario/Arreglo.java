/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinalCuestionario;

import java.util.*;
import javax.swing.JRadioButton;

/**
 *
 * @author Miriam
 */
public class Arreglo {
    public static ArrayList<Pregunta> obtenerPregunta(){
       
        
        
      //OPCIONES   
        Opcion opc1p1=new Opcion("es muy importante,dedico tiempo a elegir mi ropa", 1);
        Opcion opc2p1=new Opcion("no visto mal,pero no es algo que me preocupe mucho", 2);
        Opcion opc3p1=new Opcion("No me preocupa", 3);
        
        ArrayList<Opcion> opcionesp1=new ArrayList<>();
                           opcionesp1.add(opc1p1);
                           opcionesp1.add(opc2p1);
                           opcionesp1.add(opc3p1);
                           
                           
        Opcion opc1p2=new Opcion("..mantego la calma y evito la confrontacion directa", 1);
        Opcion opc2p2=new Opcion("..en ocasiones pierdo el control", 2);
        Opcion opc3p2=new Opcion("..me enfado con facilidad", 3);
        
        ArrayList<Opcion> opcionesp2=new ArrayList<>();
                           opcionesp2.add(opc1p2);
                           opcionesp2.add(opc2p2);
                           opcionesp2.add(opc3p2);
        
                          
        Opcion opc1p3=new Opcion("de estrategia y planificacion como ajedez,videojuegos", 1);
        Opcion opc2p3=new Opcion("rapidos,como videojuegos de accion,carreras o deportes", 2);
        Opcion  opc3p3=new Opcion("solo que me puedran entrener", 3);
        
        
           ArrayList<Opcion> opcionesp3=new ArrayList<>();
                           opcionesp3.add(opc1p3);
                           opcionesp3.add(opc2p3);
                           opcionesp3.add(opc3p3);                 
                           
                           
        Opcion opc1p4=new Opcion("Muy estable", 1);
        Opcion opc2p4=new Opcion("A veces tengo altibajos ", 2);
        Opcion  opc3p4=new Opcion("Muy variable", 3);
        
          
          ArrayList<Opcion> opcionesp4=new ArrayList<>();
                           opcionesp4.add(opc1p4);
                           opcionesp4.add(opc2p4);
                           opcionesp4.add(opc3p4);
         
                           
        Opcion opc1p5=new Opcion("Con mucha fercuencia ", 1);
        Opcion opc2p5=new Opcion("De ven en cuando", 2);
        Opcion opc3p5=new Opcion("Rara la vez ", 3);
        
          
          ArrayList<Opcion> opcionesp5=new ArrayList<>();
                           opcionesp5.add(opc1p5);
                           opcionesp5.add(opc2p5);
                           opcionesp5.add(opc3p5);
                           
                           
                           
        Opcion opc1p6=new Opcion("Prefieres trabajar solo, asi se hacen las coas bien ", 1);
        Opcion opc2p6=new Opcion("consigues un grupode fieles que hagan el trabajo sucio", 2);
        Opcion opc3p6=new Opcion("Intentas coseguir multitudes que luchen por ti", 3);
        
          
          ArrayList<Opcion> opcionesp6=new ArrayList<>();
                           opcionesp6.add(opc1p6);
                           opcionesp6.add(opc2p6);
                           opcionesp6.add(opc3p6);
       
        Opcion opc1p7=new Opcion("Tendria piedad con los humanos que se sometiesen a mi", 1);
        Opcion opc2p7=new Opcion("¿Humanos?porque no poblar el mundo con algo mejor ", 2);
        Opcion opc3p7=new Opcion("Mientras yo tenga el poder no tengo preferencia ", 3);
        
          
          ArrayList<Opcion> opcionesp7=new ArrayList<>();
                           opcionesp7.add(opc1p7);
                           opcionesp7.add(opc2p7);
                           opcionesp7.add(opc3p7);
                           
        
                          
                           
       //PREGUNTAS                    
        Pregunta p1=new Pregunta("Vestime bien.....", opcionesp1);
        Pregunta p2=new Pregunta("En una fuerta discusion..", opcionesp2);
        Pregunta p3=new Pregunta("Prefieres los juegos....", opcionesp3);
        Pregunta p4=new Pregunta("Tu estado de animo suele ser.....", opcionesp4);
        Pregunta p5=new Pregunta("Lees libros por gusto con frecuencia.", opcionesp5);
        Pregunta p6=new Pregunta("si pudieras controlar el mundo ¿como trabajarias?", opcionesp6);
        Pregunta p7=new Pregunta("Una vez asegurado el control de planeta...", opcionesp7);
        
        ArrayList<Pregunta> preguntas=new ArrayList<>();
                            preguntas.add(p1);
                            preguntas.add(p2);
                            preguntas.add(p3);
                            preguntas.add(p4);
                            preguntas.add(p5);
                            preguntas.add(p6);
                            preguntas.add(p7);
       return preguntas;
       
                            
}    
}
