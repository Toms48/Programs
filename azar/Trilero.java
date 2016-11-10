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
			System.out.print(" ¿Quiere jugar? Soy de fiar, no le engañare (s/n) " );
				respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );
				System.out.println(" ");
				
			while(respuesta != 's' && respuesta != 'n'){
					
			System.out.print(" ¿Quiere jugar? Soy de fiar, no le engañare (s/n) " );
				respuesta = Character.toLowerCase(teclado.next( ).charAt(0) );	
				System.out.println(" ");
			}
		//Fin_Preguntar si quieres jugar y validar
		
		//Mientras(Se quiera jugar)
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
						do{
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
						do{
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
						do{
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

