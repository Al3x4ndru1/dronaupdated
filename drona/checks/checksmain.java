package drona.checks;

import java.util.Scanner;

public class checksmain {
	public checksmain(){
		main();
	}

	public static void main(){
		Scanner scann= new Scanner(System.in);
		int x= scann.nextInt();
		scann.close();
		switch(x){

		
		case 1: new baterie(); break;
		case 2:	new mancare(); break;
		}
	}
	
}