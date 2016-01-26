/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author T-101
 * clase modelo IMC encapsulada y con 2 constructores.
 * encapsulamiento
 * 1.Agregar a los atributos modificador de acces private
 * 2.Por cada atributo implementar un metodo get(getters).
 * 3.Por cada atributp implementar un metodo set(setters).
 */
public class IMC {
     private float peso;
     private float altura;
    
  
public  String calcular(){
        float imc=peso/(altura*altura);
                
        return "tu IMC es:"+ imc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
