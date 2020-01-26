import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad2Java {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
	    String[] sheduleMinute;
	    String[] sheduleHour;
	    String[] sheduleDayOfMonth;
		String[] sheduleDayOfWeek;


		PrintWriter zapis = new PrintWriter("cron.txt");
		
		
		zapis.println("10|2-5,8|*|11");
		zapis.println("*|1,3,7,10-23|6,7,8|1");
		zapis.println("50|*|23,26|*");
		
		zapis.close();
		
		File file = new File("cron.txt");
		Scanner wejscie = new Scanner(file);
		
		String dane[] = new String[3] ; //dane przechowywane w pliku cron.txt
		
		int i = 0;
		while(wejscie.hasNextLine())
		{
			dane[i]=wejscie.nextLine();
			System.out.println("Dane przechowywane w pliku cron.txt: "+dane[i]);
			i++;
			String dane_do_podzielenia[];
			dane_do_podzielenia=dane[0].split("\\|",4);
			
			String minuty;
			String godziny;
			String dni_w_miesiacu;
			String dni_w_tygodniu;
			
			minuty = dane_do_podzielenia[0];
			godziny = dane_do_podzielenia[1];
			dni_w_miesiacu = dane_do_podzielenia[2];
			dni_w_tygodniu = dane_do_podzielenia[3];
			
			
			
			
			System.out.println("Minuty: "+minuty+" Godziny: "+godziny+" dni w miesiacu: "+dni_w_miesiacu+" Dni w tygodniu: "+dni_w_tygodniu);
			
		}
		wejscie.close();
		
		
		
		

		
		
}
}