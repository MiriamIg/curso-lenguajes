/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;

/**
 *
 * @author T-101
 */
public class Probarpersistencia {
    public static void main(String[] args) throws Exception{
        //Primero creamos un usuario con su lign y password 
        Usuario u1=new Usuario();
        u1.setLogin("yo");
        u1.setPassword("1234");
        //Ahpra usaremos la clase persistencia usuario para persistir(guardar)a este usuario
    PersistenciaUsuario p=new PersistenciaUsuario();
        
        p.guardar(u1);
        System.out.print("Usuario guardado ");
        
        
    }
    
}
