/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Jose Miguel
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int primernumero=1;
        int segundonumero= 1;
        int tercernumero= 1;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el numero donde quiere que termine la secuencia de Padovan : ");
        int finnumero=leer.nextInt();
        int siguientenumero;
        System.out.print("la cantiad de teminos son: "+"\n");
        System.out.print( primernumero + " " + segundonumero + " " + tercernumero);
        for (int i = 1; i <= finnumero -3; i++) {  
            siguientenumero= segundonumero+primernumero;
            System.out.print(" " + siguientenumero);
            primernumero=segundonumero;
            segundonumero=tercernumero;
            tercernumero=siguientenumero;
        }
      
    }
    
}
