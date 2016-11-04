//Nombre programa: Bisiesto�?

/*
 * ANALISIS
 * 	-Comentario: Programa que te dice si un a�o es bisiesto o no
 * 	-Entrada: Un a�o cualquiera
 * 	-Salida: Informacion a cerca de si el a�o es bisiesto o no
 * 	-Restricciones: El a�o no puede ser negativo
 * 	-Documetacion:  "Un a�o es bisiesto si es divisible por 400, o bien es divisible por 4 pero no por 100"
 *  
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 
 * Inicio
 * 	Preguntar si se quiere usar el programa
 * 	Mientras (Se quiera usar programa)
 * 		Leer a�o y validar
 * 		Comprobar bisiesto
 * 		Preguntar si se quiere volver a usar	
 * 	Fin Mientras
 * Fin 
 * 
 *
 */

import java.util.Scanner;
import java.io.*;

public class BisiestoDoWhile {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int anno = 0;
		char respuesta = ' ';
		
		
		//Preguntar si se quiere usar el programa
			System.out.print("�Quiere usar el programa? (y/n): ");
				respuesta = teclado.next(  ).charAt(0);
				System.out.println(" ");	
		//Fin Preguntar si se quiere usar el programa
	
			
		//BUCLE PREGUNTA DE INICIO
		
				while(respuesta !='y' && respuesta != 'Y' && respuesta != 'n' && respuesta !='N'){
				
				System.out.println("Introduzca una respuesta valida");	
				System.out.println(" ");
			
				System.out.print("�Quiere usar el programa? (y/n): ");
				respuesta = teclado.next(  ).charAt(0);
				System.out.println(" ");
				}
				
		
		
		//Mientras (se quiera usar el programa)
			while (respuesta ==  'y'|| respuesta =='Y'){	
		
		//Leer a�o
			System.out.print("Diga un a�o y le dire si es bisiesto o no: ");
				anno = teclado.nextInt( );
		//Fin Leer a�o
		
		//Identificar a�o y mostrar si es bisiesto o no
			if(anno<=0){
				System.out.println("No admitimos a�os negativos o con valor 0");
				System.out.println(" ");	
			}
		
			else
				
				if(anno % 400==0 || anno % 4==0 && anno % 100 != 0){
					System.out.println("El a�o es bisiesto");
					System.out.println(" ");		
			}	
				else{
					System.out.println("El a�o no es bisiesto");	
					System.out.println(" ");		
				}	
		//Fin Identificar a�o y mostrar si es bisiesto o no	
		
		//Pregunta
			System.out.print("�Quiere seguir usando el programa? (y/n): ");
				respuesta = teclado.next(  ).charAt(0);
			System.out.println(" ");
			
			//Validar respuesta
				while(respuesta !='y' && respuesta != 'Y' && respuesta != 'n' && respuesta !='N'){
				
				System.out.println("Introduzca una respuesta valida");	
				System.out.println(" ");
			
				System.out.print("�Quiere usar el programa? (y/n): ");
				respuesta = teclado.next(  ).charAt(0);
				System.out.println(" ");
				}	
			//Fin Validar respuesta					
		//Fin Pregunta
			} //Fin Mientras
		
			
	}
}

