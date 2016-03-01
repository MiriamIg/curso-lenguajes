/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTipoExa1;

/**
 *
 * @author T-101
 */
public class GenerarClientes {
public static Clientes[]  obtenerCliente() {
    
   Clientes[] c=new Clientes[3];
               c[0]=new Clientes("Ana", "Lopez", 20, 22000, new direcccion("sur 11",20,"Ecatepunk"));
    
                
               
    return c;
  
    
       
    }

    
    
  
}
