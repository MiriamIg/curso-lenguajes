/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulos5.Excepciones;

/**
 *
 * @author T-101
 */
public class ValidarEdad {
    public void checarEdadNegativa(int edad) throws ValorNoNegativoException{                   // clase qValidarEdad contenga un metodo  checharEdadNegativa(int edad)
       
        if(edad<0) {throw new ValorNoNegativoException();
        }
    }
}
