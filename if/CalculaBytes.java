//Nombre programa: CalculaBytes

/*ANALISIS
 * 	-Comentario: Programa que calcula la capacidad de un disco duro y expresa su tamaño en bytes, Kbytes, megabytes y gigabytes
 * 	-Entradas: El numero de cilindros, pistas, sectores y bytes por seccion
 *		-Salida: Capacidad del disco duro 
 * 	-Restriccion: Los datos introducidos no podran ser negativos
 * 	-Documentacion: La formula para calcular la capacidad es la siguiente:  " capacidad=cilindros*pistas*sectores*bytes_por_seccion "
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 	Inicio
 * 		Leer datos
 *			Calculo de la capacidad del disco duro
 * 		Mostrar resultados
 * 	Fin	
 */

import java.util.Scanner;
import java.io.*;

public class CalculaBytes {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);   //Declaro las variables que usare
		
		int cilindro = 0;
		int pista = 0;
		int sector = 0;
		int bytes_sector = 0;
		double capacidad = 0;
		double capKB = 0;
		double capMB = 0;
		double capGB = 0;
		
		//Leer datos
			System.out.print("Diga el numero de cilindros: ");
			cilindro = teclado.nextInt( );
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
			System.out.print("Diga el numero de pistas: ");
			pista = teclado.nextInt( );
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
			System.out.print("Diga el numero de sectores: ");
			sector = teclado.nextInt( );
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			System.out.print("Diga el numero de bytes por sector: ");
			bytes_sector = teclado.nextInt( );
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
		//Fin Leer datos
		
		//Calculo de la capacidad del disco duro
			capacidad = cilindro*pista*sector*bytes_sector;
			capKB = capacidad/1024;
			capMB = capKB/1024;
			capGB = capMB/1024;
			
		//Fin Calculo de la capacidad del disco duro
		
		//Mostrar resultados
			if(cilindro<=0||pista<=0||sector<=0||bytes_sector<=0){
			System.out.println("No puede calcularse ya que no puede haber datos negativos ni ceros");
			}
			else{
			System.out.println("La capacidad del disco duro es: " +capacidad + " bytes" );
			System.out.println("En KB: " +capKB);
			System.out.println("En MB: " +capMB);
			System.out.println("En GB: " +capGB);
			}
		//Fin Mostrar resultados	
	}
}

