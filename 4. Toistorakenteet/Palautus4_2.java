/**
 * @(#)Palautus4_2.java
 *
 * Ohjelma laksee käyttäjän syöttämien desimaalilukujen keskiarvon.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/9/28
 */

/** Tuodaan Javan kirjastot käyttöön.*/ 

import java.util.*;

/** 
 * Ohjelma kysyy käyttäjältä montako kustannusta (desimaaliluku) syötetään
 * sekä kysyy em. luvut. Ohjelma laskee syötettyjen kustannusten keskiarvon.
 */
 
public class Palautus4_2 { 

	/** Tuodaan String luokan metodit käyttöön.*/
	
	public static void main (String [] args ) {
		
		/**
		*Lasketaan käyttäjän syöttämien kustannusten keskiarvo.
		*
		* @param number luettava kokonaislukuarvo.
		* @param counter kasvatettava kokonaislukuarvo.
		* @param cost summattava liukulukuarvo.
		* @param sum kahden liukulukuarvon summa.
		* @param average liukuluvun ja kokonaisluvun osamäärä.
		*/
		
		Locale.setDefault(Locale.ENGLISH);
		
		Scanner input = new Scanner (System.in);
		
		int number;
		int counter;
		double cost;
		double sum = 0;
		double average = 0;
		
		System.out.println ("How many costs do you enter:");
		number = input.nextInt();
		
		for(counter = 1; counter <= number; counter++){
			System.out.println("Enter the cost (use decimal number and dots): ");
			cost = input.nextDouble();
			
			sum = sum + cost;
			average = sum/number;
		}
		
		/** Keskiarvon tulostus.*/
		
		System.out.println("The average cost is: " + average);
	}
}