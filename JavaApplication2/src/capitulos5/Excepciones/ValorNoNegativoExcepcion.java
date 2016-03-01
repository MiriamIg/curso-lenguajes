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
public class ValorNoNegativoExcepcion extends Exception{
    
    //COnstructor :cuando se cree un objeto valorNoNegativoExcepcion se ejecutara el codigo introduciso

 
    public ValorNoNegativoExcepcion(){
        super("No puedes meter un valor negativo");
    }
}