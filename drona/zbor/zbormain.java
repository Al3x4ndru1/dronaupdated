
package drona.zbor;

import java.util.Scanner;

public class zbormain {
	public zbormain(){
		main();
	}
	public static void main()
	{Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();

		switch(x){
		case 1: 	new inaltime(); 		break;
		case 2:		new mapViewerworld();   break;
		}
		sc.close();
	}
}