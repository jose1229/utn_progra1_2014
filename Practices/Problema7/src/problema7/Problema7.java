/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problema7;
import sun.security.krb5.Realm;
import java.util.Scanner; 
/**
 *
 * @author Jose Miguel
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               Scanner leer = new Scanner(System.in);
        int C=0;
         System.out.println("Ingrese el valor de C: "); 
         C = leer.nextInt();
          
        
        if(C>=0){
        if(C%2==0){
            
          if(C%5==0){
              if(C%10==0){
                  if(C>100){
           System.out.println("C es un numero mayor que 100");
           System.out.println("C es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
           System.out.println("C es un numero positivo"); 
                   }else{ 
                      System.out.println("C es un numero menor que 100");
           System.out.println("C es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
           System.out.println("C es un numero positivo"); }
          
              }else{
                  if(C>100){
                      System.out.println("C es un numero mayor que 100");
                      System.out.println("C no es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero positivo"); 
           System.out.println("C es un numero par");
                  }else{
                      System.out.println("C es un numero menor que 100");
                      System.out.println("C no es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero positivo");
                  System.out.println("C es un numero par");
                  }
              
              }
          
          
          }else{ 
              if(C%10==0){
                  if(C>100){
                      System.out.println("C  es un numero mayor que 100"); 
                            System.out.println("C  es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
         System.out.println("C es un numero positivo");
                  }else{
                      System.out.println("C  es un numero menor que 100"); 
                        System.out.println("C  es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
         System.out.println("C es un numero positivo");
                  }
            
              }else{
                  if(C>100){
                      System.out.println("C  es un numero mayor que 100"); 
              System.out.println("C no es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
         System.out.println("C es un numero positivo");      
                  
                  }else{
                      System.out.println("C  es un numero menor que 100");
              System.out.println("C no es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
         System.out.println("C es un numero positivo");      
                  }
            
              }
              
          
          
          }  
       
        }//fin numero par
        
        else{//numero impar
            
               
          if(C%5==0){
              if(C%10==0){
                  if(C>100){
           System.out.println("C es un numero mayor que 100");
           System.out.println("C es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
           System.out.println("C es un numero positivo"); 
                   }else{ 
                      System.out.println("C es un numero menor que 100");
           System.out.println("C es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
           System.out.println("C es un numero positivo"); }
          
              }else{
                  if(C>100){
                      System.out.println("C es un numero mayor que 100");
                      System.out.println("C no es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero positivo"); 
           System.out.println("C es un numero impar");
                  }else{
                      System.out.println("C es un numero menor que 100");
                      System.out.println("C no es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero positivo");
                  System.out.println("C es un numero impar");
                  }
              
              }
          
          
          }else{ 
              if(C%10==0){
                  if(C>100){
                      System.out.println("C  es un numero mayor que 100"); 
                            System.out.println("C  es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
         System.out.println("C es un numero positivo");
                  }else{
                      System.out.println("C  es un numero menor que 100"); 
                        System.out.println("C  es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
         System.out.println("C es un numero positivo");
                  }
            
              }else{
                  if(C>100){
                      System.out.println("C  es un numero mayor que 100"); 
              System.out.println("C no es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
         System.out.println("C es un numero positivo");      
                  
                  }else{
                      System.out.println("C  es un numero menor que 100");
              System.out.println("C no es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
         System.out.println("C es un numero positivo");      
                  }
            
              }
          }   
        }
          
          
           
       
        
        
        }else{// es un numero negativo
        
        
        if(C%2==0){
            
          if(C%5==0){
              if(C%10==0){
                  if(C>100){
           System.out.println("C es un numero mayor que 100");
           System.out.println("C es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
           System.out.println("C es un numero negativo"); 
                   }else{ 
                      System.out.println("C es un numero menor que 100");
           System.out.println("C es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
           System.out.println("C es un numero negativo"); }
          
              }else{
                  if(C>100){
                      System.out.println("C es un numero mayor que 100");
                      System.out.println("C no es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero negativo"); 
           System.out.println("C es un numero par");
                  }else{
                      System.out.println("C es un numero menor que 100");
                      System.out.println("C no es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero negativo");
                  System.out.println("C es un numero par");
                  }
              
              }
          
          
          }else{ 
              if(C%10==0){
                  if(C>100){
                      System.out.println("C  es un numero mayor que 100"); 
                            System.out.println("C  es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
         System.out.println("C es un numero negativo");
                  }else{
                      System.out.println("C  es un numero menor que 100"); 
                        System.out.println("C  es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
         System.out.println("C es un numero negativo");
                  }
            
              }else{
                  if(C>100){
                      System.out.println("C  es un numero mayor que 100"); 
              System.out.println("C no es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
         System.out.println("C es un numero negativo");      
                  
                  }else{
                      System.out.println("C  es un numero menor que 100");
              System.out.println("C no es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero par"); 
         System.out.println("C es un numero negativo");      
                  }
            
              }
              
          
          
          }  
       
        }//fin numero par
        
        else{//numero impar
            
               
          if(C%5==0){
              if(C%10==0){
                  if(C>100){
           System.out.println("C es un numero mayor que 100");
           System.out.println("C es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
           System.out.println("C es un numero negativo"); 
                   }else{ 
                      System.out.println("C es un numero menor que 100");
           System.out.println("C es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
           System.out.println("C es un numero negativo"); }
          
              }else{
                  if(C>100){
                      System.out.println("C es un numero mayor que 100");
                      System.out.println("C no es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero negativo"); 
           System.out.println("C es un numero impar");
                  }else{
                      System.out.println("C es un numero menor que 100");
                      System.out.println("C no es un numero multiplo de 10");
           System.out.println("C es un numero multiplo de 5"); 
           System.out.println("C es un numero negativo");
                  System.out.println("C es un numero impar");
                  }
              
              }
          
          
          }else{ 
              if(C%10==0){
                  if(C>100){
                      System.out.println("C  es un numero mayor que 100"); 
                            System.out.println("C  es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
         System.out.println("C es un numero negativo");
                  }else{
                      System.out.println("C  es un numero menor que 100"); 
                        System.out.println("C  es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
         System.out.println("C es un numero negativo");
                  }
            
              }else{
                  if(C>100){
                      System.out.println("C  es un numero mayor que 100"); 
              System.out.println("C no es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
         System.out.println("C es un numero positivo");      
                  
                  }else{
                      System.out.println("C  es un numero menor que 100");
              System.out.println("C no es un numero multiplo de 10"); 
              System.out.println("C no es un numero multiplo de 5"); 
           System.out.println("C es un numero impar"); 
         System.out.println("C es un numero negativo");      
                  }
            
              }
          }   
        }
          
          
           
       
        
        
      
        }
    }
    
}
