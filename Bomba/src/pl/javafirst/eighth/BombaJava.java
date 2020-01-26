package pl.javafirst.eighth;
import java.util.Scanner;

public class BombaJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int liczba; //liczba pobierana od uzytkownika

Scanner odczyt = new Scanner (System.in);
System.out.println("Prosze podac dowolna liczbe calkowita dodatnia:");
liczba = odczyt.nextInt();
for(int i =0; i<=liczba;liczba--)
{
	System.out.println("Bomba wybuchnie za :"+liczba);
}
	}

}
