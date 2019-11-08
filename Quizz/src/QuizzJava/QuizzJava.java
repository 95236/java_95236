package QuizzJava;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


		public class QuizzJava 
		
		{
		 public static void main(String[] a) 
		 
		 {
		  
			 System.out.println("Sprawdz ten Quiz byku:\n\n");
			 try 
			 
			 {
		   // Uworzenie obiektu FileReader
		   FileReader fileReader = new FileReader("C://Users//Kubson//eclipse-workspace//Quizz//bin//QuizzJava//Pytania.txt");
		   
		   // Utworzenie obiektu bufferReader
		   BufferedReader bufferReader = new BufferedReader(fileReader);
		   
		   String linia;
		   
		   while((linia = bufferReader.readLine()) != null) 
		   
		   {
		    System.out.println(linia);
		   }
		   fileReader.close();
		  }
		  catch (FileNotFoundException e) 
			 
			 {
		   e.printStackTrace();
		  } 
		  catch (IOException e) 
			 
			 {
		   e.printStackTrace();
		  }
		  
		  System.out.println("Poprawne odpowiedzi:");
		  System.out.println("c\nb\nb\nd\nd\n");
		  
		 }
		}
		
	