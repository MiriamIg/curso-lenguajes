/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads implements Runnable {  //polimorfismo
    public static void main(String[] args) {
        //ciclode vida del thread sin contar pausa
        //1.Crear   
        MiPrimerThread t1=new MiPrimerThread();
        //Otro thread 
        Runnable r=new ProbarMisThreads(); //R es el objeto polimorfico 
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        
        //El thread t2 tiene que hacer qe se impriman del 1 al 10 de 5 seg entre impresion 
        //El thread t3 tiene que hacer que se impriman la frase"Todos vamos a morir " hasta el final de los tiempos.cada seg
        
        
        
      //Opciona lo bautizamos
        t1.setName("Chana");
        t2.setName("Juana");
        t3.setName("Pedro");
        
        //2.Inicializado
        t1.start();
        t2.start();
        t3.start();
        
        //3.En ejecucion(Cuando se corra el programa)
        //5.Muerte:cuando complete la tarea que tienen el codigp deñl metodo run
        
    }

    @Override
    public void run() {
        //Primero preguntamos si es el t2
        if(Thread.currentThread().getName().equals("Juana")){
            int x=1;
            
            for(int i=0;i<=30;i++)
            {System.out.println(x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
            
        }
        
        if(Thread.currentThread().getName().equals("Pedro")){
            
            while(true){
                System.out.println("Toodos vamos a morir");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }
        
    }
    
}
