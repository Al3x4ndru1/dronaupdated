
package drona.zbor;

import java.util.Scanner;


public class inaltime {

	inaltime()
	{
		main();
	}

	public static void main()
	{
		Scanner sc = new Scanner(System.in);

		String s=sc.nextLine();

		
		switch(s)
		{
			case "oras mic":  System.out.println("inaltimea trebuie sa fie de 100 de metrii"); break;
			case "oras mare": System.out.println("inaltimea trebuie sa fie de 150 de metrii"); break;
			case "in afara orasului": System.out.println("inaltimea trebuie sa fie de 50 de metrii"); break;
		}
	

	}
}