/** 
 * @(#)Palautus6_4.java
 *
 * Ohjelma kysyy käyttäjältä viiden palvelun käyttökerrat viikon 
 * jokaisena päivänä (5*7 matriisi). Ohjelma tulostaa jokaiselle yksittäiselle 
 * palvelulle keskiarvotuoton/päivä sekä päiväkohtaisen kaikkien palveluiden 
 * keskiarvotuoton. 
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/10/14
 */

/** 
 * Tuodaan Javan kirjastot käyttöön.
 */

import java.util.*;
 
public class Palautus6_4{

	/** 
	* Tuodaan String luokan metodit käyttöön.
	*
	* Ohjelma kysyy käyttäjältä viiden palvelun käyttökerrat viikon 
	* jokaisena päivänä (5*7 matriisi). Ohjelma tulostaa jokaiselle yksittäiselle 
	* palvelulle keskiarvotuoton/päivä sekä päiväkohtaisen kaikkien palveluiden 
	* keskiarvotuoton.
	*
	* @param kokonaisluku
	* @param kokonaisluku
	* @param merkkijonotaulukko
	* @param merkkijonotaulukko
	* @param kokonaislukutaulukko (matriisi) 
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
		
		
		String [] ylarivi = {"Palvelut", "MA", "TI", "KE", "TO", "PE", "LA", "SU", "Keskiarvo"};
		
		double [][] kayttoKerrat = new double [5][7];
		double [] keskarvPaiva = new double [7];
		double [] keskarvViikko = new double [7];
		
		System.out.println();
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s\t %s\n", ylarivi[0], ylarivi[1], ylarivi[2], ylarivi[3], ylarivi[4], ylarivi[5], ylarivi[6], ylarivi[7], ylarivi[8]);
		
		for(i = 0; i < 5; i++){
			for(j = 0; j < 7; j++){
				kayttoKerrat[i][j] = (Math.random() * 500.00);
				keskarvPaiva[i] = (double) (keskarvPaiva[i] + kayttoKerrat[i][j] / 7);
				keskarvViikko[j] = (double) (keskarvViikko[j] + kayttoKerrat[i][j] / 5);		
		}
			}
			
			for(i = 0; i < 5; i++){
				System.out.printf("%s\t %3.2f\t %3.2f\t %3.2f\t %3.2f\t %3.2f\t %3.2f\t %3.2f\t %3.2f\n", lisaPalv[i], kayttoKerrat[i][0], kayttoKerrat[i][1], kayttoKerrat[i][2], kayttoKerrat[i][3], kayttoKerrat[i][4], kayttoKerrat[i][5], kayttoKerrat[i][6], keskarvPaiva[i]);
			}
			
			System.out.printf("%s\t %3.2f\t %3.2f\t %3.2f\t %3.2f\t %3.2f\t %3.2f\t %3.2f\n", "Keskiarvo", keskarvViikko[0], keskarvViikko[1], keskarvViikko[2], keskarvViikko[3], keskarvViikko[4], keskarvViikko[5], keskarvViikko[6]);
	}		
}