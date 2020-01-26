
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab12 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
/*
		String imie; //imie usera
		Scanner odczyt = new Scanner(System.in);
		
		
		System.out.println("Podaj swoje imie: ");
		
		imie = odczyt.nextLine();
		
		System.out.println("Nazywasz sie: "+imie);
		
		String odpowiedz1 = "Tak";
		String odpowiedz2 = "Nie";
		String odpowiedz;
		
		System.out.println("Czy java jest ok? Wpisz Tak lub Nie ");
		
		odpowiedz = odczyt.nextLine();
		
		if(odpowiedz.equals(odpowiedz1))
		{
			System.out.println("Masz racje buraku");
			
		}
		
			else if(odpowiedz.equals(odpowiedz2))
			{
				
				System.out.println("Jestes debilem! Ucz sie!");		
			}
			else
			 System.out.println("Nie masz racji!");
			 */
		/*
		System.out.println("1-Dodaj\t\t 2-Odejmij\n3-Podziel\t\t4-Pomnoz");
		int dzialanie;
		
	    Scanner odczyt = new Scanner(System.in);
	    dzialanie = odczyt.nextInt();
	    
	    System.out.println("Podaj dwie liczby: ");
	    int liczba1;
	    int liczba2;
	    
	    liczba1= odczyt.nextInt();
	    liczba2= odczyt.nextInt();
	    
	    
	    
	    if(dzialanie == 1)
	    {
	    	int suma = liczba1+liczba2;
	    	System.out.println("Wynik: "+suma);
	    }
	    */
		File file = new File("boki.txt");
		Scanner odczyt = new Scanner(file);
		int wynik;
		wynik = odczyt.nextInt();
		
		
		
		
		
		}
		
	

}



