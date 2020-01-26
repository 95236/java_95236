package Quiz1Java;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class QuizJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String pytanie;
		String odp;
		
		File file = new File("C://Users//Kubson//eclipse-workspace//QUIZ1//bin//Quiz1Java//Pytania.txt");
		
		Scanner wejscie = new Scanner(file);
		
		for (int i = 0; i <= 61; i++) 
		
		{	
			pytanie = wejscie.nextLine();
			
			while(pytanie.charAt(pytanie.length()-1)!=':')
				
			pytanie = wejscie.nextLine();
			
			System.out.println("Prosze odpowiedziec na kilka pytan: \n");	
			System.out.println("1. "+pytanie);
			
			while(pytanie.charAt(pytanie.length()-1)!='u')
				pytanie = wejscie.nextLine();
			System.out.println("a) "+pytanie);
			
			while(pytanie.charAt(pytanie.length()-1)!='d')
				pytanie = wejscie.nextLine();
			System.out.println("b) "+pytanie);
			
			while(pytanie.charAt(pytanie.length()-1)!='m')
				pytanie = wejscie.nextLine();
			System.out.println("c) "+pytanie);
			
			while(pytanie.charAt(pytanie.length()-1)!='w')
				pytanie = wejscie.nextLine();
			System.out.println("d) "+pytanie);
			
			while(pytanie.charAt(pytanie.length()-1)!='e')
				pytanie = wejscie.nextLine();
			System.out.println("2. "+pytanie);	
		}
		wejscie.close();
		
		
	}
}
