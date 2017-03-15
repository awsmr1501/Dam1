package clases;

/**
 * 
 * Esta clase Calculadora solo Suma, Resta, Multiplica y Divide.
 * @author Jesús
 * @version 1.0 10/02/2017
 */

public class Calculadora {
	
	/**
	 * 
	 * @param x primer sumando
	 * @param y segundo sumando
	 * @return x + y
	 */

	public static float suma(float x, float y){
		return (x + y);

	}
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	
	public static float resta(float x, float y){
		return (x - y);

	}
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	
	public static float multiplicacion (float x, float y){
		return (x * y);
	
	}
	/**
	 * Divide x entre y
	 * @param x dividendo
	 * @param y divisor
	 * @return cociente
	 */
	public static float division (float x, float y){
		System.out.print("Imprimiendo...");
<<<<<<< HEAD
		System.out.print("hola");
=======
>>>>>>> refs/heads/master
		return (x / y);
		
	}
	
}
