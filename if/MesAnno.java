//Nombre programa: MesDelAño

/*
 * ANALISIS
 * 	-Comentario: Programa que te dice el dia del mes segun el numero que le digas (Del 1 al 12)
 * 	-Entradas: Un numero del 1 al 12
 * 	-Salida: Mes del año correspondiente
 * 	-Restricciones: No pueden ser numeros que no esten entre el 1 y el 12
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 
 * Inicio
 * 	Leer datos
 * 	Buscar mes del año y mostrarla
 * Fin
 */

import java.io.*;
import java.util.Scanner;

public class MesAnno {
	
	public static void main (String[] args) {
		
		Scanner numero = new Scanner (System.in); //Declaro las variables
		
		int num = 0;
		
		//Leer datos
		
			System.out.print("Diga un numero del 1 al 12 y le dire a que mes del año corresponde: ");
			num = numero.nextInt( );
		
		//Fin leer datos
		
		//Buscar mes del año y mostrarla
		
			if(num<1 || num>12)
			
			System.out.println("Error, no podemos localizar su mes");
			
		else if (num==1){
		
			System.out.println("Estamos en Enero");
		}	
				else if (num==2){
		
					System.out.println("Estamos en Febrero");
				}	
						else if (num==3){
		
							System.out.println("Estamos en Marzo");
						}	
								else if (num==4){
		
									System.out.println("Estamos en Abril");
								}	
										else if (num==5){
		
											System.out.println("Estamos en Mayo");
										}	
												else if (num==6){
		
													System.out.println("Estamos en Junio");
												}	
														else if (num==7){
		
															System.out.println("Estamos en Julio");
														}	
																else if (num==8){
		
																	System.out.println("Estamos en Agosto");
																}	
																		else if (num==9){
		
																			System.out.println("Estamos en Septiembre");
																		}
																				else if (num==10){
		
																					System.out.println("Estamos en Octubre");
																				}	
																					else if (num==11){
		
																						System.out.println("Estamos en Noviembre");
																					}	
																							else if (num==12){
		
																								System.out.println("Estamos en Diciembre");
																							}	
		//Fin Buscar mes del año y mostrarla	
	}
}

