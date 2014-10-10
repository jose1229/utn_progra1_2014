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
public class Pila {

    class Nodo {

        int info;
        Nodo sig;
    

    }

    private Nodo raiz;

    public Pila() {
        raiz = null;
    }

    public void insertar(int x) {
        Nodo nuevo;

        nuevo = new Nodo();
        nuevo.info = x;
        if (raiz == null) {
            nuevo.sig = null;
            raiz = nuevo;
        } else {
            nuevo.sig = raiz;
            raiz = nuevo;

        }
    }

    public int extraer() {
        if (raiz != null) {
            int informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void imprimir() {
        Nodo reco = raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco != null) {
            System.out.print(reco.info + "-");
            reco = reco.sig;
        }
        System.out.println();
    }

    public void contado() {
        Nodo reco = raiz;
     int cont=0;

        while (reco != null) {

            reco = reco.sig;
            cont++;
        }
        System.out.println("La cantidad de nodos totales es:");
       System.out.println(cont+1);
        System.out.println("-----0-----");
        System.out.println("la cantidad de nodos totales menos el nodo uno extraido es:");
        System.out.println(cont);
        

    }
    

}
