import java.util.*; // Tuodaan Javan kirjastot käyttöön.

public class Palautus2_2 { // Otsikko voisi olla esim. customerFeedback, mutta helpompi löytää tehtävä palautettavaksi tällä nimellä.
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in); // Otetaan käyttöön Scanner apuväline.
		
		System.out.println ("Enter a grade on the service (0-5):"); //Pyydetään käyttäjältä arvosana palvelusta.
		int grade = input.nextInt(); //Lukemisoperaatio
		
		switch(grade){ // Käytetään switch lausetta. Vertaillaan käyttäjän antamaa arvosanaa ja tulostetaan sitä vastaava tuloste.
			case 0 : System.out.println("Feedback was bad"); break; // break lopettaa, kun haluttu arvo on löytynyt, eikä käy kaikkia läpi.
			case 1 : System.out.println("Feedback was moderate"); break;
			case 2 : System.out.println("Feedback was satisfactory"); break;
			case 3 : System.out.println("Feedback was good"); break;
			case 4 : System.out.println("Feedback was commendable"); break;
			case 5 : System.out.println("Feedback was excellent"); break;
		}
	}
}