package drona.leduri;

public class pericolled {
	public pericolled() throws InterruptedException
	{
		main();
	}

	public static final String ANSI_RED_BACKGROUND = "\033[41m";
	public static final String ANSI_BLUE_BACKGROUNG = "\033[44m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void main() throws InterruptedException
	{
		boolean led = true;
		// Now add the particular background color
		while (led) {
			System.out.println(ANSI_RED_BACKGROUND + " " + ANSI_RESET);
			Thread.sleep(650);

			System.out.println(ANSI_BLUE_BACKGROUNG + " " + ANSI_RESET);
			Thread.sleep(650);

			new ledurimain();
		}
	}
	
}
