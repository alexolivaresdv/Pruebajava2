/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;

/**************************************************************************
 * Alex Olivares Del Valle 
 * @author LAB17
 * Fecha: Noviembre 06 del 2017
 * Programa: Solicitud de contraseña
 * Responsabilidad: Bloquear cuenta al tercer error.
 */
public class SolicitarContraseña 
{
    public static void main(String[] args)
    {
        
		int usuario=0;
		int contraseña=0;
		int intentos=1;
		int maximo=3;
                
                while((usuario!=1234)||(contraseña!=1234)&& (intentos>=maximo))
                {
                   usuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Usuario:  "));
                 
                   contraseña = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Contraseña:  "));
		  		
 
					if(intentos==1234)
                                        {
						JOptionPane.showMessageDialog(null,"Bienvenido..");
						
					}
                                         else
                                            if(intentos==3)
                                        {
						JOptionPane.showMessageDialog(null,"Cuenta Bloqueada, comuniquese con soporte tecnico..");
						intentos=intentos-maximo;
					}
					intentos++;
                }
    }
}
