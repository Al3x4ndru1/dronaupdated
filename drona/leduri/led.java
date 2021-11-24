package drona.leduri;

public class led {
	public led() throws InterruptedException 
	{
		main();
	}
	// Declaring the background color
	public static final String ANSI_Cyan_BACKGROUND = "\033[46m";
	public static final String ANSI_WHITE_BACKGROUNG ="	\u001B[47m";
	public static final String ANSI_RESET = "\u001B[0m";

	// Main driver method
	public static void main() throws InterruptedException {
		boolean led=true;
		// Now add the particular background color
		while(led){
		System.out.println(ANSI_Cyan_BACKGROUND + " " + ANSI_RESET);
		Thread.sleep(650);
		
		System.out.println(ANSI_WHITE_BACKGROUNG + " " + ANSI_RESET);
		Thread.sleep(650);
		new ledurimain();
		}
	}
}
