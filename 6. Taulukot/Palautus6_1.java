/**
 * @(#)Palautus6_1.java
 *
 * Ohjelmassa määritellään 5-alkioinen merkkijonotaulukko, johon pyydetään
 * käyttäjältä palvelujen nimet. Ohjelma tulostaa palvelujen nimet taulukon
 * alusta loppuun ja lopusta alkuun.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/10/6
 */

/** 
 * Tuodaan Javan kirjastot käyttöön.
 */

import java.util.*;
 
public class Palautus6_1 { 

	/** 
	* Tuodaan String luokan metodit käyttöön.
	* Luodaan 5-alkioinen taulukko, johon pyydetään käyttäjältä
	* arvot.
	*
	* @param kokonaisluku
	*/
	
	public static void main (String [] args ) {
		
		int i;
		
		String [] services = new String [5];
		
		System.out.println("Enter five services names:");
		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < services.length; i++){
			services[i] = scan.nextLine();
		
		} System.out.println();
		
		
		/** Tulostetaan taulukon arvot taulukon alusta loppuun.*/
		
		for(i = 0; i < services.length; i++){
			
			System.out.println(services[i]);
		
		} System.out.println();
		
		
		/** Tulostetaan taulukon arvot taulukon lopusta alkuun.*/
		
		for(i = services.length - 1; i >= 0; i--){
			System.out.println(services[i]);
			
		}
	}
}