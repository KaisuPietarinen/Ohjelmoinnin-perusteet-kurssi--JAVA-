/**
 * @(#)Palautus3_2.java
 *
 * Ohjelma lukee merkkijonona käyttäjän syöttämät euromäärät ja purkaa ne euroiksi ja senteiksi.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/9/22
 */


import java.util.*; 
/** Tuodaan Javan kirjastot käyttöön.*/

public class Palautus3_2 { 
/** Ohjelma lukee merkkijonona käyttäjän syöttämät euromäärät ja purkaa ne euroiksi ja senteiksi.*/

	public static void main (String [] args ) {
	/** Otetaan String luokan metodit käyttöön.*/ 
		
		Scanner input = new Scanner (System.in);
		/** Luodaan scanner-olio*/
		
		System.out.println ("Enter the amount in euros (use the point):"); 
		String euros = input.nextLine();
		/** Lukemisoperaatio.*/
		
		int index = euros.indexOf ('.');
		/** Määritellään kokonaislukumuuttuja, jolle annetaan arvoksi . -merkin indeksi*/ //Meniköhän selitys ihan oikein?
		
		System.out.println("Amount is " + euros.substring(0, index) + " euros and " + euros.substring(euros.length()-2) + " cents.");
		/** Mitkä numeromerkit ovat käyttäjän syöttämässä merkkijonossa ennen pistettä ja mitkä pisteen jälkeen.*/

	}
}