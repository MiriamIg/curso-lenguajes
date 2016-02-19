/* VISUALIZA EL NUMERO DE RENGLONES QUE CONTIENE LA PAGINA URL
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.inputoutput;

import java.net.*;
import java.io.*;

/**
 *
 * @author Miriam
 */
public class MiprimeraConexion {
    public static void main(String[] args)throws Exception{
        //primero vamos a usar una conexion que se llame url 
        
        URL url =new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
            url.openConnection();
       HttpURLConnection   con=(HttpURLConnection)url.openConnection();
                           con.getInputStream();
            InputStream input=con.getInputStream();
            InputStreamReader isr=new InputStreamReader(input);
            BufferedReader reader=new BufferedReader(isr);
      
            String lineaActual="No ha leido nada";
            boolean encontrado=false;
            int milinea=0;
     
         while ((lineaActual=reader.readLine())!=null) {
             if(encontrado && milinea<=4){
                 int indice= lineaActual.indexOf(">");
                 int indice2=lineaActual.indexOf("</");
                 String tempActual=lineaActual.substring(indice, indice2);
                 System.out.println(tempActual);
                 milinea ++;
                 
             }
          
             if(lineaActual.contains("Outside Temp")){
                 encontrado=true;
                
                 System.out.println("Encontrado!!!!");
                 milinea=1;
             }
                 
           
           
        }
     
      
               
       
    }
}