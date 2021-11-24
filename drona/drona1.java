package drona;
import drona.checks.checksmain;
import drona.comanda.comandamain;
import drona.cont.contmain;
import drona.leduri.ledurimain;
import drona.zbor.zbormain;

import java.util.Scanner;

public class drona1 {
	
	public static void main(String[] args) throws InterruptedException
	{
		Scanner scanner = new Scanner(System.in);
		int i=scanner.nextInt();
		
		
		switch(i)	{
				case 1: new ledurimain();
				break;
		
				case 2:	new comandamain();
				break;
		
				case 3: new contmain();
				break;
		
				case 4: new zbormain();
				break;
		
				case 5: new checksmain();
				break;
		}
	}	

}