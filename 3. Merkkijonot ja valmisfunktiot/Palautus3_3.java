/**
 * @(#)Palautus3_3.java
 *
 * Ohjelma laskee kuusikulmion alan käyttäjän syöttämän kuusikulmion sivun pituuden mukaan.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/9/22 
 */


import java.util.*;
/** Tuodaan Javan kirjastot käyttöön.*/

public class Palautus3_3 {
	/**Ohjelma laskee kuusikulmion alan käyttäjän syöttämän kuusikulmion sivun pituuden mukaan.*/
	
	public static void main (String [] args ) {
	/** Luodaan scanner-olio.*/
		
		Locale.setDefault(Locale.ENGLISH);
		/** Otetaan metodi käyttöön oletuskielen asettamiseksi englanniksi.*/
		
		Scanner input = new Scanner (System.in);
		/** Luodaan scanner-apuväline*/
		
		System.out.println ("Enter the length of the side of the hex angle (use the point):"); // Pyydetään käyttäjää antamaan kuusiokulman sivun pituuden
		double side = input.nextDouble();
		/** Lukemisoperaatio.*/
		
		double area = (6*side*side)/(4*Math.tan(Math.PI/6));
		/** Määritellään liukuluku, jonka arvoksi annetaan laskukaava kuusiokulman alan laskemiseksi.*/
		
		System.out.printf ("The area of the hex angle is: " + "%.2f", area);
		/** Kuusiokulman ala kahden desimaalin tarkkuudella.*/
	}
}