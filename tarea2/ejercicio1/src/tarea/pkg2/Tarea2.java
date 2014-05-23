/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea.pkg2;
import com.sun.javafx.scene.layout.region.Margins;
import java.util.Scanner; 
import sun.security.krb5.Realm;
/**
 *
 * @author Jose Miguel
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int n;
        int  y ;
        String resultado="";
         System.out.println("Ingrese el primer valor: "); 
         n = leer.nextInt();
         System.out.println("Ingrese el segund valor: "); 
         y = leer.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int r;
            r = i%y;
            if (r==0) {
                resultado += "*"+",";
            }else{resultado+= String.valueOf( i )+",";}
        }
        System.out.print(resultado);
        
    }
    
}
