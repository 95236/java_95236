package pl.javafirst.eleventh;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class Zad1Java
{

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] tab = new String[8];
		
		String imie; //imiona damskie zapisywane do pliku
		String nazwisko; //nazwisko 
		File file = new File("src/imiefirst.txt");
		File file1 = new File("src/nazwiskofirst.txt");
		
		
		Scanner wejscie = new Scanner(file);
		PrintWriter zapis = new PrintWriter("imiona.txt");
		PrintWriter zapis1 = new PrintWriter("nazwiska.txt");
		PrintWriter zapis2 = new PrintWriter("szpieg.txt");
		
		System.out.println("Prosze sczytac wszystkie imione zenskie konczace sie na A i zapisac do pliku imiona.txt: ");
		
		for (int i = 0; i <= 7; i++) {
			String first = "Jarema";
			
			imie = wejscie.nextLine();
			
			while(imie.charAt(imie.length()-1)!='a' || (imie.charAt(imie.length()-1)=='a' && imie.equals(first)))
			
			
			imie = wejscie.nextLine();
			
			
			//else if(imie.charAt(imie.length()-1)=='a')
			//tab[i] = imie;
				zapis.println(tab[i]=imie);
				
			System.out.println("Imie damskie z listy: dla i = "+i+" : "+tab[i]);		
		}
		wejscie.close();
		zapis.close();
		
		String szpieg = null;
		Scanner wejscie1 = new Scanner(file1);
		System.out.println("\nProsze sczytac wszystkie nazwiska z pliku i zapisac do nazwiska.txt: ");
		int i=1;
		while(wejscie1.hasNextLine())
		{
			String wynik[] = null;
			String wynik2[] = null;
		    nazwisko=wejscie1.nextLine();
		    wynik = nazwisko.split(" ",3);
			wynik2 = wynik[1].split("-",2);
			
			nazwisko = wynik2[0];
		
			zapis1.println(nazwisko);
			
			
			System.out.println("Nazwisko dla i = "+i+" : "+nazwisko);
		    i++;
		}
		zapis1.close();
		wejscie1.close();
		
		System.out.println("Prosze podac liczbe z zakresu 1 - 100");
		Scanner odczyt = new Scanner(System.in);
		
		int liczba; //liczba pobrana od uzytkownika
		liczba = odczyt.nextInt();
		
		while(liczba < 1 || liczba >100)
		{
			System.out.println("Bledne dane! Podaj liczbe z zakresu 1 - 100");
			liczba = odczyt.nextInt();
	}
		System.out.println("Wprowadzona liczba to: "+liczba);
		int liczba_imion=0;
		File file3 = new File("imiona.txt");
		Scanner wejscie2 = new Scanner(file3);
		while(wejscie2.hasNextLine())
		{
			System.out.println("Hejjj jestem w petli imiona");
			liczba_imion++;
			szpieg=wejscie2.nextLine();
		}
		wejscie2.close();
		System.out.println("Liczba lini w pliku imiona:"+liczba_imion);
		
		int liczba_nazwisk=0;
		File file4 = new File("nazwiska.txt");
		Scanner wejscie3 = new Scanner(file4);
		while(wejscie3.hasNextLine())
		{
			System.out.println("Hejjj jestem w petli nazwiska");
			liczba_nazwisk++;
			szpieg=wejscie3.nextLine();
		}
		wejscie3.close();
		System.out.println("Liczba lini w pliku nazwiska:"+liczba_nazwisk);
	
Random r = new Random();
int losowe_imie = r.nextInt(liczba_imion-1)+1;
System.out.println("Wylosowana liczba: "+losowe_imie);

Random r1 = new Random();
int losowe_nazwiska = r1.nextInt(liczba_nazwisk-1)+1;
System.out.println("Wylosowana liczba: "+losowe_nazwiska);

String wylosowane_imie = null;
Scanner wejscie4 = new Scanner(file3);
for(int k=0; k<losowe_imie;k++)
{
	wylosowane_imie=wejscie4.nextLine();
}
wejscie4.close();

System.out.println("Imie: "+wylosowane_imie);

String wylosowane_nazwiska = null;
Scanner wejscie5 = new Scanner(file4);
for(int k=0; k<losowe_nazwiska;k++)
{
	wylosowane_nazwiska=wejscie5.nextLine();
}
wejscie5.close();

System.out.println("Nazwisko: "+wylosowane_nazwiska);

