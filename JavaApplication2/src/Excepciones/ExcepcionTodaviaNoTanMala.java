/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author T-101
 */
public class ExcepcionTodaviaNoTanMala {
    public static void main(String[] args) {
        //Declaramos un arreglo de enteros
        
        int x[]={4,-20,12,1,8,9,6,3,5,45,5};                     //explicita
        float[]y=new float[4];                      //implicita porque solo especifica el tamaño
       
        float z;
        
      //todos los arrelgos son tratados como objetos 
       // System.out.println(x[5]);
        
        A objeto=new A();
        System.out.println(objeto.m);            //se inicializa  al objeto con 0
        System.out.println(y[2]);               //es tratado como eobjeto su valor es el que tieene m
        //System.out.println(z);                //error por que no es un objeto
        
       /* for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
            
        }*/
        for(int w:x)
        {System.out.println(w);}
        
    }
    
}


class A{
    float m;
}