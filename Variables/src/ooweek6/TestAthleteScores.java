package ooweek6;

import java.io.PrintWriter;

public class TestAthleteScores {
	/* Standard output stream */
	private static PrintWriter  stdOut = new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr = new  PrintWriter(System.err, true);

	/**
	 * Test driver for class <code>AthleteScores</code>.
	 *
	 * @param args  not used.
	 */
	public static void  main(String[] args)  {
                          AthleteScores athleteOne = new AthleteScores("HELLO" , 30 , 54 , 60);
		assertTrue("1: testing method getName()" , athleteOne.getName() == "HELLO");
		assertTrue("2: testing method getScoreOne()" , athleteOne.getScoreOne() == 30);
		assertTrue("3: testing method getScoreTwo()" , athleteOne.getScoreTwo() == 54);
		assertTrue("4: testing method getScoreThree()" , athleteOne.getScoreThree() ==60);
		athleteOne.setScoreOne(30);
		athleteOne.setScoreTwo(35);
		athleteOne.setScoreThree(31);
		assertTrue("5: testing method setScoreOne()" , athleteOne.getScoreOne() == 30);
		assertTrue("6: testing method setScoreTwo()" , athleteOne.getScoreTwo() == 35);
		assertTrue("7: testing method setScoreThree()" , athleteOne.getScoreThree() == 31);
		AthleteScores athleteTwo = new AthleteScores("bye" , 30 ,35 , 31);
		assertTrue("8: testing method getMinimum" , athleteTwo.getMinimum() == 30 && athleteTwo.getScoreOne() == 30);
		athleteTwo = new AthleteScores("bye" , 30 , 35 , 31);
		assertTrue("9: testing method getMinimum" , athleteTwo.getMinimum() == 30 && athleteTwo.getScoreTwo() == 30);
		athleteTwo = new AthleteScores("bye" , 30 , 35 , 31);
		assertTrue("10: testing method getMinimum" , athleteTwo.getMinimum() == 30 && athleteTwo.getScoreThree() == 30);
		AthleteScores athleteThree = new AthleteScores("HEELO" , 30 , 54 , 60);
		assertTrue("11: testing method equals()" , athleteThree.equals(athleteOne));
		assertTrue("12: testing method equals()" , athleteTwo.equals(athleteOne));
		TestAthleteScores athleteFour = new TestAthleteScores();
		assertTrue("13: testing method equals()" , athleteFour.equals(athleteOne));
		String out1 = athleteOne.getName() + "," + athleteOne.getScoreOne() + "," + athleteOne.getScoreTwo()+ "," + athleteOne.getScoreThree();
		String out2 = athleteOne.toString();
		assertTrue("14: testing method equals()" , out1.equals(out2));
		stdOut.println("ok"); 

		
	}

	/**
	 * Displays a message in the standard error stream if the value specified
	 * by parameter <code>condition<code> is <code>false</code>.
	 *
	 * @param message  the error message.
	 * @param condition  the test condition.
	 */
	public static void assertTrue(String message, boolean condition) {

		if (! condition) {
			stdErr.print("** Test failure ");
			stdErr.println(message);
		}
	}
}
