
package pl.javastart.third;
import java.util.Scanner;
public class ImieJava {
	  public static final int ROK = 2018;

	public static void main(String[] args) {
	 String imie; //w zmiennnej imie zapiszemy imie uzytkownika
	 String nazwisko; // nazwisko uzytkownika
	 int wiek; //wiek uzytkownika
	 int rok_uro; //rok urodzenia 
	 
	 Scanner odczyt = new Scanner(System.in); //odebranie danych od usera
	 
	 System.out.println("Podaj swoje imie:");
	 imie = odczyt.nextLine();
	 
	 System.out.println("Podaj swoje nazwisko:");
	 nazwisko = odczyt.nextLine();
	 
	 System.out.println("Podaj swoj wiek:");
	 wiek = odczyt.nextInt();
	 
	 rok_uro = ROK - wiek;
	 
	 System.out.println("Witaj "+ imie +" "  +  nazwisko + " Urodziles sie w "+ rok_uro   + " roku");
	 
	}

}


