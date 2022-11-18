/**
 * @(#)Palautus5_4.java
 *
 * Ohjelmassa metodin parametrina annetaan tulon viimeinen (suurin) tekijä,
 * joka on parillinen tai pariton kokonaisluku. Metodi palauttaa lukusarjan tulon.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/10/3
 */

/** Tuodaan Javan kirjastot käyttöön.
*/

import java.util.*;
 
public class Palautus5_4 { 

	/** 
	* Tuodaan String luokan metodit käyttöön.
	* Kutsutaan metodia ja palautetaan lukusarjan tulo.
	*
	* @param kokonaisluku
	*/
	
	public static void main (String [] args ) {
		
		
		long result = product(5);
		System.out.println(result);
	}
	
	/** 
	* Metodissa lasketaan lukusarjan tulo sen mukaan,
	* onko luku parillinen vai pariton.
	*
	* @param kokonaisluku
	* @param kokonaisluku
	* @return parillisen lukusarjan tulo
	* @return parittoman lukusarjan tulo
	*/
	
	public static long product (long value){
		long result = 1;
		long i;
		
		if (value % 2 == 0){
				
			for(i = 2; i <= value; i = i + 2){
				result = result * i;
			}
			
			return result;
		
		} else {
			
			for(i = 1; i <= value; i = i + 2){
				result = result * i;
			}
			
			return result;
		}	
	}
}
