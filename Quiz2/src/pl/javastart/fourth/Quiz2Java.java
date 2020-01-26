package pl.javastart.fourth;
import java.util.Scanner;
public class Quiz2Java {

	public static void main(String[] args) {
		String imie; // imie uzytkownika
		String nazwisko; //nazwisko uzytkownika
		Scanner odczyt = new Scanner (System.in);
		
		System.out.println("Podaj swoje imie :");
		imie = odczyt.nextLine();
		System.out.println("Podaj sowje nazwisko :");
		nazwisko = odczyt.nextLine();
		
		System.out.println("Witaj "+imie+" "+nazwisko+" Odpowiedz teraz na kilka pytan: \n");
		System.out.println("Pytanie nr 1: Jakie miasto jest stolica Polski: \n");
		System.out.println("Madryt - wybierz 1 \t Lodz - Wybierz 2\n\nWarszawa - Wybierz 3 \t Krakow - Wybierz 4");
		int wybor; //zmienna wybrana przez uzytkownika
		wybor = odczyt.nextInt();
		
		if(wybor != 1 && wybor != 2 && wybor != 3 && wybor != 4)
{
	System.out.println("Podales bledna odpowiedz");
}
		else if(wybor == 1 || wybor == 2 || wybor == 4)
		{
			System.out.println("To nie jest stolica Polski. Wybrales zla odpowiedz");	
		
		}
		else if (wybor == 3)
		{
			System.out.println("Zgadza sie Warszawa jest stolica Polski - To poprawna odpowiedz, BRAWO!");
	    }
	}

}
