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
public class Cliente {
    
    private String email;
    private int edad;         

    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    public Cliente() {
    }

    /**este metodo nos regresa el email que previamnete 
     * se debio haber proporcionado  por el metodo correspondiente 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**este metodo necesita que proporciones un string que va a sel el mail vas asignar
     * al cliente
     * @param email the email to set   aqui le pones el string correspondiente
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) throws ValorNoNegativoException {
        this.edad = edad;
        ValidarEdad validar=new ValidarEdad();
        validar.checarEdadNegativa(edad);
            //despues de borrar lo que genero el try cath en probar mi excepcion y colocar solo el set 
    }
}
