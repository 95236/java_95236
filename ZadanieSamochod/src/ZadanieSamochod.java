
// Zaproponuj implementacje klasy abstrakcyjnej Samochod oraz klasy dziedziczacej ja: Mercedes.
// Stworz pola, metody, metody abstrakcyjne itp.
// Zaprezentuj działanie klasy w ZadanieCar.


public class ZadanieCar {
	
	public static void main(String[] args) {
		
		abstract class Samochod{
			String marka;
			int color;
			
			public void hamuje() {
				//deklaracja metody
			}
			abstract public void trabi(); //deklaracja metody abstrakcyjnej
			
			}
		
		class Mercedes extends Samochod {
			  public void trabi() {
			    //implementacja metody
			  }
			}
			
		}
		
	}