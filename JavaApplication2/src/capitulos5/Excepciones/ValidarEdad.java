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
public class ValidarEdad {
    public static void checarEdadNegativa(int edad)throws ValorNoNegativoExcepcion{
       if(edad<0)throw new ValorNoNegativoExcepcion();
    }
    
    public static void checarMenorEdad(int edad)throws MenorDeEdadExcepcion{
        if(edad<18)throw new MenorDeEdadExcepcion();
    }
}
