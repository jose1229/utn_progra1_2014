/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaSimple;



/**
 *
 * @author Jose Miguel
 */
public class listaeje2{

    /**
     * @param args the command line arguments2. Escriba un método que reciba un apuntador <p> que apunta al prim
     * er nodo de una lista simple de números enteros y devuelva el número de nodos que la componen. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("lista simple de numeros");
        ListaSimple oP=new  ListaSimple();
        System.out.println("la lista esta vacia"+oP.ListaVacia());
        System.out.println("hay un solo Elemento");
        oP.ListaSimple();
        oP.ListaVacia();
        
    }
    
}
