

package drona.leduri;


public class start  {
public start()throws InterruptedException{
main();
}	

public static final String ANSI_RED_BACKGROUND = "\033[41m";
public static final String ANSI_BLUE_BACKGROUNG = "\033[44m";
public static final String ANSI_Yello_BACKGROUND = "\033[43m";
public static final String ANSI_Green_BACKGROUNG = "\033[42m";
public static final String ANSI_Cyan_BACKGROUND = "\033[46m";
public static final String ANSI_WHITE_BACKGROUNG = "\u001B[47m";
public static final String ANSI_RESET = "\u001B[0m";
public static void main() throws InterruptedException
{
	
		System.out.println(ANSI_RED_BACKGROUND + " " + ANSI_RESET);
		Thread.sleep(450);

		System.out.println(ANSI_BLUE_BACKGROUNG + " " + ANSI_RESET);
		Thread.sleep(450);
		
		System.out.println(ANSI_Green_BACKGROUNG + " " + ANSI_RESET);
		Thread.sleep(450);
		
		System.out.println(ANSI_Yello_BACKGROUND + " " + ANSI_RESET);
		Thread.sleep(450);

		System.out.println(ANSI_WHITE_BACKGROUNG + " " + ANSI_RESET);
		Thread.sleep(450);

		System.out.println(ANSI_Cyan_BACKGROUND + " " + ANSI_RESET);
		Thread.sleep(450);		

		System.out.println(ANSI_RED_BACKGROUND + " " + ANSI_RESET);
		Thread.sleep(450);

		System.out.println(ANSI_BLUE_BACKGROUNG + " " + ANSI_RESET);
		Thread.sleep(450);

		System.out.println(ANSI_Green_BACKGROUNG + " " + ANSI_RESET);
		Thread.sleep(450);

		System.out.println(ANSI_Yello_BACKGROUND + " " + ANSI_RESET);
		Thread.sleep(450);

		System.out.println(ANSI_WHITE_BACKGROUNG + " " + ANSI_RESET);
		Thread.sleep(450);

		System.out.println(ANSI_Cyan_BACKGROUND + " " + ANSI_RESET);
		Thread.sleep(450);
		
System.out.println('\n');
		new ledurimain();

}
}