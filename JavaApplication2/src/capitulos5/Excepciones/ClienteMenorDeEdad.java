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
public class ClienteMenorDeEdad {
    private String email;
    private int edad;

  public ClienteMenorDeEdad(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    ClienteMenorDeEdad() {
        
    }
    
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) throws ArrobaExcepcion{
        ValidaEmail.revisaArroba(email);
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }
    
      public void setEdad(int edad)throws ValorNoNegativoExcepcion, MenorDeEdadExcepcion{
             
        ValidarEdad.checarEdadNegativa(edad);
        ValidarEdad.checarMenorEdad(edad); 
        
        
        this.edad = edad;
        
    }

  
    
    
}
