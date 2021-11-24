package drona.leduri;
//Chapter 9 pag 224-235


import java.util.Random;

public class ledurimain {
	public static boolean inceput=true;
	public static boolean schimbare()
	{
		return inceput = false;
	}
	public ledurimain() throws InterruptedException 
	{
		main();
	}
	public static int pericol()
	{int iminent=zona();
		if(iminent%2==0)
		{
		return 1;
		}
		else{
			return 0;
		}
	}
	public static int zona(){	Random random = new Random();

		return random.nextInt(100);
	}
	public static void main() throws InterruptedException 
	{int pericol;
		if(inceput==true)
		{
			schimbare();
		new start();
		}
	
		int danger;
		pericol=pericol();
		if(pericol ==1)
		{
			danger=zona();
			if (danger % 2 == 0) {
				pericol = 3;
			}

		}

/*		Scanner scanner = new Scanner(System.in);
pericol=scanner.nextInt();
*/	
switch(pericol)
		{
			case 0:	new led(); break;
			
			case 1: new pericolled(); break;

			case 3: new ledmiscare(); break;

		}
	}
}