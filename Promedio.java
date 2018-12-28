public class Promedio{
	public static void main(String args[]){
		int matematicas = 3;
		int biologia = 5;
		int quimica = 5;
		int promedio = 0;

		promedio = (matematicas + biologia + quimica)/3 ;
        // ASi se hacen los condicionales
        // Fijarse que else no esta incluido en if
        //Primero cerrar if y luego hace el else
		if (promedio >= 6){
			System.out.println("El alumno ha aprobado" + promedio);
		}
			else{
				System.out.println("El alumno NO aprobo"+ promedio);
			}


		
	}
}