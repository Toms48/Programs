//Nombre del programa: Saludador

/*
 * ANALISIS
 * 	-Comentario: Programa que te salude depende de la hora del dia
 * 	-Entrada: Una hora del dia
 * 	-Salida: Saludo correspondiente segun la hora
 * 	-Restricciones: No podran darse horas negativas
 * 	-Documentacion: 
 * 
 *			a) Es de día desde las 7:30 hasta las 14:00 horas
 * 		b) Es tarde desde las 14:01 hasta las horas 20:30
 * 		c) Es noche desde las 20:31 hasta las horas 7:29
 * 
 * PSEUDOCODIGO GENERALIIZADO	
 * 
 * Inicio
 * 	Leer datos
 * 	Identificar hora y mostrar mes
 * Fin
 */


import java.io.*;
import java.util.Scanner;

public class Saludador {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int hora = 0;
		int min = 0;
		
		
		//Leer datos
		
			System.out.print("Diga las horas: ");
				hora = teclado.nextInt( );
				
			System.out.print("Diga los minutos: ");
				min = teclado.nextInt( );
		
		//Fin Leer datos
		
		//Identificar hora y mostrar mes
		
			if (hora<0||hora>23||min<0||min>59) {
				System.out.println("Esa hora no puede ser interpretada");
			}
			else
			
				if (  (hora >= 7 && min >= 30 || hora>=8) && (hora <= 14 && min== 0 || hora<=13) ){
				
					System.out.println("Buenos dias");
				}	
				
					else if( (hora >=14 && min >=1 || hora>= 15) && (hora <=20 && min<= 30 || hora<=19) ){
						
						System.out.println("Buenas tardes");	
					}
						else
							
							System.out.println("Buenas noches");										
		//Fin Identificar hora y mostrar mes		
	}
}

