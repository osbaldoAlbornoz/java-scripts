// Ejercicios video 15

import java.util.Scanner;

public class Ciclostodos{
	public static void main(String args[]){

		int tipoSerie;
		int e = 100;

		//int valor1 =0;
		//int valor2 =1;
		//int nuevoValor1 = 0;

	Scanner in = new Scanner(System.in);

	System.out.print("Ingrese el tipo de serie a ejecutar 1,2,3:   ");

	tipoSerie = in.nextInt();

		switch(tipoSerie){
			case 1:

			for(int i = 1 ; i <= 10 ; i++ ){
			System.out.print(i + ",");
			}
			break;

			case 2:

			for(int i = 1 ; i <= 5 ; i++ ){

			e = e-1;
			System.out.print(" " + i + "," + " " + e );
			}

			case 3:

			int valor1 =0;
			int valor2 =1;
			int nuevoValor1 = 0;

			System.out.print(valor1 + " ,");
			System.out.print(valor2 + " ,");

			while ((valor1 + valor2) <= 35 ){

				nuevoValor1 = valor2;
				valor2 = valor2+valor1;
				System.out.print(valor2 + " ,");
				valor1 = nuevoValor1;

			}


			break;

			default:
			System.out.print("Opcion Incorrecta");

			break;		
		}

	}
}