/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgswitch;

import java.util.Scanner;


/**
 *
 * @author Jose Miguel
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double valor1;
        double valor2;
        double resultado;
        char continuar;
        int opcion;
        boolean Validar=true;
        
        
        
        Scanner teclado=new Scanner(System.in);
        
        Operaciones oOperaciones=new Operaciones();
                
        do
        {
            
            System.out.println("digite la operacion a evaluar ");
            System.out.println("1. Suma");
            System.out.println("2. Resta"); 
            System.out.println("3. Division");
            System.out.println("4. Multiplicacion  ");
            System.out.println("5. Raiz"); 
            System.out.println("6. Potencia"); 
            
            
            opcion=Integer.parseInt(teclado.nextLine());
            
            switch(opcion)
            {
                case 1:
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2=Integer.parseInt(teclado.nextLine());
                    resultado=oOperaciones.Sumar(valor1, valor2);
                    System.out.println(resultado);
                break;
                    
                case 2:
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2=Integer.parseInt(teclado.nextLine());
                    resultado=oOperaciones.Resta(valor1, valor2);
                    System.out.println(resultado);
                break;
                    
                case 3:
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2=Integer.parseInt(teclado.nextLine());
                    resultado=oOperaciones.Division(valor1, valor2);
                    System.out.println(resultado);
                break;
                        
                case 4:
                   
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2=Integer.parseInt(teclado.nextLine());
                    resultado=oOperaciones.multiplicacion(valor1, valor2);
                    System.out.println(resultado);
                
                break;
                            
                case 5:
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    resultado=oOperaciones.Raiz(valor1);
                    System.out.println(resultado);
                break;
                    
                                
                case 6:
                    System.out.println("digite el valor del primer digito");
                    valor1=Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2=Integer.parseInt(teclado.nextLine());
                    oOperaciones.Potencia(valor1, valor2);
                    resultado= oOperaciones.Potencia(valor1,valor2);
                    System.out.println(resultado);
                break;
                    
                default:
                    
                    break;
            
            }
             
            System.out.println("desea continuar con otra operacion S/N");
             continuar=teclado.nextLine() .charAt(0);
             if((continuar=='S')||(continuar=='s'))
             {
                 Validar=true;
                 
             }
             if((continuar=='N')||(continuar=='n'))
             {
                 Validar=false;
             }
        }while (Validar);
        
       
        
        
        // TODO code application logic here
    }
    
}
