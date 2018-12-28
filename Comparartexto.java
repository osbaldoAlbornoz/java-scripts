// comparar dos cadenas de texto

import java.util.Scanner;

public class Comparartexto{
	public static void main(String args[]){

		String nombreUno = "", nombreDos = "";

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese el primer nombre: ");
		nombreUno = entrada.nextLine();

		System.out.print("Ingrese el segundo nombre: ");
		nombreDos = entrada.nextLine();

		if(nombreUno.equals(nombreDos) ){
			// .equeals compara dos variables tipo texto o string
			System.out.println("Los nombres son iguales ");
		} else{
			System.out.print("Los nombres son diferentes");
		}

	}
}