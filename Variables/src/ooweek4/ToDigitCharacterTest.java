package ooweek4;

public class ToDigitCharacterTest  {
	   public static void main(String[] args)
	   {
	      for ( int i = -2; i < 11; i++ )
	         test(i);
	   }  // method main

	   public static void test(int i)
	   {
	       System.out.println(i + "   " + 
	                new Character(IntegerUtility.toDigitCharacter(i)).toString());
	   }  // method test
	}  // class ToDigitCharacterTest
