/**
 * @(#)Palautus4_3.java
 *
 * Ohjelma tulostaa liikevaihdon kertoimen käyttäjän syöttämän
 * toimintavuoden järjestysnumeron mukaan.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/9/28
 */

/** Tuodaan Javan kirjastot käyttöön.*/

import java.util.*;

/** 
 * Ohjelma tulostaa liikevaihdon kertoimen käyttäjän syöttämän
 * toimintavuoden järjestysnumeron mukaan.
 */
 
public class Palautus4_3 { 

	/** Tuodaan String luokan metodit käyttöön.*/
	
	public static void main (String [] args ) {
		
		/** 
		* Vertaillaan käyttäjän syöttämää kokonaislukuarvoa.
		*
		* @param year luettava kokonaislukuarvo.
		* @param counter kasvatettava kokonaislukuarvo.
		* @param numb1 summattava kokonaislukuarvo.
		* @param numb2 summattava kokonaislukuarvo.
		* @param next kahden kokonaislukuarvon summa.
		*/
		
		Scanner input = new Scanner (System.in);
		
		int year;
		long counter = 0;
		long numb1 = 1;
		long numb2 = 1;
		long next = 0;
		
		System.out.println ("Enter the order number of the year of operation:");
		year = input.nextInt();
		
		if (year > 0 && year <= 2){
			System.out.print(numb1);
		}
		
		/** 
		* Lasketaan toistorakenteessa liikevaihdon kerroin, 
		* mikäli aiempi ehto ei ole tosi.
		*/	
		
		else{
			
			for(counter = 2; counter < year; counter++){
				next = numb1 + numb2;
				numb1 = numb2;
				numb2 = next;
			}
			
			/** Tulostetaan liikevaihdon kerroin.*/
			
			System.out.print(next);
		}
	}
}