package Triangle1Java;


import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Triangle1Java {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		float a,b,c; //boki trojkata podane przez usera
		double pole;
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Prosze podac wartosci bokow trojkata: \n");
		System.out.println("a = ");
		a = odczyt.nextFloat();
		System.out.println("b = ");
		b = odczyt.nextFloat();
		System.out.println("c = ");
		c = odczyt.nextFloat();
		System.out.println("Dlugosc bokow podana przez uzytkownika:\n");
		System.out.println("a = "+a+"\n");
		System.out.println("b = "+b+"\n");
		System.out.println("c = "+c+"\n");
		
		float najmniejszy;
		float sredni;
		float najwiekszy;
		
		
		if(a > 0 && b > 0 && c > 0)
		{
		
		if(a+b > c && b+c > a && a+c > b)
		{
			System.out.println("Z podanych bokow mozna utworzyc trojkat");
			
		if ((a > b && a > c) || ((a > b && a > c) && (b == c))) 
		{
			
			najwiekszy = a;
			
			if(b>=c)
			{
				sredni = b;
			    najmniejszy = c;
			}
			else
			{
				sredni = c;
			    najmniejszy = b;
			}
			
			System.out.println("Dlugosci bokow od najmniejszego do najwiekszego:\n");
			System.out.println("Najmniejszy: "+najmniejszy+"\n");
			System.out.println("sredni: "+sredni+"\n");
			System.out.println("Najwiekszy: "+najwiekszy+"\n");
			
			if (najmniejszy*najmniejszy + sredni*sredni < najwiekszy*najwiekszy) //sprawdzanie rozwartokatnosci

	              System.out.println("to jest trojkat rozwartokatny\n");
	        
	          else
	              System.out.println("to nie jest trojkat rozwartokatny\n");
			
			
		}
			
				
	    
		if ((b > c && b > a) ||  ((b > a && b > c) && (a == c)))
		{
			
	    	najwiekszy = b;
		
		    if(a>=c)
		    {
			   sredni = a;
		       najmniejszy = c;
		    }
		    else
		    {
			    sredni = c;
		        najmniejszy = a;
		    }
		    
		    System.out.println("Dlugosci bokow od najmniejszego do najwiekszego:\n");
			System.out.println("Najmniejszy: "+najmniejszy+"\n");
			System.out.println("sredni: "+sredni+"\n");
			System.out.println("Najwiekszy: "+najwiekszy+"\n");
		    
		    if (najmniejszy*najmniejszy + sredni*sredni < najwiekszy*najwiekszy) //sprawdzanie rozwartokatnosci

	              System.out.println("to jest trojkat rozwartokatny\n");
	        
	          else
	              System.out.println("to nie jest trojkat rozwartokatny\n");
		    
		    
		}
		    
		    
		if ((c > a && c > b) || ((c > a && c > b) && (a == b)))
		{
		    	najwiekszy = c;
			
			    if(a>=b)
			    {
				   sredni = a;
			       najmniejszy = b;
			    }
			    else
			    {
				    sredni = b;
			        najmniejszy = a;
			    }
			   
			    System.out.println("Dlugosci bokow od najmniejszego do najwiekszego:\n");
				System.out.println("Najmniejszy: "+najmniejszy+"\n");
				System.out.println("sredni: "+sredni+"\n");
				System.out.println("Najwiekszy: "+najwiekszy+"\n");
			    
			    if (najmniejszy*najmniejszy + sredni*sredni < najwiekszy*najwiekszy) //sprawdzanie rozwartokatnosci

		              System.out.println("to jest trojkat rozwartokatny\n");
		        
		          else
		              System.out.println("to nie jest trojkat rozwartokatny\n");
			    
			   
		}
		
		if ((a < b) && (b == c))
		{
			
			najwiekszy = b;
			
			if(b>=c)
			{
				sredni = b;
			    najmniejszy = a;
			}
			else
			{
				sredni = c;
			    najmniejszy = a;
			}
			
			System.out.println("Dlugosci bokow od najmniejszego do najwiekszego:\n");
			System.out.println("Najmniejszy: "+najmniejszy+"\n");
			System.out.println("sredni: "+sredni+"\n");
			System.out.println("Najwiekszy: "+najwiekszy+"\n");
			
			if (najmniejszy*najmniejszy + sredni*sredni < najwiekszy*najwiekszy) //sprawdzanie rozwartokatnosci

	              System.out.println("to jest trojkat rozwartokatny\n");
	        
	          else
	              System.out.println("to nie jest trojkat rozwartokatny\n");
			
			
		}
		
		if (a == b && b == c)
		{
		    	najwiekszy = a;
			    sredni = a;
			    najmniejszy = a;
			    
			    System.out.println("Dlugosci bokow od najmniejszego do najwiekszego:\n");
				System.out.println("Dlugosci wszystkich bokow sa rowne i wynosza: "+najmniejszy+"\n");

			    
			    if (najmniejszy*najmniejszy + sredni*sredni < najwiekszy*najwiekszy) //sprawdzanie rozwartokatnosci

		              System.out.println("to jest trojkat rozwartokatny\n");
		        
		          else
		              System.out.println("to nie jest trojkat rozwartokatny\n");
			    
		}
			
		
		  if (a*a + b*b == c*c)

              System.out.println("to jest trojkat prostokatny\n");
        
          else
              System.out.println("to nie jest trojkat prostokatny\n");
              
			
		
		pole = ((double)Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c))/4);
		
		System.out.println("Pole trojkata ="+pole);
		
		
		  
              
		
		}
		
		else
		System.out.println("Z podanych bokow nie da sie utworzyc trojkata");
		}
		else 
			System.out.println("Podales bledne dane. Bok musi miec dlugosc dodatnia");
		
	}
	}
