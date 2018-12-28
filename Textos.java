// caracteres metodo lenth y substring
// lenght = muestra cantidad de caracteres de un texto
// substring obtiene parte especifico de un texto
// substring(desde,hasta); desde y hasta se refiere al espacio
// length se usa: variable.length()

import java.util.Scanner;

public class Textos{
	public static void main(String args[]){


	String texto = "";
	int espacio1 = 0;
	int espacio2 = 0;

	Scanner cadena = new Scanner(System.in);

	System.out.println("Ingrese el texto: ");

	texto = cadena.nextLine();

	System.out.println("El texto contiene: "+ texto.length() + " caracteres");

	// ***********

	System.out.println("Desde que espacio de la cadena desea obtener?");

	espacio1 = cadena.nextInt();

	System.out.println("Hasta que espacio de la cadena desea obtener?");

	espacio2 = cadena.nextInt();

	System.out.println("El resultado es: " + texto.substring(espacio1, espacio2));

	}	
}

// kike

