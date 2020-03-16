package oo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestNaturalNumber  {
	   public static void main(String[] args)
	   {
	      System.out.println("Testing first with no command-line arguments.");
	      System.out.print("This test program should NOT quit, ");
	      System.out.println("but should just pause instead.");
	      System.out.println();
	      NaturalNumber.main(new String[] {} );
	      pause();

	      System.out.println("The following ARE natural numbers:");
	      System.out.println();
	      test1("0");
	      test1("9");
	      test1("2147483647");
	      test1("2147483648");
	      test2("000000000000000000002147483647");
	      test2("123456789012345678901234567890");
	      test1("9");
	      pause();

	      System.out.println("The following are NOT natural numbers:");
	      System.out.println();
	      test1("0-");
	      test1("-");
	      test1("-1");
	      test1("-9");
	      test1("2a");
	      test1("a2");
	      test1(":");
	      test1("/");
	      System.out.println();
	      System.out.println("Testing empty String literal:");
	      test1("");
	      System.out.println();
	      System.out.println("Testing another empty String:");
	      test1(new String(""));
	   }  // method main

	   public static void test1(String s)
	   {
	      System.out.print("\"" + s + "\" --> ");
	      NaturalNumber.main(new String[] {s} );
	   }  // method test1

	   public static void test2(String s)
	   {
	      System.out.println("\"" + s + "\" --> ");
	      System.out.print("    ");
	      NaturalNumber.main(new String[] {s} );
	   }  // method test2

	   public static void pause()
	   {
	      System.out.println();
	      System.out.print("Press ENTER to continue....");
	      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	      try {
			stdin.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	      System.out.println();
	      
	   }  // method pause

	}  // class TestNaturalNumber