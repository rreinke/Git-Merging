import java.sql.Date;


public class HelloWorld {
	
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	public static long calcDaysOff(long today, long endOfBreak) {
		return (endOfBreak - today);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fallBreak = "Why do we have homework?!";
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		System.out.println(fallBreak);
		
		FallBreak fallBreak2 = new FallBreak();
		System.out.println(fallBreak2.toString());
		
		WinterBreak winterBreak = new WinterBreak();
		System.out.println(winterBreak.toString());

		System.out.println(calcDaysOff(20121013, 20121017));
	}

}
