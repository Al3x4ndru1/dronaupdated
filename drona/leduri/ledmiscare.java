package drona.leduri;

public class ledmiscare {
	ledmiscare() throws InterruptedException{
		main();
	}

	public static final String ANSI_Yello_BACKGROUND = "\033[43m";
	public static final String ANSI_Green_BACKGROUNG = "\033[42m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void main() throws InterruptedException
	{
		boolean led = true;
		// Now add the particular background color
		while (led) {
			System.out.println(ANSI_Yello_BACKGROUND + " " + ANSI_RESET);
			Thread.sleep(650);

			System.out.println(ANSI_Green_BACKGROUNG + " " + ANSI_RESET);
			Thread.sleep(650);

			new ledurimain();
		}
	}
	
}
