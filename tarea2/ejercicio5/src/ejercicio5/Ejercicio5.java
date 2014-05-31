/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Jose Miguel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nummero: ");
        double numero=leer.nextDouble();
        double numero2=0.0;
        
         
        while(numero<=2.0) {
            double r=0.01;
            numero= numero+r;
          
            
        }
       System.out.println(numero);
    }
    
}
