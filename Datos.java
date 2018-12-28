import java.util.Scanner;
//Aqui importamos la sublibreria scanner
//que permite introducir datos

public class Datos{
	public static void main(String args[]){
//aqui abajo se indica el objeto scanner con nombre in
// Los objetos igual que las variables hay que inicializarlas como se muestra abajo		
		
		Scanner in = new Scanner(System.in);
// En System.in se indica que el objeto in tomara datos del usuario del teclado.

		// Aqui si inician las variables para trabajar
		String nombre = "";
		int numUno = 0, numDos = 0, resultado = 0;
// Arriba se muestra como declarar tres variables del mismo tipo de una sola vez
		System.out.println("Dame tu nombre");
//Abajo se indica que lo que va a introducir usuario se guarda en la variable nombre
// usando el objeto in que creamos. Se coloca el metodo nextLine que indica que se va a
//introducir texto. Si fuera numerico si pone nextInt.		
// in.nextLine() hace que se detenga el programa para que el usuario pueda introducir datos y se guarde en 
// la variable nombre.
// nextLine es un metodo de la libreria scanner asignado al objeto in.

// Scanner es clase, in es el objeto y nextLine el metodo
		nombre = in.nextLine();

		System.out.println("Dame el primer valor de la suma");
		numUno = in.nextInt();

		System.out.println("Dame el segundo valor de la suma");
		numDos = in.nextInt();

// Fijarse que el mismo objeto in se usa para tomar datos para las tres variables.

		resultado = numUno + numDos;

		System.out.println("Hola " + nombre + " El resultado de la suma es " + resultado);
		
	}
}