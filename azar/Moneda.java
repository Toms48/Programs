//Nombre del programa: Cara o Cruz

/*ANALISIS
 * 
 * Comentario: Programa que lanza una moneda al aire y muestra si ha salido cara o cruz
 * 
 * Entradas: Una letra
 * Salidas: Un lado de la moneda
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 
 * Inicio
 * 	Preguntar lanzamiento moneda y validar respuesta //(1)
 * 	Mientras (Se quiera lanzar moneda) //(2)
 * 		Tirar moneda y mostrar cara
 * 		Preguntar si se quiere usar de nuevo //(3)
 * 	Fin_mientras
 * Fin
 * 
 * BUCLE (1)
 * 
 * VCB: Por centinela
 * Valores VCB: 's' o 'n'
 * Incializacion VCB: Por lectura anticipada antes de la primera iteracion
 * Actualizacion VCB: Al final de la iteracion
 * Condicion de salida: (respuesta == 's' || respuesta == 'n')
 * 
 * BUCLE (2)
 * 
 * VCB:
 * Valores VCB: 
 * Incializacion VCB: 
 * Actualizacion VCB:
 * Condicion de salida:
 * 
 * BUCLE (3)
 * 
 * VCB:
 * Valores VCB: 
 * Incializacion VCB: 
 * Actualizacion VCB:
 * Condicion de salida:
 */

import java.util.Random;
import java.util.Scanner;

public class Moneda {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		Random random = new Random ( );
		
		char respuesta = ' ';
		int aleatorio = 0;
		
		//Preguntar lanzamiento moneda y validar respuesta //(1)
		
			System.out.print(" ¿Quiere usted lanzar una moneda? (s/n) ");
				respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
				System.out.println(" ");
				
				while(respuesta != 's' && respuesta != 'n'){
					
				System.out.print(" ¿Quiere usted lanzar una moneda? (s/n) ");
					respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );	
					System.out.println(" ");
				}
		//Fin_Preguntar lanzamiento moneda y validar respuesta
			
  	    //Mientras (Se quiera lanzar moneda) //(2)
  	    
			while(respuesta == 's'){
		
			aleatorio = random.nextInt(2);
			
			//Tirar moneda y mostrar cara
			
				if(aleatorio == 0){
					System.out.println("Cara");
						System.out.println(" ");
				}
				else
					System.out.println("Cruz");
						System.out.println(" ");
			
			//Fin_Tirar moneda y mostrar cara
				
			//Preguntar si se quiere usar de nuevo //(3)
				System.out.print(" ¿Quiere usted lanzar una moneda? (s/n) ");
					respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
					System.out.println(" ");
				
				while(respuesta != 's' && respuesta != 'n'){
					
				System.out.print(" ¿Quiere usted lanzar una moneda? (s/n) ");
					respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
					System.out.println(" ");
				}
			//Fin_Preguntar si se quiere usar de nuevo
			
			
			
 		}
 	    //Fin_mientras
 	    
		
		
		
	}
}

