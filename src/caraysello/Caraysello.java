/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caraysello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Caraysello {

  public static void main(String[] args) {
       
	  
            
       System.out.println("Juego de cara y sello");
        Scanner teclado = new Scanner(System.in);
 
        System.out.print("Indique su eleccion [1=cara, 2=sello]: ");
        int seleccionUsuario = teclado.nextInt();
        
        System.out.println("Introduce tu apuesta.");
        int cantidad = teclado.nextInt();
     	
        System.out.println("La moneda fue lanzada");
        int moneda=(int)(Math.random() * 2) + 1;
        
        int cant = cantidad*2;
        
        System.out.print("Ha caido: ");
	switch ( moneda )
        {

            case 1:
                System.out.println("cara");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println( "ha ganado " + cant); break;
                   
                   case 2: System.out.println( "has perdido"); break;
                }
                break;
		case 2:
                System.out.println("sello");
                switch ( seleccionUsuario )
                {
                   case 1:  System.out.println( "has perdido"); break;
                   
                   case 2:System.out.println( "ha ganado " + cant); break;
                }
                break;
        }			
                
                }
}
        
	
              


