/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTipoExa1;

/**
 *
 * @author T-101
 */
public class GenerarClientes {
public static Clientes[]  obtenerCliente() {
    
   Clientes[] c=new Clientes[3];
   c[0].setNombre("Ana");
   c[1].setNombre("Pedro");
   c[3].setNombre("Laura");
   
   Direccion dir0=new Direccion();
            dir0.setNumero(20);
            dir0.setCalle("Sur 10");
            dir0.setMunicipio("Ecatepec");
            c[0].setDireccion(dir0);
   Direccion dir1=new Direccion();
            dir1.setNumero(20);
            dir1.setCalle("Sur 10");
            dir1.setMunicipio("Ecatepec");
            c[1].setDireccion(dir1);
    Direccion dir2=new Direccion();
            dir2.setNumero(20);
            dir2.setCalle("Sur 10");
            dir2.setMunicipio("Ecatepec");
            c[1].setDireccion(dir2);       
                    
                    
    return c;
   
       
    }
   
        
    }

    
    
  

