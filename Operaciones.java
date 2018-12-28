public class Operaciones {
	public static void main(String args[]){

		int operacion = 1;
		int num_uno = 8;
		int num_dos = 4;
		float resultado = 0;
// El signo = indica que el valor de la izquierda se guarda en la variable
// El signo == indica comparar que sea igual		
		if (operacion == 1){
            resultado = num_uno + num_dos;
            System.out.println("El resultado de la suma es:" + resultado);            
		}  else if(operacion ==2){
			resultado = num_uno - num_dos;
            System.out.println("El resultado de la resta es:" + resultado);            
		}else if(operacion ==3){
			resultado = num_uno * num_dos;
            System.out.println("El resultado de la multiplicacion es:" + resultado);            
		}else if(operacion ==4){
			resultado = num_uno / num_dos;
            System.out.println("El resultado de la division es:" + resultado);            
		} else { System.out.println("La opcion no existe" );
	}
	}
}