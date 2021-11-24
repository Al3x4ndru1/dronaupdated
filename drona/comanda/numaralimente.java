package drona.comanda;

import java.util.Scanner;
	import java.util.Random;

															class Alimente{
																private int numar;
																private String nume;
																private int ID;

																Alimente(int numar, int ID, String nume)
																{
																	this.numar=numar;
																	this.ID=ID;
																	this.nume=nume;
																}
																public int stocare(int n,int j, int k)
																{
																	for(int i=j;i<n-k;i++)
																		{
																			System.out.println(this.ID + " , " + this.nume + " , " + this.numar + '\t');
																			}
																		
																	return 0;
																}

																public int afisare() 
																{	

																	System.out.println(this.ID + " , " + this.nume + " , " + this.numar);
																
																	
																	return 0;
																}
																
																public int realimentarezi()
																{int x;
																	if(this.numar<100)
																	{  x=100-this.numar;
																	System.out.println("We need " + x + " for the " + this.nume);
																	return x;
																	}
																	else{
																		return 0;
																	}
																	

																}


																public int comanda(int ID)
																{
																	Random m = new Random();
																	int cate=m.nextInt(this.numar);
																	this.numar= this.numar-cate;
																return 0;
																	}

																	public void reumplere(int numar)
																	{
																		this.numar=this.numar+numar;

																	}
																	public String afnume()
																	{
																		return this.nume;
																}

															}

public class numaralimente{	
	public numaralimente()
	{
		main();
	}

	public static int Random()
	{Random x= new Random();
		return x.nextInt(100);
	}
	
	public static int RandomID(int n) {
		Random m = new Random();
		return m.nextInt(n);
	}

	public static Alimente[] arr = new Alimente[100];
	public static int n;
	public static void main(){	
		int numar;
		String nume;
	
	Scanner sc = new Scanner(System.in);
	 n=sc.nextInt();
	for(int i=0;i<n;i++)
	{System.out.print("introdu cate alimente sunt: ");
	 numar= Random();
	System.out.println(numar);
	System.out.print("introdu numele alimentului: ");
	nume=sc.next();
		arr[i]= new Alimente(numar,i,nume);
	}

	int[] reumplereautomata =new int[100];
	int day1 = 12102010;
	int day=0;
String actiune;
String[] incase= new String[1];
boolean thewhile=true;
while(thewhile==true){
	if(day1<day)
	{
		for (int i = 0; i < n; i++) {
			reumplereautomata[i]=arr[i].realimentarezi();
			System.out.println(reumplereautomata[i] + '\n');
		}
		
		day=day1;
		System.out.println("Do you want to order all?");
		String a;
		a=sc.nextLine();
		if(a=="yes")
		{
			for (int i = 0; i < n; i++) {
				int numare=reumplereautomata[i];
				System.out.println(reumplereautomata[i] + '\n');

				arr[i].reumplere(numare);
			}

		}
	}
	
	System.out.println("What do you want to do?");
	actiune = sc.next();
	switch(actiune)
	{	case "realimentarecomp" : 
									for (int i = 0; i < n; i++) {
										reumplereautomata[i] = arr[i].realimentarezi();
										System.out.println(reumplereautomata[i] + '\n');
									}
									break;


		case "adaugarenoi": 
			System.out.println("Introduceti cate produse noi doriti sa introduceti: ");
			int b = sc.nextInt();
			for (int i = n-1; i < b+n-1; i++) {
				System.out.print("introdu cate alimente sunt: ");
				numar = Random();
				System.out.println(numar);
				System.out.print("introdu numele alimentului: ");
				nume = sc.next();
				arr[i] = new Alimente(numar, i, nume);
			}
			n=n+b-1;
			break;


		case "reumplere":	int re=RandomID(n); 
							for(int i=0;i<n;i++)
								{if(re==i)
									{	nume=arr[i].afnume();
										System.out.print("numarul de alimentelor cu care o sa fie reumplut stock-ul de : " + nume + " ");
										numar= Random();
										System.out.println(numar);

										arr[i].reumplere(numar);
									}
									day = day1 + 1 * 1000000;
								}
								break;

		case "afisare":	for (int i=0;i<n;i++) {
							arr[i].afisare();
							}
							System.out.println("Do you want to continue?");

							break;

		case "scadere": 	int IDD= RandomID(n); 
							for(int i=0; i<n;i++){	
								if(IDD==i)
								{
							arr[i].comanda(i);		
								}
							}
							day = day1 + 1*1000000;
							System.out.println("Do you want to continue?");
				
							break;
		

		case "stop" : 	thewhile=false;
							break;
		}	
	}


}
}