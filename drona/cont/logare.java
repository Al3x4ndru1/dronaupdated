package drona.cont;

import java.util.Scanner;

public class logare {
	logare()
{
	main();
}
	public static void main()
	{	Scanner scanner = new Scanner(System.in);
		try{
		
		System.out.print("Intrpduce your username: ");
		String user= scanner.next();

		System.out.print("Introduce your password: ");
		String password = scanner.next();
		
		scanner.close();
		}
		catch(Exception e)
		{

		}
	}
	
}
