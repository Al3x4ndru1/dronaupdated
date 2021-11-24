package drona.checks;

import java.util.Random;

public class baterie {
	public baterie(){
		main();
	}
	
	public static void main(){
		int batlvl= Random();
		int road=  Random();
		try{
		if(batlvl<20)
		{
			throw new Exception("retun to charging too less batery");
		}
		else{
			if(batlvl<30)
			{
				if(road >10)
			{
				throw new Exception("The distance is too much for this drone we will find an othe onev");
			}
			}else{
System.out.println("The drone will be at you in a few minutes");
			}
		}
	}
	catch(Exception e){
		System.out.println(e);
	}
		
	}
	public static int Random()
	{Random x= new Random();
		return x.nextInt(100);
	}
}