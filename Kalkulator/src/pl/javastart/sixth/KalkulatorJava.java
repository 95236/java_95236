package pl.javastart.sixth;
import java.util.Scanner;
public class KalkulatorJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner odczyt = new Scanner(System.in);
   float x,y; //liczby podane przez usera
   float wynik; //wynik wybranej operacji
   System.out.println("Podaj wartosc dwoch liczb:\n");
   System.out.println("Wartosc pierwszej liczby: ");
   x = odczyt.nextFloat();
   System.out.println("Wartosc drugiej liczby:");
   y = odczyt.nextFloat();
   
   System.out.println("Prosze wybrac operacje:\n");
   System.out.println("1 - dodawanie\n\n2 - odejmowanie\n\n3 - mnozenie\n\n4 - dzielenie\n\n5 - potegowanie");
   
   int wybor; //wybor uzytkownika
   wybor = odczyt.nextInt();
   
   switch(wybor)
   {
	   case 1:
		   wynik = x+y;
		   System.out.println("Suma tych liczb wynosi: "+wynik);
		   break;
		   
	   case 2:
		   wynik = x-y;
		   System.out.println("Roznica tych liczb wynosi: "+wynik);
		   break;
		   
	   case 3:
		   wynik = x*y;
		   System.out.println("Liczby te pomnozone przez siebie daja wynik: "+wynik);
		   break;
		   
	   case 4:
		   if(y == 0)
			   System.out.println("Bledne dane. Przez zero sie nie dzieli!");
		   else
		   {
			   wynik = x/y;
			   System.out.println("Wynik dzielenia : "+wynik);
			   break;
		   }
		   
	   case 5:
	      wynik = (int) Math.pow(x,y);
	      System.out.println(""+x+" do potegi"+y+" wynosi "+wynik );
	      break;
 		   }
			   
   }

	
	}

