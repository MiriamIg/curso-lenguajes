/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.threads;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads {
    public static void main(String[] args) {
        //ciclode vida del thread sin contar pausa
        //1.Crear   
        MiPrimerThread t1=new MiPrimerThread();
        //Opciona lo bautizamos
        t1.setName("Chana");
        
        //2.Inicializado
        t1.start();
        
        //3.En ejecucion(Cuando se corra el programa)
        //5.Muerte:cuando complete la tarea que tienen el codigp deñl metodo run
        
    }
    
}
