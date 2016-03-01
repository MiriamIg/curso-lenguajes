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
public class ValidaEmail {

    public static void revisaArroba(String email) throws ArrobaExcepcion{
        if(!email.contains("@")){
            throw new ArrobaExcepcion();
            
        }
            
    }
    
}
