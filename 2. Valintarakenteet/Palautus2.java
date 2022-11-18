import java.util.*; // Otetaan javan kirjastot käyttöön.

public class Palautus2 { // Otsikko voisi olla bmi, mutta helpompi löytää tehtävä palautettavaksi tällä nimellä.
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.ENGLISH); // Asetetaan oletuskieleksi englanti, jotta voidaan käyttää pistettä desimaalierottimena.
		
		Scanner input = new Scanner (System.in); // Otetaan käyttöön Scanner-apuväline.
		
		double weight = 0; // Annetaan muuttujille alkuarvot
		double lenght = 0;
		double bmi = 0;

		try { // Luodaan try/catch-rakenne
			System.out.println ("Enter your weight (kg):"); // Pyydetään käyttäjältä paino kiloina.
			weight = input.nextDouble(); // Lukemisoperaatio
		
			System.out.println ("Enter your lenght (m):"); // Pyydetään käyttäjältä pituus metreinä.
			lenght = input.nextDouble(); // Lukemisoperaatio
		}
		catch (InputMismatchException dot) {
			System.out.println ("Use only dot"); // Mikäli käyttäjä syöttää pilkun, ohjelma ilmoittaa virheestä kehoittamalla käyttämään pistettä.
			System.exit (0); // Virheen sattuessa lopetetaan ohjelman suoritus
		}
		
		bmi = weight / (lenght*lenght); //Laskutoimitus käyttäjän bmi:n laskemiseksi.
		System.out.println ("Your BMI is: " + bmi + "."); //Tulostetaan käyttäjän bmi.
	}	
}