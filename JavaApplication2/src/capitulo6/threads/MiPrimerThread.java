/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.threads;

/**
 *
 * @author T-101
 * Creacion de un thread heredando la clase "Thread"
 */
public class MiPrimerThread extends Thread{

    @Override
    public void run() {
        System.out.println("Soy un thread y me llamo "  + this.getName());      //this. -->de esta clase dame el metodo get name 
    }
    
    
}
