/** 
 * @(#)Palautus6_3.java
 *
 * Ohjelma arpoo viiden palvelun käyttökerrat viikon jokaisena 
 * päivänä (5*7 matriisi). Ohjelma tulostaa jokaisen palvelun 
 * viikon käyttökerrat yhteensä sekä päivittäiset palveluiden 
 * käyttökerrat yhteensä.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/10/14
 */

/** 
 * Tuodaan Javan kirjastot käyttöön.
 */

import java.util.*;
 
public class Palautus6_3{

	/** 
	* Tuodaan String luokan metodit käyttöön.
	*
	* Ohjelma arpoo viiden palvelun käyttökerrat viikon jokaisena 
	* päivänä (5*7 matriisi). Ohjelma tulostaa jokaisen palvelun 
	* viikon käyttökerrat yhteensä sekä päivittäiset palveluiden 
	* käyttökerrat yhteensä
	*
	* @param kokonaisluku
	* @param kokonaisluku
	* @param merkkijonotaulukko
	* @param merkkijonotaulukko
	* @param kokonaislukutaulukko 
	* @param kokonaislukutaulukko
	* @param kokonaislukutaulukko
	*/
	
	public static void main (String [] args ) {
		
		int i = 0;
		int j = 0;
		
		String [] lisaPalv = new String [5];
		lisaPalv [0] = "Huskyajelu";
		lisaPalv [1] = "Poroajelu";
		lisaPalv [2] = "Moottorikelk.";
		lisaPalv [3] = "Lumikenkaily";
		lisaPalv [4] = "Savusauna";
		
		String [] ylarivi = {"Palvelut", "MA", "TI", "KE", "TO", "PE", "LA", "SU", "Yhteensa"};
		
		int [][] kayttoKerrat = new int [5][7];
		int [] yhtPaiva = new int [7];
		int [] yhtViikko = new int [7];
		
		System.out.println();
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s\t %s\n", ylarivi[0], ylarivi[1], ylarivi[2], ylarivi[3], ylarivi[4], ylarivi[5], ylarivi[6], ylarivi[7], ylarivi[8]);
			
					
		for(i = 0; i < 5; i++){
			for(j = 0; j < 7; j++){
				kayttoKerrat[i][j] = (int)(Math.random() * 10);
				yhtPaiva[i] = yhtPaiva[i] + kayttoKerrat[i][j];
				yhtViikko[j] = yhtViikko[j] + kayttoKerrat[i][j];
		}
			}
			
			for(i = 0; i < 5; i++){
				System.out.printf("%s\t %1d\t %1d\t %1d\t %1d\t %1d\t %1d\t %1d\t %1d\n", lisaPalv[i], kayttoKerrat[i][0], kayttoKerrat[i][1], kayttoKerrat[i][2], kayttoKerrat[i][3], kayttoKerrat[i][4], kayttoKerrat[i][5], kayttoKerrat[i][6], yhtPaiva[i]);
			}
			
			System.out.printf("%s\t %1d\t %1d\t %1d\t %1d\t %1d\t %1d\t %1d\n", "Yhteensa", yhtViikko[0], yhtViikko[1], yhtViikko[2], yhtViikko[3], yhtViikko[4], yhtViikko[5], yhtViikko[6]);
	}		
}