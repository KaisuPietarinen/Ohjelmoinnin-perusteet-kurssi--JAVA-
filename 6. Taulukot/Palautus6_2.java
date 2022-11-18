/**
 * @(#)Palautus6_2.java
 *
 * 1) Ohjelmassa määritellään 5-alkioinen merkkijonotaulukko, johon pyydetään
 * käyttäjältä palvelujen nimet. Ohjelma tulostaa palvelujen nimet taulukon
 * alusta loppuun ja lopusta alkuun.
 * 
 * 2) Ohjelma pyytää käyttäjää antamaan syötteenä haettavan palvelun nimen. 
 * Ohjelma etsii haettavan arvon ja tulostaa sen indeksin.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/10/6
 */

/** 
 * Tuodaan Javan kirjastot käyttöön.
 */

import java.util.*;
 
public class Palautus6_2 { 

	/** 
	* Tuodaan String luokan metodit käyttöön.
	*
	* 1) Ohjelmassa määritellään 5-alkioinen merkkijonotaulukko, johon pyydetään
	* käyttäjältä palvelujen nimet. Ohjelma tulostaa palvelujen nimet taulukon
	* alusta loppuun ja lopusta alkuun.
	*
	* @param kokonaisluku
	*/
	
	public static void main (String [] args ) {
		
		int i;
		
		String [] services = new String [5];
		
		System.out.println("Enter service names:");
		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < services.length; i++){
			services[i] = scan.nextLine();
		
		} System.out.println();
		
		for(i = 0; i < services.length; i++){
			System.out.println(services[i]);
		
		} System.out.println();
		
		for(i = services.length - 1; i >= 0; i--){
			System.out.println(services[i]);
			
		} System.out.println();
		
		
		/** 
		* 2) Ohjelma pyytää käyttäjää antamaan syötteenä haettavan palvelun nimen. 
		* Ohjelma etsii haettavan arvon ja tulostaa sen indeksin. 
		*
		* @param merkkijono
		*/
		
		System.out.println("Enter the service to be searched:");
		String answer = scan.nextLine();
		
		
		for (i = 0; i < services.length; i++){
			if (answer.equals(services[i])){
				answer = services[i];
				
				System.out.println(i);
		
			}
		}
	}
}