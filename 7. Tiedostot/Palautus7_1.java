import java.io.*; // io - Javan input/output-kirjasto (on myös nio.*)
import java.util.*;
 
public class Palautus7_1 { // Kirjoitetaan tiedosto
	
	public static void main (String [] args) throws Exception{ // Heitä virhe eteenpäin
	
		String fileName = "Asiakastiedot.txt";
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)); //BufferedWriter niminen muuttuja, true = lisää, ei ylikirjoita
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter customer ID:");
		String id = scan.nextLine();
		System.out.println("Enter your full name:");
		String name = scan.nextLine();
		System.out.println("Enter your E-mail adress:");
		String email = scan.nextLine();
		System.out.println("Enter your phone number:");
		String phone = scan.nextLine();
		
		writer.write("Data for customer #" + id);
		writer.newLine();
		writer.write(name);
		writer.newLine(); // Rivinvaihto
		writer.write(email);
		writer.newLine();
		writer.write(phone);
		writer.newLine();
		writer.newLine();
		
		
		writer.close(); // Suljetaan tiedosto
		// Jos ylhäällä ei lue true, niin ylikirjoittaa eli korvaa aiemman
		// Jos true, niin ei ylikirjoita/korvaa vaan tallentaa lisäksi
		
	}
}