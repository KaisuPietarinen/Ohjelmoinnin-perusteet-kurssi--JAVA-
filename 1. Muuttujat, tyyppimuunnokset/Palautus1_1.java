import java.util.*; // Tuodaan Javan kirjastot käyttöön.

public class Palautus1_1 { // Otsikko voisi olla esim. customerRegister, mutta helpompi löytää tehtävä palautettavaksi tällä nimellä.
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in); // Otetaan käyttöön Scanner apuväline.
		
		System.out.println ("Enter your first name:"); //Pyydetään käyttäjältä etunimi.
		String firstName = input.nextLine(); //Lukemisoperaatio
		
		System.out.println ("Enter your last name:"); // Pyydetään käyttäjältä sukunimi.
		String lastName = input.nextLine(); //Lukemisoperaatio
		
		System.out.println ("Enter your age:"); // Pyydetään käyttäjältä ikä ja oletetaan iän annettavan kokonaislukuna.
		int age = input.nextInt(); //Lukemisoperaatio.
		
		System.out.println ("Entered information about customer " + firstName + " " + lastName + ", who is " + age + " years old.");
		// Tulostetaan käyttäjän antamat tiedot.
	}
}
