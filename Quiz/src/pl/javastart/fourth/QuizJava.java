package pl.javastart.fourth;
import java.util.Scanner;
public class QuizJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String imie; //zmienna przechowujaca imie
		String nazwisko; //zmienna przechowujaca nazwisko
		Scanner odczyt = new Scanner (System.in); //odebranie danych od usera
		
		System.out.println("Podaj swoje imie: ");
		imie = odczyt.nextLine();
		System.out.println("Podaj swoje nazwisko: ");
		nazwisko = odczyt.nextLine();
		
		System.out.println("Witaj " +imie +" " + nazwisko + " Dla kazdego z ponizszych pytan wybierz prawidlowa odpowiedz: ");
		
		 
		System.out.println("Ile kart jest w talii:");
		System.out.println("a : 23 \t b: 36\nc: 45 \t d:54");
		String pytanie1; //ilosc kart podana przez uzytkownika
		pytanie1 = odczyt.nextLine();
		

		switch(pytanie1)
		{
			case "a":
				System.out.println("Wybrales bledna odpowiedz");
				break;
			case "b":
				System.out.println("Wybrales bledna odpowiedz");
				break;
			case "c":
				System.out.println("Wybrales bledna odpowiedz");
				break;
			case "d":
		    	System.out.println("Wybrales poprawna odpowiedz");
		    	break;
			default:
				System.out.println("Wybrales bledna odpowiedz");
	   }
	
		System.out.println("Czy Karol to fajny chlopak:");
		System.out.println("a : Tak \t b: nie\nc: nie wiem \t d:nie powiem");
		String pytanie2; //dane pobrane od uzytkownika
		pytanie2 = odczyt.nextLine();
		

		switch(pytanie2)
		{
			case "a":
				System.out.println("Wybrales prawidlowa odpowiedz");
				break;
			case "b":
				System.out.println("Wybrales bledna odpowiedz");
				break;
			case "c":
				System.out.println("Wybrales bledna odpowiedz");
				break;
			case "d":
		    	System.out.println("Wybrales bledna odpowiedz");
		    	break;
			default:
				System.out.println("Wybrales bledna odpowiedz");
	   }
	}
}
