/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.arreglos;
import java.util.Scanner;

/**1.	Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:

•	El valor acumulado de todos los elementos del vector.

•	El valor acumulado de los elementos del vector que sean mayores a 36.
Cantidad de valores mayores a 50.

 *
 * @author Jose Miguel
 */
public class PracticaArreglos {

    /**
     * @param args the command line arguments
     */
   
  public static void main(String[] args) {

     
     Scanner teclado=new Scanner(System.in);
    
    
     
        
        oPracticaArreglos PracticaArreglos=new oPracticaArreglos();
               
        
       PracticaArreglos.cargar();
       PracticaArreglos.acuElementos();
       PracticaArreglos.acuMayores36();
       PracticaArreglos.cantMayores50();
    }
}

    
  