/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*PRACTICA 3 
 */
package capitulos5.Excepciones;

/**
 *
 * @author T-101
 */
public class ValorNoNegativoException extends Exception{            // hereda la clase Exception
    
    public ValorNoNegativoException(){
       super("No puedes meter valor negativo");                      //super invoca al papá 
    }
    
}
