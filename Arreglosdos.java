// arreglos 
// posicion inicial de un arreglo es 0
// Ej int nombre[] = new int[5];

// Ej numeros[2] = 8; Guarda 8 en la posicion 2 del vector

import java.util.Scanner;

public class Arreglosdos{
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);

		int vector[] = new int[5];
		int i = 0;
		int valor = 0;
		int dim = 0;

		
		System.out.println("Ingrese la dimension del arreglo: ");


// Aqui abajo la avriable dim adquiere el valor del objeto in
		dim = in.nextInt();

		System.out.println("dimension del Arreglo es:  " + dim);

		for(i = 0 ; i < dim ; i++){

			System.out.println("Ingrese el valor de la posicion " + i);

			valor = in.nextInt();

			vector[i] = valor;
		}


		System.out.print("Los valores ingresados son:  ");

		for (i = 0 ; i < dim ; i++){

			System.out.print("["+ vector[i] + "] ");

		}
	}

}