//Nombre programa: TrileroHonrado

/*
 * ANALISIS
 * 
 * Comentario: Crear un programa que simule el juego de la bolita de los trileros
 * 
 * Entradas: Letras
 * Salidas: Posicion de la bolita
 * 
 * BUCLE (1,6)
 * 
 * VCB: Por centinela
 * Valores VCB: 's' o 'n'
 * Incializacion VCB: Por lectura anticipada antes de la primera iteracion
 * Actualizacion VCB: Al final de la iteracion
 * Condicion de salida: (respuesta == 's' || respuesta == 'n')
 * 
 * BUCLE (2)
 * 
 * VCB: Por centinela
 * Valores VCB: 's'
 * Incializacion VCB: Por lectura anticipada antes de la primera iteracion
 * Actualizacion VCB: Al final de la iteracion
 * Condicion de salida: (respuesta == 's')
 * 
 * BUCLE (3,4,5)
 * 
 * VCB: Por centinela
 * Valores VCB: 'i', 'c' o 'd'
 * Incializacion VCB: Antes de la primera iteracion
 * Actualizacion VCB: Al final de la iteracion
 * Condicion de salida: (respuesta == 'i' || respuesta == 'c' || respuesta == 'd')
 * 
 * PSEUDOCODIGO GENERALIZADO	
 * 
 * Inicio
 * 	Preguntar si quieres jugar y validar //(1)
 * 	Mientras(Se quiera jugar) //(2)
 * 		Generar posicion bolita
 * 		Escoger cubilete y mostrar resultado
 * 	Preguntar si quieres jugar de nuevo y validar  ///(6)
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
		
		//Preguntar si quieres jugar y validar //(1)
			System.out.print(" ¿Quiere jugar? Soy de fiar, no le engañare (s/n) " );
				respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
				System.out.println(" ");
				
			while(respuesta != 's' && respuesta != 'n'){
					
			System.out.print(" ¿Quiere jugar? Soy de fiar, no le engañare (s/n) " );
				respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );	
				System.out.println(" ");
			}
		//Fin_Preguntar si quieres jugar y validar
		
		//Mientras(Se quiera jugar)   //(2)
			while(respuesta == 's'){
			
		//Generar posicion bolita	
			aleatorio = random.nextInt(3);
		//Fin_Generar posicion bolita
		
		//Escoger cubilete y mostrar resultado	
			switch(aleatorio){
				case 0:
					//System.out.println("La bola estara en la izquierda");
					System.out.println("        ______             ______             ______        ");
					System.out.println("       #      #           #      #           #      #       ");
					System.out.println("      #        #         #        #         #        #      ");
					System.out.println("     #          #       #          #       #          #     ");
					System.out.println("    #      i     #     #      c     #     #     d      #    ");
					System.out.println("   #              #   #              #   #              #   ");
					System.out.println("  #                # #                # #                #  ");
					System.out.println(" ");
						do{      //(3)
						System.out.println("Escoja cubilete");
						System.out.println(" ");
						System.out.println("i----> Izquierda");
						System.out.println("c----> Centro");
						System.out.println("d----> Derecha");
							respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
							}while(respuesta != 'i' && respuesta != 'c' && respuesta != 'd');
										switch(respuesta){
											
										case 'i':
											System.out.println("                           ______             ______        ");
											System.out.println("                          #      #           #      #       ");
											System.out.println("                         #        #         #        #      ");
											System.out.println("       ###              #          #       #          #     ");
											System.out.println("      #####            #      c     #     #     d      #    ");
											System.out.println("      #####           #              #   #              #   ");
											System.out.println("       ###           #                # #                #  ");
												System.out.println("ENHORABUENA, HAS GANADO");
										break;
										
										
										case 'c':
											System.out.println("        ______                                ______        ");
											System.out.println("       #      #                              #      #       ");
											System.out.println("      #        #                            #        #      ");
											System.out.println("     #          #                          #          #     ");
											System.out.println("    #      i     #                        #     d      #    ");
											System.out.println("   #              #                      #              #   ");
											System.out.println("  #                #                    #                #  ");
												System.out.println("HAS PERDIDO, SE SIENTE");
										break;
										
										case 'd':
											System.out.println("        ______             ______       ");
											System.out.println("       #      #           #      #      ");
											System.out.println("      #        #         #        #     ");
											System.out.println("     #          #       #          #    ");
											System.out.println("    #      i     #     #      c     #   ");
											System.out.println("   #              #   #              #  ");
											System.out.println("  #                # #                # ");
												System.out.println("HAS PERDIDO, SE SIENTE");
										break;
										}//Fin_switch			
				break;
				
				case 1:
					//System.out.println("La bola estara en el centro");
					System.out.println("        ______             ______             ______        ");
					System.out.println("       #      #           #      #           #      #       ");
					System.out.println("      #        #         #        #         #        #      ");
					System.out.println("     #          #       #          #       #          #     ");
					System.out.println("    #      i     #     #      c     #     #     d      #    ");
					System.out.println("   #              #   #              #   #              #   ");
					System.out.println("  #                # #                # #                #  ");
					System.out.println(" ");
					System.out.println("Escoja cubilete");
						do{   //(4)
						System.out.println(" ");
						System.out.println("i----> Izquierda");
						System.out.println("c----> Centro");
						System.out.println("d----> Derecha");
							respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
							}while(respuesta != 'i' && respuesta != 'c' && respuesta != 'd');
										switch(respuesta){
											
										case 'i':
										System.out.println("                           ______             ______        ");
										System.out.println("                          #      #           #      #       ");
										System.out.println("                         #        #         #        #      ");
										System.out.println("                        #          #       #          #     ");
										System.out.println("                       #      c     #     #     d      #    ");
										System.out.println("                      #              #   #              #   ");
										System.out.println("                     #                # #                #  ");
												System.out.println("HAS PERDIDO, SE SIENTE");
										break;
										
										
										case 'c':
											System.out.println("        ______                                ______        ");
											System.out.println("       #      #                              #      #       ");
											System.out.println("      #        #                            #        #      ");
											System.out.println("     #          #            ###           #          #     ");
											System.out.println("    #      i     #          #####         #     d      #    ");
											System.out.println("   #              #         #####        #              #   ");
											System.out.println("  #                #         ###        #                #  ");
												System.out.println("ENHORABUENA, HAS GANADO");
										break;
										
										case 'd':
											System.out.println("        ______             ______       ");
											System.out.println("       #      #           #      #      ");
											System.out.println("      #        #         #        #     ");
											System.out.println("     #          #       #          #    ");
											System.out.println("    #      i     #     #      c     #   ");
											System.out.println("   #              #   #              #  ");
											System.out.println("  #                # #                # ");
												System.out.println("HAS PERDIDO, SE SIENTE");
										break;
										}//Fin_switch
				break;
				
				case 2:
					//System.out.println("La bola estara en la derecha");
					System.out.println("        ______             ______             ______        ");
					System.out.println("       #      #           #      #           #      #       ");
					System.out.println("      #        #         #        #         #        #      ");
					System.out.println("     #          #       #          #       #          #     ");
					System.out.println("    #      i     #     #      c     #     #     d      #    ");
					System.out.println("   #              #   #              #   #              #   ");
					System.out.println("  #                # #                # #                #  ");
					System.out.println(" ");
					System.out.println("Escoja cubilete");
						do{    //(5)
						System.out.println(" ");
						System.out.println("i----> Izquierda");
						System.out.println("c----> Centro");
						System.out.println("d----> Derecha");
								respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
								}while(respuesta != 'i' && respuesta != 'c' && respuesta != 'd');
										switch(respuesta){
											
										case 'i':
										System.out.println("                           ______             ______        ");
										System.out.println("                          #      #           #      #       ");
										System.out.println("                         #        #         #        #      ");
										System.out.println("                        #          #       #          #     ");
										System.out.println("                       #      c     #     #     d      #    ");
										System.out.println("                      #              #   #              #   ");
										System.out.println("                     #                # #                #  ");
												System.out.println("HAS PERDIDO, SE SIENTE");
										break;
										
										
										case 'c':
											System.out.println("        ______                                ______        ");
											System.out.println("       #      #                              #      #       ");
											System.out.println("      #        #                            #        #      ");
											System.out.println("     #          #                          #          #     ");
											System.out.println("    #      i     #                        #     d      #    ");
											System.out.println("   #              #                      #              #   ");
											System.out.println("  #                #                    #                #  ");
												System.out.println("HAS PERDIDO, SE SIENTE");
										break;
										
										case 'd':
											System.out.println("        ______             ______                      ");
											System.out.println("       #      #           #      #                     ");
											System.out.println("      #        #         #        #                    ");
											System.out.println("     #          #       #          #         ###       ");
											System.out.println("    #      i     #     #      c     #       #####      ");
											System.out.println("   #              #   #              #      #####      ");
											System.out.println("  #                # #                #      ###       ");
												System.out.println("ENHORABUENA, HAS GANADO");
										break;
										}//Fin_switch
				break;				
			}//Fin_Switch
			
						
		//Fin_Escoger cubilete y mostrar resultado
		
		
		//Preguntar si quieres jugar de nuevo y validar  //(6) 
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

