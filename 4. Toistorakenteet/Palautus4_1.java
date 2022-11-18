/**
 * @(#)Palautus4_1.java
 *
 * Ohjelma laskee käyttäjältä pyydetyn positiivisen kokonaisluvun kertoman.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/9/28
 */
 
/** Tuodaan Javan kirjastot käyttöön.*/

import java.util.*;

/** Ohjelma laskee käyttäjältä pyydetyn positiivisen kokonaisluvun kertoman.*/

public class Palautus4_1 { 

	/** Tuodaan String luokan metodit käyttöön.*/
	
	public static void main (String [] args ) {
		
		/** 
		* Lasketaan käyttäjän syöttämän kokonaisluvun kertoma.
		* 
		* @param number luettava kokonaislukuarvo.
		* @param multiplier kerrottava kokonaislukuarvo.
		* @param product liukulukuarvon ja kokonaislukuarvon tulo.
		*/
		
		Scanner input = new Scanner (System.in);
		
		int number;
		int multiplier;
		double product = 1;
	
		System.out.println ("Enter a positive integer:");
		number = input.nextInt();
		
		for(multiplier = 1; multiplier <= number; multiplier++){
			product = product * multiplier;
		}
		
		/** Tulon tulostus.*/
		
		System.out.println("Product: " + product);
	}
}