int losowy_rok = 0;
Random rok = new Random();
losowy_rok = rok.nextInt(78)+22;
System.out.println("Wylosowany rok: "+losowy_rok);	


Random miesiac = new Random();
int losowy_miesiac = miesiac.nextInt(10)+1;
System.out.println("Wylosowany miesiac: "+losowy_miesiac);

String string_losowy_miesiac = null;

if(losowy_miesiac < 10) {
	string_losowy_miesiac = "0" + Integer.toString(losowy_miesiac);
}
else
{
	string_losowy_miesiac = Integer.toString(losowy_miesiac);
}


Random dzien = new Random();
int losowy_dzien = dzien.nextInt(31)+1;
System.out.println("Wylosowany dzien: "+losowy_dzien);

String string_losowy_dzien = null;

if(losowy_dzien < 10) {
	string_losowy_dzien = "0" + Integer.toString(losowy_dzien);
}
else
{
	string_losowy_dzien = Integer.toString(losowy_dzien);
}

Random koniec_peselu = new Random();
int losowy_koniec_peselu = koniec_peselu.nextInt(1000000)+900000;
System.out.println("Wylosowany koniec: "+losowy_koniec_peselu);

	String pesel = Integer.toString(losowy_rok)+string_losowy_miesiac+string_losowy_dzien+Integer.toString(losowy_koniec_peselu);
	System.out.println("Wylosowany koniec: "+pesel);
	
	zapis2.println(wylosowane_imie+" "+wylosowane_nazwiska+" "+pesel);
	zapis2.close();
	}
}


/*
package pl.javafirst.eleventh;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Zad1Java 
{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] tab = new String[8];
		
		String imie; //imiona damskie zapisywane do pliku
		String nazwisko; //nazwisko 
		File file = new File("imiefirst.txt");
		File file1 = new File("nazwiskofirst.txt");
		
		
		Scanner wejscie = new Scanner(file);
		PrintWriter zapis = new PrintWriter("imiona.txt");
		PrintWriter zapis1 = new PrintWriter("nazwiska.txt");
		
		System.out.println("Prosze sczytac wszystkie imione zenskie konczace sie na A i zapisac do pliku imiona.txt: ");
		
		for (int i = 0; i <= 7; i++) {
			String first = "Jarema";
			
			imie = wejscie.nextLine();
			
			while(imie.charAt(imie.length()-1)!='a' || (imie.charAt(imie.length()-1)=='a' && imie.equals(first)))
			
			
			imie = wejscie.nextLine();
			
			
			//else if(imie.charAt(imie.length()-1)=='a')
			//tab[i] = imie;
				zapis.println(tab[i]=imie);
				
			System.out.println("Imie damskie z listy: dla i = "+i+" : "+tab[i]);		
		}
		wejscie.close();
		zapis.close();
		

		Scanner wejscie1 = new Scanner(file1);
		System.out.println("\nProsze sczytac wszystkie nazwiska z pliku i zapisac do nazwiska.txt: ");
		for( int i =0; i <=20; i++ ) {
			String wynik[] = null;
			String wynik2[] = null;
			nazwisko = wejscie1.nextLine();
			wynik = nazwisko.split(" ",3);
			wynik2 = wynik[1].split("-",2);
			
			nazwisko = wynik2[0];
			zapis1.println(nazwisko);
			
			
			System.out.println("Nazwisko dla i = "+i+" : "+nazwisko);
			
		
	}
		wejscie1.close();
	}
		
}
*/	
	
	/*
	package pl.javafirst.seventh;
	import java.io.File;
	import java.util.Scanner;
	import java.io.FileNotFoundException;
	public class TrojkatJava {
	
		public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub
			
			float a,b,c; //boki trojkata podane przez usera
			File file = new File("boki.txt");
			Scanner wejscie = new Scanner(file);
			System.out.println("Prosze podac wartosci bokow trojkata: \n");
			a = wejscie.nextFloat();
			System.out.println("a = "+a);
			b = wejscie.nextFloat();
			System.out.println("b = "+b);
			c = wejscie.nextFloat();
			System.out.println("c = "+c);
			
			if(a+b > c && b+c > a && a+c > b)
				System.out.println("Z podanych bokow mozna utworzyc trojkat");
			else
				System.out.println("Z podanych bokow nie da sie utworzyc trojkata");
		}
	}
	*/