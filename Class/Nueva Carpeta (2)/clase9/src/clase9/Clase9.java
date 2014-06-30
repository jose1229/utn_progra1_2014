package clase9;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        double[] sueldos = new double[5];
        int cantidadTrabajadores = 1;
        double sueldo;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("digite el sueldo del trabajador #" + cantidadTrabajadores);
            sueldo = teclado.nextDouble();
            sueldos[cantidadTrabajadores - 1] = sueldo;
            cantidadTrabajadores++;
        } while (cantidadTrabajadores < 3);
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("el sueldo del trabajador #" + (i + 1) + " es de " + sueldos[i]);
        }
        /*int cantidadPersonas = 1;
         float alturaPersona=0 ;
         ejercicio2 oejercicio2 = new ejercicio2();

    
         do{
    
         System.out.println("digite la altura de la persona #" + cantidadPersonas);
            
            
         alturaPersona = teclado.nextFloat();
         oejercicio2.AgregarAltura(alturaPersona);
         cantidadPersonas++;
        
         }while(cantidadPersonas<6);

         System.out.println("el promedio es " + oejercicio2.promedio());
         System.out.println(oejercicio2.ContarPersonas());
        
         }*/
    }
}
