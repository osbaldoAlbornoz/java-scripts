import javax.swing.*;

// Al colocar .* se indica que vamos a importar todos los elementos
// de la libreria swing que es donde estan todos los elementos.

// extends sirve para llamar un clase hecha por un tercero incluida en el JDK
// JFrame es un clase (Formulario)hecha por algun tercero y sirve para
//crear la interfz grafica donde van a estar contenidos los
// elementos de la libreria swing.

public class Formulario extends JFrame {

// private y public son modificadores de acceso para indicar quien accesa a ellos
// JLabel (declara una etiqueta), label1(nombre de la etiqueta)	

	private JLabel label1;

// lo de abajo es un constructor que se debe llamar igual a la clase creada
// este constructor contiene el disenho de la etiqueta	
	public Formulario(){

	   //setLayout metodo que(indica coordenadas donde va la etiqueta)
		// la palabra null se coloca para evitar que el metodo Layout coloque los elementos donde quiera
	  setLayout(null);


//aqui abajo se esta inicializando la etiqueta label1 tal cual una variable
	  label1 = new JLabel("El tutorial de kike");

	  label1.setBounds(10, 20, 200, 300);

	  //setbounds(ejex, ejeY, ancho, pixels)
	  add(label1);
//  add indica que todo lo que acabamos de escribir lo vamos a colocar dentro de la etiqueta label1 

	}
	//**********************************************
	// Luego de crear el disenho de la etiqueta podemos escribir el metodo main

	public static void main(String args[]){

	// ahora creamosla pantalla (objeto tipo formulario) asi:
	// al crear el objeto, la clase y el constructor con el mismo nombre (Formulario) todo va a estar enlazado

		Formulario formulario1 = new Formulario();

	// al crear el objeto, la clase y el constructor con el mismo nombre (InterfazGrafica) todo va a estar enlazado

		formulario1.setBounds(0, 0, 400, 300);

	// setbouds.(X, Y, ancho pix, alto pix) X=0 y=0 es centro de pantalla
		formulario1.setVisible(true);

	// si va a ser visible o se va a esconder

		formulario1.setLocationRelativeTo(null);

	// esto indica que se vea en el centro de pantalla




	}

}


// Resumen de todo:

// importo la libreria swing que contiene la clase Jframe para hacer formularios, etiquetas, etc

// creo mi clase usando extends para por medio de la herencia de JFrame usar sus objetos y metodos

// declaro mi o mis objetos en este caso Jlabel

// Luego creo un constructor para darle sus caracteristicas a ese objeto Jlabel

// Luego ya puedo empezar el codigo normal main

// Aqui se debe crear un objeto de tipo Formulario que sera la pantalla contenedora de esa etiqueta 
// en este caso el objeto tipo formulario se llamara formulario1
















