package ooweek4;

import java.util.regex.Pattern;

/**
 * IntegerUtility.java
 * Contains some static methods useful for dealing with integers.
 *
 */
public class IntegerUtility  {

	/**
	 * Converts a digit character to its intended numeric value.
	 *
	 * @param x the character to be converted
	 * @return the intended numeric value of the character x, if x is a digit.
	 *         Returns -1 if x is not a digit.
	 */
	public static int toDigitValue(char x)
	{
		if ( TextUtility.isAsciiDigit(x) )
			return ( x - '0' );
		else
			return  -1;
	}  // method toDigitValue

	/**
	 * An incomplete attempt to imitate the parseInt method of the Integer wrapper class.
	 * Converts a String to an integer, if the String consists solely of digit characters.
	 *
	 * @param s the String to be converted
	 * @return the intended integer value represented by the String
	 */
	public static int parseInt(String s)
	{
		int number = 0;
		for ( int i = 0; i < s.length(); i++ )
			number = (number * 10) + toDigitValue(s.charAt(i));
		return number;
	}  // method parseInt

	/**
	 * Test whether a String s is a natural number.
	 *
	 * @param s the String to be tested
	 * @return true if s is a nutural number, false otherwise.
	 */

	 // method isNaturalNumber 

	/**
	 * Test whether a String s is an integer.
	 *
	 * @param s the String to be tested
	 * @return true if s is an integer,false otherwise.
	 */
	public static boolean isIntegerText(String s)
	{  
		if (s.length() == 0) 
			return false;
		
		int i =0;
		if (s.charAt(0) == '-'&& s.length() > 1)
			i++;
		
		for(; i < s.length(); i++)
			if(!Character.isDigit(s.charAt(i)))
				return false;
		
		return true;
		
	}  // method isIntegerText 

	/**
	 * Test whether a String s represents an integer in Int range.
	 *
	 * @param s the String to be tested
	 * @return true if s is an integer in Tnt range, false otherwise.
	 */
	public static boolean isIntRangeText(String s)
	{  
		try {
			long number = Long.parseLong(s);
			if(number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
				return false;
			}
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}  // method isIntRangeText 

	/**
	 * Converts a numeric value
	 * to its intended digit character.
	 *
	 * @param x the numeric value to be converted
	 * @return the intended digit character of the numeric value x, if x is a digit character.
	 *         Returns * if x is not a digit character.
	 */
	public static char toDigitCharacter(int x)
	{
		if (x < 0 || x > 9) 
		return  '*';  
		else {	
			return  (char) (x+48);	
		}
	}  // method toDigitCharacter
	
	public static boolean isNaturalNumberText(String s) {
		return Pattern.matches("[0-9]+", s);

	}
}  // class IntegerUtility
