/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9;

/**
 *
 * @author Jose Miguel
 */
public class ejercicio2 {
    private float alturas[]=new float[5];
        
    public void AgregarAltura(float altura)
    {
        for (int i=0;i<alturas.length;i++){
            if(alturas[i]==0)
            {
                alturas[i]=altura;
                 break;
                    
            }
        }
    }
    public float promedio()
    {
        float sumaPromedio=0;
        float promedio;
        
        for(int i=0;i<alturas.length;i++){
            sumaPromedio+=alturas[i];
        }
        promedio=sumaPromedio/alturas.length;
        return promedio;
    }
    public String ContarPersonas()
    {
        String personasBajas="";
        String personasAltas="";
        String retorno="";
        float promedio=this.promedio();
        
        for (int i=0;i<alturas.length;i++){
            if(alturas[i]>promedio)
            {
                personasAltas+="la persona # "+(i+1) +"es alta "+"\n";
            }
                    else
            {
                    personasBajas+="la persona # "+(i+1) +"es baja "+"\n";
            }
        }
        retorno=personasAltas +"\n" +personasBajas;
        return retorno;
        
        
    }
    
}
