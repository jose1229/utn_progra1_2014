/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3;
import sun.security.krb5.Realm;
import java.util.Scanner; 
/**
 *
 * @author Jose Miguel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double inicial=0.0;
        double fin=0.0;
        double incremento;
      double resultado=0.0; 
      String r="";
        
         System.out.println("Ingrese el numero inicial: "); 
         inicial = leer.nextDouble();
        System.out.println("Ingrese el numero final : "); 
         fin = leer.nextDouble();
        System.out.println("Ingrese el valor de incremento: "); 
         incremento = leer.nextDouble();
         
         for (double i =inicial; i <= fin; i=i+incremento) {
            resultado=+i;
            
            r+= String.valueOf( resultado )+",";
        }
         System.out.println(r); 
         
       
    }
    
}
