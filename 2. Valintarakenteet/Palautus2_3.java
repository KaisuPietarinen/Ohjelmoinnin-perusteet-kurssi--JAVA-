import java.util.*; // Tuodaan Javan kirjastot käyttöön.

public class Palautus2_3 { // Otsikko voisi olla esim. cottageBooking, mutta helpompi löytää tehtävä palautettavaksi tällä nimellä.
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in); // Otetaan käyttöön Scanner apuväline.
		
		System.out.println ("Enter the number corresponding to the month (1-12):"); //Pyydetään käyttäjältä arvosana palvelusta.
		int grade = input.nextInt(); //Lukemisoperaatio
		
		switch(grade){ // Käytetään switch-case rakennetta. Vertaillaan käyttäjän antamaa arvosanaa ja tulostetaan sitä vastaava tuloste.
			case 1 : System.out.println("January"); break; // break lopettaa, kun haluttu arvo on löytynyt, eikä käy kaikkia läpi.
			case 2 : System.out.println("February"); break;
			case 3 : System.out.println("March"); break;
			case 4 : System.out.println("April"); break;
			case 5 : System.out.println("May"); break;
			case 6 : System.out.println("June"); break;
			case 7 : System.out.println("July"); break;
			case 8 : System.out.println("August"); break;
			case 9 : System.out.println("September"); break;
			case 10 : System.out.println("October"); break;
			case 11 : System.out.println("November"); break;
			case 12 : System.out.println("December"); break;
			default : System.out.println("Invalid number, enter only number 1-12."); // Ilmoitetaan käyttäjälle jos annettu numero on epäkelpo ja päätetään.
		}
	}
}