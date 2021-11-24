
package drona.cont;

import drona.cont.eroricont.*;

import java.util.Scanner;

class 	crearecont{




	crearecont()
	{
		main();
	}
	
	public void main(){
		
		Scanner scanner = new Scanner(System.in);	
		Scanner sc =new Scanner(System.in);	
		System.out.print("Introduce your Username: ");
		String username= scanner.next();
		try
		{
		System.out.print("Intoduce your password: ");
		String password= scanner.next();
		System.out.print("Reintroduce your password: ");
		String password1= sc.next();
		if(password==password1)
		{
			throw new MatchPasswordException("The password does not match");
		}
	
		
		
		boolean mare=false;
		boolean mica=false;
		boolean cifre=false;
		boolean caracter=false;

		char[] a = new char[password.length()];
		int counter=0;

		for(int i=0;i<password.length();i++)
		{
			counter++;
			a[i]=password.charAt(i);
			if(a[i] >= 'A' && a[i]<='Z')
			{
				mare=true;
			}

			if(a[i]>='a' && a[i]<='z')
			{
				mica=true;
			}

			if (a[i] >= '0' && a[i] <= '9') {
				cifre = true;
			}

			if (a[i] >= 33 && a[i] <=47 ) {
				caracter = true;
			}
		}

		if(mare!=true)
		{
			throw new CapitalException("You must have a capital letter");
		}
		if(mica!=true)
		{
			throw new LowCaseException("You must have at least one lowcase letter");
		}
		if(cifre != true){
			throw new CifraException("You must have at least one cifra");
		}

		if(caracter != true) {
			throw new SpecialCharException("You must have a special character");
		}

		if(counter <15){
			throw new NumCharException("You must have at least 15 characters");
		}
		
		System.out.println(username);
	}
		
		
			
	catch(Exception e){}

			
	}


}