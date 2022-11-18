import java.util.*; // Tuodaan Javan kirjastot käyttöön.

public class Palautus2_1 { // Otsikko voisi olla esim. customerRegister, mutta helpompi löytää tehtävä palautettavaksi tällä nimellä.
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in); // Otetaan käyttöön Scanner apuväline.
		
		System.out.println ("Enter your first name:"); // Pyydetään käyttäjältä etunimi.
		String firstName = input.nextLine(); // Lukemisoperaatio
		
		System.out.println ("Enter your last name:"); // Pyydetään käyttäjältä sukunimi.
		String lastName = input.nextLine(); // Lukemisoperaatio
		
		System.out.println ("Enter your age:"); // Pyydetään käyttäjältä ikä ja oletetaan iän annettavan kokonaislukuna.
		int age = input.nextInt(); // Lukemisoperaatio.
		
		String tyhja = input.nextLine(); // Tämä, jotta ohjelma ei herjaa int:n jälkeen tulevaa Stringiä alempana.
		
		System.out.println ("Do you have a driver's license (Y/N):"); 
		// Kysytään onko käyttäjällä ajokorttia.
		String driversLicense = input.nextLine(); // Lukemisoperaatio.
		
		
		
		
		if(driversLicense.equalsIgnoreCase("Y")){ 
		// Käytetään valintarakennetta, jonka ehtona on, että käyttäjän syöttämän vastauksen pitää olla y, kirjaimen koolla ei ole väliä kun käytetään equalIgnoreCase.
			System.out.println ("Entered information about customer " + firstName + " " + lastName + ", who is " + age + " years old and owns a driver's license.");
		// Kun ehto on tosi, tulostetaan käyttäjän antamat tiedot ja tieto, että käyttäjällä on ajokortti.
		} 
		else{
			System.out.println ("Entered information about customer " + firstName + " " + lastName + ", who is " + age + " years old and doesn't own a driver's license.");
		// Kun ehto on epätosi, syötetään käyttäjän antamat tiedot ja tieto, että käyttäjällä ei ole ajokorttia.
		}
	}
}
