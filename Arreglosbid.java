// Arreglos Bidimensionales

// Se declaran asi: int vector[][] = new int[fila][col];


import java.util.Scanner;

public class Arreglosbid{
	public static void main(String args []){

		

		Scanner in = new Scanner(System.in);

		int fil = 0;
		int col = 0;

		int i = 0;
		int j = 0;





		System.out.println("Ingrese la cantidad de Filas del Arreglo: ");

		fil = in.nextInt();

		System.out.println("Ingrese la cantidad de Columnas del Arreglo: ");

		col = in.nextInt();

		int vectorBi[][] = new int[fil][col];

		//Ingresar valores en la matriz

		for(i = 0 ; i < fil ; i++ ){

			for(j = 0 ; j < col ; j++ ){
			System.out.print("Ingrese el Valor de la posicion" + i + " " + j + " ");
			vectorBi[i][j] = in.nextInt(); 

			}
			
		}

		
		// Imprimir vector en pantalla

		for(i = 0 ; i < fil ; i++ ){

			for(j = 0 ; j < col ; j++ ){
			System.out.print(vectorBi[i][j] + " ");
			

			}
			System.out.println(" ");
		}

	}
}


