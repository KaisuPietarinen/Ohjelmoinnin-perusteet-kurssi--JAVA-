/**
 * @(#)Palautus5_2.java
 *
 * Ohjelmassa metodi tulostaa parametrina annetun määrän 
 * parametrina annettua merkkijonoa.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/10/3
 */

/** Tuodaan Javan kirjastot käyttöön.*/

import java.util.*;

 
public class Palautus5_2 { 

	/** 
	* Tuodaan String luokan metodit käyttöön.
	* Kutsutaan metodia, jolle annetaan parametrit.
	*/
	
	public static void main (String [] args ) {
		Print("Asiaa!", 2);
		
	}
	
	/** 
	* Metodissa kasvatetaan tulostettavan merkkijonon määrää vastaamaan
	* parametrina annetua kokonaislukua.
	*
	* @param kokonaisluku
	*/
	
	public static void Print (String text, int value){
		int i = 0;
		
		while(i < value){
			System.out.println(text);
			i++;
		}
	}
}