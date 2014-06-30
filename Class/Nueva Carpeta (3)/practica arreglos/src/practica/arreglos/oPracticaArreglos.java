/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.arreglos;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class oPracticaArreglos {
  
    public void cargar() {
        
        Scanner teclado = new Scanner(System.in);
        int []vector = new int[8];

        for (int f = 0; f < 8; f++) {
            System.out.print("Ingrese elemento:");
            vector[f] = teclado.nextInt();
        }
    }

    public void acuElementos() {
        int suma = 0;
        for (int f = 0; f < 8; f++) {
            suma = suma + f;
        }
        System.out.println("La suma de los 8 elementos es:" + suma);
    }

    public void acuMayores36() {
        int suma = 0;
        for (int f = 0; f < 8; f++) {
            if (f> 36) {
                suma = suma + f;
            }
        }
        System.out.println("La suma de los elementos mayores a 36 es:" + suma);
    }

    public void cantMayores50() {
        int cant = 0;
        for (int f = 0; f < 8; f++) {
            if (f > 50) {
                cant++;
            }
        }
        System.out.println("La cantidad de valores mayores a 50 es:" + cant);
    }

}
