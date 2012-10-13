import java.util.Scanner;


public class FallBreak {
	Scanner in = new Scanner(System.in);
	
	private String fallBreak;
	private int daysOff;

	public FallBreak() {
		// TODO Auto-generated constructor stub
		System.out.println("How many days of break do you have?");
		daysOff = in.nextInt();
		fallBreak = "There are " + daysOff + " days of break left!";
		
		
	}

	public String toString() {
		return fallBreak;
	}
}
