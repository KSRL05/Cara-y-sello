package caraysello;

import java.math.MathContext;
import java.util.Scanner;
import java.util.Random;

public class funciones {

private int cara;
private int sello;
private int total;
Scanner en = new Scanner(System.in);

public  void jugar()
{
String opc;
bienvenida(); 


System.out.println("Eliga una opcion");
System.out.println("Escriba L para lanzar la moneda o");
System.out.println("Escriba E para salir");
opc = en.nextLine();


if("E".equals(opc))
{
System.out.println("Ha decido salir");

System.out.println("No se inicio el juego");
}


if("L".equals(opc))
{

boolean resultado = tirar();

if(resultado == true)
{
cara++;
}
else
{
sello++;
}

}
segundoTiro();

}


public void bienvenida()
{
System.out.println("Bienvenido al juego de cara y sello");
}

public boolean tirar()
{
       int seleccionUsuario;
       System.out.print(" Juego iniciado ");
        Scanner teclado = new Scanner(System.in);
  System.out.print(" ");
        System.out.print("Indique su eleccion [1=cara, 2=sello]: ");
         seleccionUsuario = teclado.nextInt();
        
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
    return true;
    
}
public void segundoTiro()
{

String opc2;
boolean resultado;

do{

System.out.println("Desea Lanzar la moneda otra vez? Y - Si, N - no");
opc2 = en.nextLine();

if("Y".equals(opc2)){

resultado = tirar();
if(resultado == true)
{
cara++;
}
else
{
sello++;}
total=(cara++ + sello++);
}
}while("Y".equals(opc2)); 

if("N".equals(opc2))
{
System.out.println("Ha decido salir");
System.out.println("Usted ha jugado un total de " +  total + " de veces" );
}
}
}