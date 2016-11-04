//Nombre programa: CalculadoraAbs&Inv

/* 
* -ANALISIS
* 		-Comentario: Calcular el inverso y valor absoluto de un numero
* 		-Entrada: Un numero cualquiera
* 		-Salida: Inverso y valor absoluto del numero
* 		-Restriccion:Si el numero es 0 no podra ser calculado su valor absoluto y su inverso
* 		-Documentacion: El inverso se calcula de la siguiente forma:  "inverso= 1/numero"
* 
*-PSEUDOCODIGO GENERALIZADO
* 		Inicio
* 			Leer datos
* 			Calculos de inverso y valor absoluto
* 			Mostrar resultados
* 		Fin
*/

import java.util.Scanner;
import java.io.*;
import java.lang.Math;

public class CalcuAbsInv {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);    //Declaro las variables que usare
		
		double num = 0;
		double absoluto = 0;
		double inverso = 0;
		
	//ILeer datos
			System.out.print("Diga un numero: ");
			num = teclado.nextDouble( );
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	//Fin leer datos
		
	//Calculos de inverso y valor absoluto
			if (num!=0){
				absoluto = Math.abs(num);
				inverso = (1/num);			
			}
			else{
				System.out.println("Error, el numero no puede ser 0");
			}
	//Fin Calculos de inverso y valor absoluto
		
	//Mostrar resultados
		if(num!=0){
			System.out.println("El valor absoluto del numero es:  " +absoluto);
			System.out.println("El inverso del numero es:  " +inverso);
		}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	//Fin Mostrar resultados
		
	}
}

