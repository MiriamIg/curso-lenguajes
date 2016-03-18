/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;
import java.util.*;
/**
 *
 * @author Miriam
 */
public class EvaluaRespuesta {
    private boolean bandera;
    public void evaluar(ArrayList<Opcion> opciones){
        
    
    for(Opcion e:opciones){
        if(e.isEstatus()){         
        bandera=true; 
                
        System.out.println("Es correcto ");
       }
        else{
        bandera=false ;     
            System.out.println(":( sorry ");
        }
        
 
    }
   

    
    

}    

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

  
}
