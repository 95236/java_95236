package pl.javastart.fiveth;
import java.util.Scanner;
public class Quiz3Java {

	public static void main(String[] args) {
		String imie; //imie uzytkownika
		String nazwisko; //nazwisko uzytkownika 
		Scanner odczyt = new Scanner (System.in);
		
		System.out.println("Prosze podac imie: ");
		imie = odczyt.nextLine();
		System.out.println("Prosze podac nazwisko: ");
		nazwisko = odczyt.nextLine();
		
		System.out.println("Witaj "+imie+" "+nazwisko+" Odpowiedz teraz na kilka pytan\n");
		System.out.println("Pytanie 1: Czy Legia Warszawa wygrala mistrzostwo Polski w sezonie 2017/2018\n");
		System.out.println("Tak \t Nie\nNie pamietam \t Nie chce wiedziec");
		
		String first = "Nie";
		String first2 = "Nie pamietam";
		String first3 = "Nie chce wiedziec";
		
		String first1 = "Tak";
		String second; //dane pobrane od uzytkownika
		second=odczyt.nextLine();
		
		if (second.equals(first) || (second.equals(first2)) || (second.equals(first3)))
		{
			System.out.println("Wybrales odpowiedz " + second + " Niestety jest to bledna odpowiedz");
		}
		else if (second.equals(first1))
		{
			System.out.println("Tak - Legia Warszawa zdobyla mistrzostwo Polski w tym sezonie!");
		}
		else
		System.out.println("Podales bledna odpowiedz");

	}

}
