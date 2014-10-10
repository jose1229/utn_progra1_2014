/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase1;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double horasTrabajadas=0;
        double cotosHora=0;
        double salario=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("digite las horas trabajadas por el operario" +"\n");
        horasTrabajadas=Double.parseDouble(teclado.nextLine());
        System.out.println("digite el costo por hora" +"\n");
        cotosHora=Double.parseDouble(teclado.nextLine());
        salario=horasTrabajadas*cotosHora;
        System.out.println("el salario final es "+salario);
        System.out.println("   ");
        System.out.println("----------0---------");
         System.out.println("   ");
    }
    
}
