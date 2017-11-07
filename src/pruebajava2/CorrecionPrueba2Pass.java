/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB17
 */
public class CorrecionPrueba2Pass 
{
    public static void main(String[] args)
    {
        int pass=123;
        int cont=0;//El contador lleva la cuenta de los intentos
        int cont2=0;//Este contador para ciclo si pass=contra
        
       int contra=0;//Para guardar lo que diguite el usuario 
       
       while(cont<3 && cont2==0)//Mientras el contador sea menor que 3 
       {
           if (pass==contra) 
           {
             JOptionPane.showMessageDialog(null, "Bienvenido..");
             cont2++;
           }
           
           else
           {
            contra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Contraseña"));
            cont++;
               if (cont==3) 
               {
                   JOptionPane.showMessageDialog(null, "Cuenta Bloqueada");
               }
           }
           
       }    
    }
}
