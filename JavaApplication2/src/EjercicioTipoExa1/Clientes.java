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
public class Clientes {
    private String nombre;
    private String Aparterno ;
    private int edad;
    private float sueldo;
    private String direccion;
    

    public Clientes(String nombre, String Aparterno, int edad, float sueldo, String direccion) {
        this.nombre = nombre;
        this.Aparterno = Aparterno;
        this.edad = edad;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }
    
   
                  

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Aparterno
     */
    public String getAparterno() {
        return Aparterno;
    }

    /**
     * @param Aparterno the Aparterno to set
     */
    public void setAparterno(String Aparterno) {
        this.Aparterno = Aparterno;
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
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private static class direccion {

        public direccion() {
            int numero;
            int calle;
            int municipio;
            int telefono;
            
        }

       
    }
            
    
}
