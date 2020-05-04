package ooweek4;

import java.io.*;

import oo.NaturalNumber;
public class TestNaturalNumberEmpty  {
   public static void main(String[] args)
   {
      System.out.println("Testing first with no command-line arguments.");
      System.out.print("This test program should NOT quit, ");
      System.out.println("but should just pause instead.");
      System.out.println();
      NaturalNumber.main(new String[] {} );
      pause();

      System.out.println("Testing NaturalNumber.java with empty Strings.");
      System.out.println();
      System.out.println("Testing empty String literal:");
      NaturalNumber.main( new String[] { "" } );
      System.out.println();
      System.out.println("Testing another empty String:");
      NaturalNumber.main( new String[] { new String("") } );
   }  // method main

   public static void pause()
   {
      System.out.println();
      System.out.print("Press ENTER to continue....");
      try {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        stdin.readLine();
} catch (Exception e ) {
   System.out.println("pause error!");
}
      System.out.println();
   }  // method pause
}  // class TestNaturalNumberEmpty