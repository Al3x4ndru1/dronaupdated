package drona.checks;

import java.util.Random;

public class mancare {
	public static boolean stockmancare=true;


	public mancare(){
		if(stockmancare==true)
		{
			checker();
		}
		else{
		main();
		}
	}
	
	public static int Random() {
		Random x = new Random();
		return x.nextInt(100);
	}
private void checker() {
	int rand= Random();
	if(rand%2!=0)
	{
		stockmancare=false;
		System.out.println("Nu mai e mancare");
	} 
	else{
		stockmancare=true;
		System.out.println("S-a reumplut");
	}

	}

	public static void main(){

		stockmancare = true;
		System.out.println("S-a reumplut");
	}
}