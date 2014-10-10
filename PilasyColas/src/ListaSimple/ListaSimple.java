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
public class ListaSimple {

     Nodo P;
     Nodo q;

    public ListaSimple(int dato) {
        P = new Nodo(dato);
    }

    public boolean ListaVacia() {
        return P==null;
       }
    public boolean Unidad(){
        System.out.println("lista ");
         return false;
   }
    public boolean unico()
    {    return false;
}
        
}

