import java.util.*; // Otetaan javan kirjastot käyttöön.

public class Palautus3 { // Otsikko voisi olla grossPrice, mutta helpompi löytää tehtävä palautettavaksi tällä nimellä.
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.ENGLISH); // Asetetaan oletuskieleksi englanti, jotta voidaan käyttää pistettä desimaalierottimena.
		
		Scanner input = new Scanner (System.in); // Otetaan käyttöön Scanner-apuväline.
		
		double netPrice = 0; // Annetaan muuttujille alkuarvot
		double vatPercentage = 0;
		double decimal = 0;
		double grossPrice = 0;

		try { // Luodaan try/catch-rakenne
			System.out.println ("Enter net price:"); // Pyydetään käyttäjältä nettohinta.
			netPrice = input.nextDouble(); // Lukemisoperaatio
		
			System.out.println ("Enter VAT percentage:"); // Pyydetään käyttäjältä alv-prosentti.
			vatPercentage = input.nextDouble(); // Lukemisoperaatio
		}
		catch (InputMismatchException dot) {
			System.out.println ("Use only dot"); // Mikäli käyttäjä syöttää pilkun, ohjelma ilmoittaa virheestä kehoittamalla käyttämään pistettä.
			System.exit (0); // Virheen sattuessa lopetetaan ohjelman suoritus.
		}
		decimal = vatPercentage / 100 + 1; // Muutetaan alv-prosentti desimaaliksi ja lisätään siihen 1.
		grossPrice = decimal * netPrice; //Laskutoimitus bruttohinnan laskemiseksi.
		System.out.println ("Gross price is: " + grossPrice + "."); //Tulostetaan käyttäjälle bruttohinta.
	}	
}