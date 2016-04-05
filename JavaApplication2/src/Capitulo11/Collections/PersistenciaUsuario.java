/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;
import java.io.*;//aqui se encuentra el file 
import java.util.ArrayList;

/**
 *ES UNA CLASE LOGICA 
 * @author T-101
 * esta clase nos va a servir para la clase serializable  usuario 
 */
public class PersistenciaUsuario {
    ArrayList<Usuario>   usuarios;
    //se realiza el constructor para no lanzar el null ponter exception 

    public PersistenciaUsuario() {
        usuarios = new ArrayList<>();
    }

   
    //Primero poneos el metodo de buscar todos
    ArrayList<Usuario> buscarTodos ()throws Exception{
        //Paso n°1:Leer el archivo donde esta guardado el arraylist 
        File f=new File("archivaldo.raton");
        //leemos el contenido 
        FileInputStream fis=new FileInputStream(f); //lee un string de bytes 
        //Descomprimimos el contenido 
        ObjectInputStream ois=new ObjectInputStream(fis);
        usuarios= (ArrayList<Usuario>) ois.readObject(); //se hace el casteo 
        
        return usuarios;
    }
    public void guardar(Usuario u)throws Exception{
        File f=new File("archivaldo.raton");
        if(f.exists())usuarios=buscarTodos();//guarda registro por registro y no borren los anteriores 
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
                
        
    }
        
    
    
}
