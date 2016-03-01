/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulos5.Excepciones;


/**
 *
 * @author Miriam
 */
public class ProbarMiExcepcion {
    public static void main(String[] args) {
       try{ 
        ClienteMenorDeEdad c=new ClienteMenorDeEdad();
        c.setEdad(-8);
          }
       
       catch(ValorNoNegativoExcepcion | MenorDeEdadExcepcion ex){
           System.out.println(ex.getMessage());}
       finally{
           System.out.println("Siempre se ejcuta");
           
       }
    }
  
}
