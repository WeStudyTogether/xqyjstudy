package ooweek4;
import java.io.*;
public class CommandLineInput {
	private static	BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
	public static void pause()  {
		try{
			br.readLine();
		} catch (Exception e) {
			System.exit(0);
		}
	}
	public static String readLine() throws IOException{
		return br.readLine();
	}
}