/**
 * @(#)Palautus3_4.java
 *
 * Ohjelma laskee käyttäjältä pyydetyssä merkkijonossa olevien numeromerkkien summan.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/9/22
 */
 
import java.util.*;
/** Tuodaan Javan kirjastot käyttöön.*/

public class Palautus3_4 { 
/** Ohjelma laskee käyttäjältä pyydetyssä merkkijonossa olevien numeromerkkien summan.*/

	public static void main (String [] args ) {
	/** Otetaan String luokan metodit käyttöön.*/
		
		Scanner input = new Scanner (System.in);
		/** Luodaan scanner-olio.*/
		
		System.out.println ("Enter the numbers from 0 to 9, then I will give the sum");
		String answer = input.nextLine();
		/** Lukemisoperaatio.*/
		
		char number = answer.charAt(0);
		/** Luodaan merkkimuuttuja, jonka arvoksi annetaan käyttäjän syöttämä vastaus.*/
		int counter = 0;
		/** Luodaan kokonaislukumuuttuja, jonka arvoksi annetaan 0.*/
		int sum = 0;
		/** Luodaan kokonaislukumuuttuja, jonka arvoksi annetaan 0.*/
		
		for (counter = 0; counter < answer.length(); counter++){
			number = answer.charAt(counter);
			sum = sum + Character.getNumericValue(number);
			/** Käydään toistorakenteen avulla merkkijono läpi,
			* verraten laskurin arvoa merkkijonon pituuteen ja 
			* kasvatetaan laskurin arvoa.
			* Laskurin arvo siirretään aina kokonaislukumuuttujalle numb.
			* Kokonaislukumuuttujassa nimeltä sum päivitetään aina laskutoimitusta 
			* summasta + numeeriseen muotoon muutetusta kokonaislukumuuttujan
			* arvosta number, niin kauan kunnes for-rakenteen ehto täyttyy*/
		}
			System.out.println("The sum is: " + sum);
			/** Summan tulostus.*/
	}
}