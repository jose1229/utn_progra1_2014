/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio2;
import sun.security.krb5.Realm;
import java.util.Scanner; 
/**
 *
 * @author Jose Miguel
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("ingrese el valor:");
        n = leer.nextInt();
        
        String resultado="";
        
        
        for (int i = 0; i < n; i++) {
            
            resultado+="*";
            
        }
        System.out.println(resultado);
        
        
        
        
        
        // TODO code application logic here
    }
    
}
