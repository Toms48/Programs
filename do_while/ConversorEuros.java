//Nombre del programa: ConversorEuros

/*
 * ANALISIS
 * 
 * Comentario: Programa que proporcione el cambio de Euros a distintas monedas según opción del usuario.
 * El programa debe controlar todas las entradas y ofrecer al usuario la posibilidad de repetir o salir.
 * 
 * Entrada: Un numero cualquiera
 * Salida: Su valor en otra moneda
 * Restricciones: El numero no puede ser negativo
 * 
 * BUCLE (1) (Inicio del programa y validacion)
 * 
 * VCB: Controlado por dato centinela
 * Valores VCB: 's' o 'n'
 * Incializacion VCB: Por lectura anticipada al principio de la primera iteracion
 * Actualizacion VCB: Al final de la iteracion
 * Condicion de salida: (respuesta == 's' || respuesta == 'n')
 * 
 * BUCLE (2) (Lectura del dinero introducido y validacion)
 * 
 * VCB: Controlado por centinela
 * Valores VCB: Double<1
 * Incializacion VCB: Por lectura 
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
 * 
 * BUCLE (4)
 * 
 * VCB:
 * Valores VCB:
 * Incializacion VCB:
 * Actualizacion VCB:
 * Condicion de salida:
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 
 * Inicio
 * 	Preguntar si se quiere usar el programa y validar respuesta //(1)
 * 	Mientras (se quiera usar) //(2)
 * 		Leer cantidad de euros a convertir y validar //(3)
 * 			Segun
 * 				Caso 0
 * 					Salir del programa
 * 				Caso 1
 * 					Convertir a yenes y mostrar en pantalla
 * 				Caso 2
 * 					Convertir a dolares y mostrar en pantalla
 * 				Caso 3
 * 					Convertir a libras y mostrar en pantalla
 * 				Otro caso
 * 					Mostrar error
 *				Fin_Segun
 * 		Preguntar si se quiere usar de nuevo y validar pregunta (4)
 *		Fin_Mientras
 * Fin
 * 
 * 
 */
 
 import java.util.Scanner;
 import java.io.*;
 

public class ConversorEuros {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		 double euro = 0;
		 int menu = 0;
		 char respuesta = ' ';
		 double yen = 0;
		 double dolar = 0;
		 double libra = 0;
		 
//Preguntar si se quiere usar el programa y validar respuesta //(1)
		System.out.print("Usar el programa (s/n): ");	
			respuesta=teclado.next( ).charAt(0); 
			System.out.println(" ");  
			
		while(respuesta != 's' && respuesta != 'n'){
				
				System.out.println("Introduzca una respuesta valida");	
				System.out.println(" ");
			
				System.out.print("Usar el programa (s/n): ");
				respuesta = teclado.next(  ).charAt(0);
				System.out.println(" ");
		}	
//FIn Preguntar si se quiere usar el programa y validar respuesta

//Mientras (se quiera usar) //(2)
        while(respuesta == 's'){ 
			
			//Leer cantidad de euros a convertir y validar //(3)
			System.out.print("Introduzca la cantidad de euros que desea convertir: ");  
			euro = teclado.nextDouble( );
			System.out.println(" "); 	
		
			while(euro<1) {
				System.out.println("No podemos realizar el calculo, introduzca una cifra valida");
					System.out.println("------------------------------------------------------------------------------------------------------");  
				System.out.print("Introduzca la cantidad de euros que desea convertir: ");  
				euro = teclado.nextDouble( );
					System.out.println(" ");   
				}
			//Fin Leer cantidad de euros a convertir	y validar
			
			
						System.out.println("Para salir pulse (0): "); 
						System.out.println("-------------------------------------------------");  
						System.out.println("Si quiere convertir su dinero a yenes pulse (1): ");  
						System.out.println("-------------------------------------------------");     
						System.out.println("Si quiere convertir su dinero a dolares pulse (2): ");
						System.out.println("-------------------------------------------------"); 
						System.out.println("Si quiere convertir su dinero a libras pulse (3): ");
						System.out.println("-------------------------------------------------");   
						
						System.out.print("Su seleccion es: ");
						menu = teclado.nextInt( ); 
						System.out.println(" ");  
						
						//Segun
						switch (menu) {
							
						case 0: //Caso 0
							break;
												
						case 1: //Caso 1
							//Convertir a yenes y mostrar en pantalla
							yen = euro * 115; 
							System.out.println ("Son "+yen + " yenes");
							System.out.println(" ");
							break;
							
						case 2: //Caso 2
							//Convertir a dolares y mostrar en pantalla
							dolar = euro * 1.10;
							System.out.println ("Son "+dolar + " dolares");
							System.out.println(" ");
							break;
							
							
						case 3: //Caso 3
							//Convertir a libras y mostrar en pantalla
							libra = euro * 0.90;
							System.out.println ("Son "+libra + " libras");
							System.out.println(" ");
							break;	
							
						default: //Otro caso
							//Mostrar error
							System.out.println("Introduzca una opcion valida, intentelo de nuevo");
							System.out.println("------------------------------------------------------------------------------------------------------");  
							break;
							
						}//Fin_segun
 
         			
         	//Preguntar si se quiere usar de nuevo y validar pregunta (4)		
				System.out.print("Usar de nuevo el programa (s/n): ");	
					respuesta=teclado.next( ).charAt(0);
					System.out.println(" "); 
			
			
				while(respuesta != 's' && respuesta != 'n') {
					System.out.println("Introduce una respuesta valida");
						System.out.println(" ");  
					System.out.print("Usar de nuevo el programa (s/n): ");	
					respuesta=teclado.next( ).charAt(0); 
						System.out.println(" ");  
				}
         	//Fin_Preguntar si se quiere usar de nuevo y validar pregunta
         				
        } //Fin_Mientras
		
	}
}

