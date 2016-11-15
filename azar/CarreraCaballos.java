//Nombre del programa: CarreraCaballos

/*
 * ANALISIS
 * 
 * Comentario: Diseña un programa para simular una carrera de tres caballos. Las probabilidades
 * de ganar las simulará el diseñador según sus propios criterios. El programa permitirá al usuario jugar repetidas veces si lo desea. Puede incluirse la
 * posibilidad de apostar interactivamente
 * 
 * Entradas: Dinero que se apuesta, elegir caballo por el que se apuesta
 * Salidas: Estado de tu dinero, caballo ganador
 * 
 * Restriccion: El dinero apostado no podra ser decimal
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 	Inicio
 * 		Preguntar si se quiere usar el programa y validar
 * 			Mientras (Se quiera usar)
 * 				Escoger dinero inicial con el que se apuesta y validar
 * 				Escojer caballo, apostar, ver ganador y actualizar dinero
 * 			Fin_Mientras
 * 	Fin
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class CarreraCaballos {
	
	public static void main (String[] args) {
		
	Scanner teclado = new Scanner (System.in);
	Random random = new Random ( );		
	
	int aleatorio = 0;
	char respuesta = ' ';
	int dinero = 0;
	int dineroapostado = 0;
	int caballo = 0;
				
	//Preguntar si se quiere usar el programa y validar
		do{
		System.out.print("¿Quiere usar el programa? ");
			respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
			System.out.println(" ");
			
		}while(respuesta != 's' && respuesta != 'n');

	//Fin_Preguntar si se quiere usar el programa y validar
	
	//Mientras (Se quiera usar)
		while(respuesta == 's'){
	
		//Escoger dinero inicial con el que se apuesta y validar
			do{
			System.out.print("Dinero con el que empezara a jugar ");
				dinero = teclado.nextInt( );
				System.out.println(" ");
			
			}while(dinero<=0);
		//Fin_Escoger dinero inicial con el que se apuesta y validar
 	
 	
		//Escojer caballo, apostar, ver ganador y actualizar dinero
		do{
		do{
			System.out.println("Escoja un caballo");
			System.out.println("-----------------");
			System.out.println("(0) Para salir");
			System.out.println("(1) Caballo numero 1");
			System.out.println("(2) Caballo numero 2");
			System.out.println("(3) Caballo numero 3");
			System.out.println("-----------------");
			System.out.print("Su seleccion es: ");
				caballo = teclado.nextInt( );
					System.out.println(" ");
				
		}while(caballo>3 || caballo<0);
		
				
			if(caballo<=3 && caballo>=1){
				
				switch(caballo){	
				
				case 1:
					do{
						System.out.print("¿Cuando dinero apostara? ");
							dineroapostado = teclado.nextInt( );
							System.out.println(" ");
					}while(dineroapostado>dinero || dineroapostado<=0);
					
					aleatorio = random.nextInt(3) +1;
					
					if(caballo == aleatorio){ 
						System.out.println("ENHORABUENA, TU CABALLO ES EL GANADOR");
						dinero= dinero + dineroapostado;
						System.out.println("El dinero que tiene para apostar disponible es " +dinero +" euros");
						System.out.println(" ");
					}
					else{
						System.out.println("QUE PENA, TU CABALLO HA PERDIDO");
						dinero= dinero - dineroapostado;
						System.out.println("El dinero que tiene para apostar disponible es " +dinero +" euros");
						System.out.println(" ");
					}	
				break;
				
				case 2:
					do{
						System.out.print("¿Cuando dinero apostara? ");
							dineroapostado = teclado.nextInt( );
							System.out.println(" ");
					}while(dineroapostado>dinero || dineroapostado<=0);
					
					aleatorio = random.nextInt(3) +1;
					
					if(caballo == aleatorio){ 
						System.out.println("ENHORABUENA, TU CABALLO ES EL GANADOR");
						dinero= dinero + dineroapostado;
						System.out.println("El dinero que tiene para apostar disponible es " +dinero +" euros");
						System.out.println(" ");
					}
					else{
						System.out.println("QUE PENA, TU CABALLO HA PERDIDO");
						dinero= dinero - dineroapostado;
						System.out.println("El dinero que tiene para apostar disponible es " +dinero +" euros");
						System.out.println(" ");
					}
				break;
				
				case 3:
					do{
						System.out.print("¿Cuando dinero apostara? ");
							dineroapostado = teclado.nextInt( );
							System.out.println(" ");
					}while(dineroapostado>dinero || dineroapostado<=0);
					
					aleatorio = random.nextInt(3) +1;
					
					if(caballo == aleatorio){ 
						System.out.println("ENHORABUENA, TU CABALLO ES EL GANADOR");
						dinero= dinero + dineroapostado;
						System.out.println("El dinero que tiene para apostar disponible es " +dinero +" euros");
						System.out.println(" ");
					}
					else{
						System.out.println("QUE PENA, TU CABALLO HA PERDIDO");
						dinero= dinero - dineroapostado;
						System.out.println("El dinero que tiene para apostar disponible es " +dinero +" euros");
						System.out.println(" ");
					}
				break;
			
			    }//Fin_Switch
			
			
			
		//Fin_Escojer caballo, apostar, ver ganador y actualizar dinero
		
		
			}//Fin_if
			}while((dinero>0)&&(caballo !=0));
		do{
		System.out.print("¿Quiere usar el programa de nuevo? ");
			respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
			System.out.println(" ");
			
		}while(respuesta != 's' && respuesta != 'n');	 	
	}//Fin_while
		
	}
}
