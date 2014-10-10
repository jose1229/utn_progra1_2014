/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication48;

/**
 *
 * @author Jose Miguel
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pila pila1=new Pila();
        pila1.insertar(10);
        pila1.insertar(40);
        pila1.insertar(3);
        pila1.insertar(2);
        pila1.insertar(1);
        pila1.imprimir();
        System.out.println("Extraemos de la pila:"+pila1.extraer());
        pila1.imprimir();
        pila1.contado();
    }
}
     