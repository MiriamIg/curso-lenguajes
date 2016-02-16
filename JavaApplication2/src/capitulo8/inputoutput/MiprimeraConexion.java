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
      int renglones=0;
      /*
      while (reader.readLine()!=null) {
           renglones++;
           if(reader.readLine().contains("Current Conditions as of"))             //encuentra una frase del codigo
           {reader.readLine();
            System.out.println(reader.readLine());}
        }
        String hola="<td width=class summary_data>21.2 C</td>";
        int indice1=hola.indexOf("summary data");
        int indice2=hola.indexOf("</td>");
        String nuevo=hola.substring(indice1+13,indice2);
        System.out.println(nuevo);
      */
      boolean encontrado=false;
      String temperaturas[]=new String[5];
      while(reader.readLine()!=null){
          String renglonActual=reader.readLine();
      if(renglonActual.contains("Outside te"))
      {encontrado=true;
          System.out.println("Si existe este renglon");}
      }
               
        System.out.println("Numero de renglones"+ renglones);
    }
}