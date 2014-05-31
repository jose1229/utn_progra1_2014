package practica.pkgswitch;

import javax.print.DocFlavor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose Miguel
 */
public class practica {
    /*
    el string mes es variable global que se va a reciclar osea se limpiara
    automaticamente
    */

    public String mes;
    public practica(){;
    }

    /*
     el primer string significa lo que va a retornar 
     el metodo puede ser int, double, etc, y el int 
     dentro del parentesis significa lo que se le va a solicitar al usuario
     */
    public String mesesAño(int numero) {

        switch (numero) {
            case 1:
                this.mes = "enero";
                System.out.println(mes);
                break;

            case 2:
                mes = ("febrero");
                System.out.println(mes);
                break;

            case 3:
                mes = ("marzo");
                System.out.println(mes);
                break;

            case 4:
                mes = ("abril");
                System.out.println(mes);
                break;

            case 5:
                mes = ("mayo");
                System.out.println(mes);
                break;

            case 6:
                mes = ("junio");
                System.out.println(mes);
                break;

            case 7:
                mes = ("julio");
                System.out.println(mes);
                break;

            case 8:
                mes = ("agosto");
                System.out.println(mes);
                break;

            case 9:
                mes = ("setiembre");
                System.out.println(mes);
                break;

            case 10:
                mes = ("octubre");
                System.out.println(mes);
                break;

            case 11:
                mes = ("noviembre");
                System.out.println(mes);
                break;

            case 12:
                mes = ("diciembre");
                System.out.println(mes);
                break;

            default:
                System.out.println("numero incorrecto");
        }
        return mes;
    }
}
