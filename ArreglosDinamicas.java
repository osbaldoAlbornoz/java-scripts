// Arreglos Bidimensionales Dinamicos

// Se declaran asi: int vector[][] = new int[fila][col];


import java.util.Scanner;

public class ArreglosDinamicas{
	public static void main(String args []){

		

		//Scanner in = new Scanner(System.in);

		int fil = 3;
		int col = 3;

		int i = 0;
		int j = 0;
		int contador = 1;
		

		int vectorDi[][] = new int[fil][col];

		//Ingresar valores en la matriz

		for(i = 0 ; i < fil ; i++ ){

			for(j = 0 ; j < col ; j++ ){
			
			vectorDi[i][j] = contador; 
			contador ++;

			System.out.print(" " + vectorDi[i][j]);

			}

			System.out.println(" ");
			
		}

	}
}


