import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String imie; 
		String nazwisko;
		int wiek;
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Prosze podac swoje imie:");
		
		imie = odczyt.nextLine();
		System.out.println("Twoje imie:"+imie);
		
		System.out.println("Prosze podac swoje nazwisko:");
		
		nazwisko = odczyt.nextLine();
		System.out.println("Twoje nazwisko:"+nazwisko);
		
        System.out.println("Prosze podac swoj wiek:");
		
		wiek = odczyt.nextInt();
		System.out.println("Twoj wiek:"+wiek);
		
		int rok;
		rok= 2018-wiek;
		
		System.out.println("Witaj "+imie+" "+nazwisko+" Urodziles sie w: "+rok);
	}

}
