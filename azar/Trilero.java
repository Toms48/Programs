//Nombre programa: TrileroHonrado

/*
 * ANALISIS
 * 
 * Comentario: Crear un programa que simule el juego de la bolita de los trileros
 * 
 * Entradas: Letras
 * Salidas: Posicion de la bolita
 * 
 * PSEUDOCODIGO GENERALIZADO	
 * 
 * Inicio
 * 	Preguntar si quieres jugar y validar
 * 	Mientras(Se quiera jugar)
 * 		Generar posicion bolita
 * 		Escoger cubilete y mostrar resultado
 * 	Preguntar si quieres jugar de nuevo y validar 
 * 	Fin_Mientras
 * Fin
 * 
 */

import java.util.*;
import java.io.*;

public class Trilero {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		Random random = new Random ( );
		
		int aleatorio = 0;
		char respuesta = ' ';
		
		//Preguntar si quieres jugar y validar
			System.out.print(" ¿Quiere jugar? Soy de fiar, no le engañaré (s/n) " );
				respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
				System.out.println(" ");
				
			while(respuesta != 's' && respuesta != 'n'){
					
			System.out.print(" ¿Quiere jugar? Soy de fiar, no le engañaré (s/n) " );
				respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );	
				System.out.println(" ");
			}
		//Fin_Preguntar si quieres jugar y validar
		
		//Mientras(Se quiera jugar)
			while(respuesta == 's'){
				
			aleatorio = random.nextInt(3);
			
			switch(aleatorio){
			
				case 0:
					System.out.println("La bola estara en la izquierda");
					System.out.println(" ");
				break;
				
				case 1:
					System.out.println("La bola estara en el centro");
					System.out.println(" ");
				break;
				
				case 2:
					System.out.println("La bola estara en la derecha");
					System.out.println(" ");
				break;
			}//Fin_Switch
			
		
		//Generar posicion bolita
		
		//Fin_Generar posicion bolita
		
		
		
		//Escoger cubilete y mostrar resultado
			
		//Fin_Escoger cubilete y mostrar resultado
		
		
		//Preguntar si quieres jugar de nuevo y validar 
			System.out.print(" ¿Quiere jugar de nuevo? (s/n) " );
				respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
				System.out.println(" ");
				
			while(respuesta != 's' && respuesta != 'n'){
					
			System.out.print(" ¿Quiere jugar de nuevo? (s/n) " );
				respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );	
				System.out.println(" ");
			}
		//Fin_Preguntar si quieres jugar de nuevo y validar 
		}//Fin_While
		
		
		
		//Fin_Mientras
		
		
		
		
		
		
		
		
		
		
		
	}
}

