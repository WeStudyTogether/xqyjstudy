package oo;

import  java.io.*;
import  java.util.*;
import  java.lang.*;

public class ICarnegieInfoApplication  {

	private static BufferedReader  stdIn =
		new  BufferedReader(new  InputStreamReader(System.in));
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	public static void main(String[]  args) throws IOException  {

		ICarnegieInfo companyInfo = ICarnegieInfo.getInstance();

		int  choice = getChoice();

		while (choice != 0)  {

			if (choice == 1)  {
				stdOut.println(companyInfo.getName());
			} else if (choice == 2)  {
				stdOut.println(companyInfo.getAddress());
			} else if (choice == 3)  {
				stdOut.println(companyInfo.getTelephone());
			} else if (choice == 4)  {
				stdOut.println(companyInfo.getEmail());
			} else if (choice == 5)  {
				stdOut.println(companyInfo.getUrl());
			}

			choice = getChoice();
		}
	}

	private static int  getChoice() throws IOException  {

		/* PLACE YOUR CODE HERE */

		return 0;  /* CHANGE THIS STATEMENT AS NEEDED */
	}
}