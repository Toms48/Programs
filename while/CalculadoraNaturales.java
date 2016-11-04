//Nombre programa: Calculadora naturales

/*ANALISIS
 * 
 * Comentario: El algoritmo diseñado debe ser iterativo, acabará cuando se hayan procesado los diez primeros números naturales pares 
 * Entrada: No existe entrada de datos
 * Salida: El resultado de sumar los 10 primeros números naturales pares
 * 
 * BUCLE
 * 
 * VCB: Controlado por contador
 * Valores VCB:  Los 10 primeros numeros pares
 * Incializacion VCB: Se incializa antes de la primera iteracion
 * Actualizacion VCB: Al final de la iteracion
 * Condicion de salida:  (num> 20)
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 
 * Inicio 
 *		Inicializar numero y acumulador  
 *		Mientras Numero no haya llegado a 20 
 * 		Realizar Suma 
 * 		Actualizar Número 
 * 	Fin_mientras 
 * 	Mostrar Resultados 
 * Fin
 * 
 */


public class CalculadoraNaturales {
	
	public static void main (String[] args) {
		
		

		int num = 2;                       //Inicializar numero y acumulador
		int suma = 0;
		
	
	//Mientras Numero no haya llegado a 20 
	while(num<=20){	
		//Realizar suma
			suma = suma + num;
		//Fin Realizar suma
		
		//Actualizar numero
			num = num + 2;
		//Fin actualizar numero
	}	
	//Fin mientras
		
	//Mostrar Resultados 
		System.out.println("La suma total de los 10 primeros numeros pares es: " +suma);
	//Fin Mostrar Resultados 	
		
	}
}

