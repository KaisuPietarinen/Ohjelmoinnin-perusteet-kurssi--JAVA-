/**
 * @(#)Palautus5_3.java
 *
 * Ohjelmassa metodi palauttaa kahden desimaalilukuparametrin
 * neliöiden summan.
 *
 * @author Kaisu Pietarinen
 * @version 1.00 2021/10/3
 */

/** Tuodaan Javan kirjastot käyttöön.
*/

import java.util.*;
 
public class Palautus5_3 { 

	/** 
	* Tuodaan String luokan metodit käyttöön.
	* Kutsutaan metodia ja palautetaan kahden 
	* desimaalilukuparametrin neliöiden summa.
	*
	* @param liukuluku
	*/
	
	public static void main (String [] args ) {
		
		double sum = squareSum(5.6, 3.5);
		System.out.println(sum);
	}
	
	/**
	* Metodissa lasketaan kahden annetun desimaalilukuparametrin 
	* neliöt ja lasketaan niiden summa.
	*
	* @param liukuluku
	* @param liukuluku
	* @param liukuluku
	* @return summa
	*/
	
	public static double squareSum (double value1, double value2){
		double square1 = value1 * value1;
		double square2 = value2 * value2;
		double sum = square1 + square2;
		return sum;
	}
}