/**
 * @(#)Palautus3_1.java
 *
 * Ohjelma purkaa käyttäjän antaman merkkijonon yksittäisiksi tiedoiksi, 
 * tulostaa tiedot ja kertoo onko asiakkaalla ajokorttia.
 *
 * Harjoitellaan samalla JavaDoc-dokumetointia.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/9/22
 */
 
import java.util.*;
/** Tuodaan Javan kirjastot käyttöön.*/

public class Palautus3_1 { 
/** Ohjelma purkaa käyttäjän antaman merkkijonon yksittäisiksi tiedoiksi, 
* tulostaa tiedot ja kertoo onko asiakkaalla ajokorttia.*/

	public static void main (String [] args) {
	/** Otetaan String luokan metodit käyttöön.*/
	
		Scanner input = new Scanner (System.in);
		/** Luodaan scanner-olio.*/
		
		System.out.println ("Enter your first name;last name;age;driver's license (Y/N). Be sure to enter ; ."); // Pyydetään käyttäjää antamaan tietonsa ja huomioimaan ;-merkki.
		String answers = input.nextLine();
		/** Lukemisoperaatio.*/
		
		StringTokenizer parts = new StringTokenizer(answers, ";");		// Puretaan merkkijono yksittäisiksi tiedoiksi.
		/** Luodaan StringTokenizer-olio, jolle annetaan arvoksi 
		*käyttäjän vastaus ja ; - merkki*/
		
		String part1 = parts.nextToken(); 
		/** Luodaan merkkijonomuuttuja, jossa arvona etunimi.*/
		
		String part2 = parts.nextToken();
		/** Luodaan merkkijonomuuttuja, jossa arvona sukunimmi.*/
		
		String part3 = parts.nextToken(); 
		/** Luodaan merkkijonomuuttuja, jossa arvona ikä.*/
		
		String part4 = parts.nextToken();
		/** Luodaan merkkijonomuuttuja, jossa arvona tieto ajokortin omistamisesta.*/
		
		if(part4.equalsIgnoreCase("Y")){ 
		/** Käytetään valintarakennetta, jonka ehtona on, 
		että käyttäjän syöttämän vastauksen pitää olla y, 
		kirjaimen koolla ei ole väliä, kun käytetään vertailuun equalIgnoreCase.*/
			System.out.println ("Entered information about customer " + part1 + " " + part2 + ", who is " + part3 + " years old and owns a driver's license.");
		/** Ehdon ollessa tosi, tulostetaan käyttäjän antamat tiedot 
		* ja tieto ajokortin omistamisesta.*/
		} 
		else{
			System.out.println ("Entered information about customer " + part1 + " " + part2 + ", who is " + part3 + " years old and doesn't own a driver's license.");
		/** Ehdon ollessa epätosi, tulostetaan käyttäjän antamat tiedot 
		* ja tieto ettei asiakkaalla ole ajokorttia.*/
		}
	}
}
