/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;

/**
 *
 * @author Jose Miguel
 */
public class ejercicio1 {
    private String email;
    public ejercicio1(String pEmail)
    {
        this.email=pEmail;
    } 
    public String validarcorreo()
    {
        String mensaje= "el correo no tiene @";
        for (int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@')
            {
                mensaje="el correo si contiene @";
            }
        }
        return mensaje;
    }
}
