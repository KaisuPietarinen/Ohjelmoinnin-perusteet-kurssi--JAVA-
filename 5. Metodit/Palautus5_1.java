/**
 * @(#)Palautus5_1.java
 *
 * Ohjelmassa metodi pyytää käyttäjää antamaan merkin 
 * ja palauttaa sen kutsujalle.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/10/3
 */

/** Tuodaan Javan kirjastot käyttöön.*/

import java.util.*;
 
public class Palautus5_1 { 

	/** 
	* Tuodaan String luokan metodit käyttöön.
	* Kutsutaan metodia ja tulostetaan palautettava merkkijono.
	*
	* @param palautettava merkkijono
	*/
	
	public static void main (String [] args ) {
		
		String input = Answer();
		System.out.println(input);
	
	}
	
	/** 
	* Pyytä käyttäjältä yhden merkin ja palauttaa sen.
	*
	* @param merkkijonomuuttuja
	* @return syöte
	*/
	
	public static String Answer(){
		System.out.println("Do you want to delete customer data? (Y/N)");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		
		return input;
		
	}
}