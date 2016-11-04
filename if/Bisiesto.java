//Nombre programa: Bisiesto¿?

/*
 * ANALISIS
 * 	-Comentario: Programa que te dice si un año es bisiesto o no
 * 	-Entrada: Un año cualquiera
 * 	-Salida: Informacion a cerca de si el año es bisiesto o no
 * 	-Restricciones: El año no puede ser negativo
 * 	-Documetacion:  "Un año es bisiesto si es divisible por 400, o bien es divisible por 4 pero no por 100"
 * 
 * PSEUDOCODIGO GENERALIIZADO
 * 
 * Inicio
 * 	Leer datos
 * 	Identificar año y mostrar si es bisiesto o no
 * Fin 
 */

import java.util.Scanner;
import java.io.*;

public class Bisiesto {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int anno = 0;
		
		//Leer datos
			System.out.print("Diga un año y le dire si es bisiesto o no: ");
				anno = teclado.nextInt( );
		//Fin Leer datos
		
		//Identificar año y mostrar si es bisiesto o no
		if(anno<=0){
				System.out.println("No admitimos años negativos o con valor 0");
		}
		
		else
				
				if(anno % 400==0 || anno % 4==0 && anno % 100 != 0)
					System.out.println("El año es bisiesto");
					
				else
					System.out.println("El año no es bisiesto");	
		//Fin Identificar año y mostrar si es bisiesto o no		
	}
}

