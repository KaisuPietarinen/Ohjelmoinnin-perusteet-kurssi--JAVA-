import java.io.*; // io - Javan input/output-kirjasto (on myös nio.*)
import java.util.*;
 
public class Palautus7_2 { // Kirjoitetaan tiedosto
	
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
		
		
		writer.write("Data for customer # " + id);
		writer.newLine();
		writer.write(name);
		writer.newLine(); // Rivinvaihto
		writer.write(email);
		writer.newLine();
		writer.write(phone);
		writer.newLine();
		writer.newLine();
		
		writer.close(); 
		
		System.out.println();
		
		Scanner tiedosto = new Scanner(new File("Asiakastiedot.txt"));
		
		while (tiedosto.hasNextLine()) {
			String rivi = tiedosto.nextLine();
			System.out.println(rivi);
		}
		
		System.out.println();
		
		System.out.println("Enter searching ID:");
			String id1 = scan.nextLine();
		
		readFromFile(id1);
		
	

	}
	
	public static void readFromFile(String searchId) throws Exception{
		
		Scanner tiedosto = new Scanner(new File("Asiakastiedot.txt"));
		
		while(tiedosto.hasNextLine()){
		String rivi = tiedosto.nextLine();
		}
		StringTokenizer osa = new StringTokenizer(searchId," ");
		
		while (osa.hasMoreTokens() ) {
			String pala = osa.nextToken();
			
		if (pala.equals(searchId)){
			System.out.println("Loytyi");
			}
			else{
				System.out.println("Ei loytynyt");
			}
		
		/*StringTokenizer pilkottava = new StringTokenizer(rivi, " ");
		
		while(pilkottava.hasMoreTokens()){
			String osa = pilkottava.nextToken();
			System.out.println(osa);
					if(osa.equals(searchId)){
						System.out.println(rivi);*/
					
				
		}
	}
}