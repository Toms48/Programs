//Nombre programa: Bisiesto�?

/*
 * ANALISIS
 * 	-Comentario: Programa que te dice si un a�o es bisiesto o no
 * 	-Entrada: Un a�o cualquiera
 * 	-Salida: Informacion a cerca de si el a�o es bisiesto o no
 * 	-Restricciones: El a�o no puede ser negativo
 * 	-Documetacion:  "Un a�o es bisiesto si es divisible por 400, o bien es divisible por 4 pero no por 100"
 * 
 * PSEUDOCODIGO GENERALIIZADO
 * 
 * Inicio
 * 	Leer datos
 * 	Identificar a�o y mostrar si es bisiesto o no
 * Fin 
 */

import java.util.Scanner;
import java.io.*;

public class Bisiesto {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int anno = 0;
		
		//Leer datos
			System.out.print("Diga un a�o y le dire si es bisiesto o no: ");
				anno = teclado.nextInt( );
		//Fin Leer datos
		
		//Identificar a�o y mostrar si es bisiesto o no
		if(anno<=0){
				System.out.println("No admitimos a�os negativos o con valor 0");
		}
		
		else
				
				if(anno % 400==0 || anno % 4==0 && anno % 100 != 0)
					System.out.println("El a�o es bisiesto");
					
				else
					System.out.println("El a�o no es bisiesto");	
		//Fin Identificar a�o y mostrar si es bisiesto o no		
	}
}

