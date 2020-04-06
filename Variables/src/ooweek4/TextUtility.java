package ooweek4;

//TextUtility.java

/**
* Contains some static methods useful
* for dealing with characters and Strings.
*
*/
public class TextUtility  {

	/**
	 * Tests whether a character is in the ASCII range.
	 *
	 * @param x the character to be tested
	 * @return true if the character's Unicode value is in the ASCII range (0 to 127),   
*        false otherwise
	 */
	public static boolean isAscii(char x)
	{
		return(x < 128);
	}  // method isAscii

	/**
	 * Tests whether a character is an ASCII digit.
	 *
	 * @param x the character to be tested
	 * @return true if x is an ASCII digit ('0' to '9'),
	 *         false otherwise
	 */
	public static boolean isAsciiDigit(char x)
	{
		return( (x >= '0' && x <= '9'));
	}  // metnod isAsciiDigit

	/**
	 * Tests whether a character is an ASCII letter.
	 *
	 * @param x the character to be tested
	 * @return true if x is an ASCII letter
	 *            ('A' to 'Z' or 'a' to 'z'),
	 *         false otherwise
	 */
	public static boolean isAsciiLetter(char x)
	{
		return( (x >= 'A' && x <= 'Z') ||
				(x >= 'a' && x <= 'z'));
	}  // metnod isAsciiLetter

	/**
	 * Tests whether a character is a space.
	 *
	 * @param x the character to be tested
	 * @return true if x is a space (' '),
	 *         false otherwise
	 */
	public static boolean isSpace(char x)
	{
		return ( x == ' ' );
	}  // method isSpace

	/**
	 * Tests whether a character is an
	 * ASCII control character.
	 *
	 * @param x the character to be tested
	 * @return true if x is an ASCII control
	 *            character(0 to 31, or 127),
	 *         false otherwise
	 */
	public static boolean isAsciiControl(char x)
	{
		return( x < 32 || x == 127 );
	}  // method isAsciiControl

	/**
	 * Tests whether a String contains
	 * ASCII control characters.
	 *
	 * @param s the String to be tested
	 * @return true if s contains one or more
	 *            ASCII control characters,
	 *         false otherwise.
	 */
	public static boolean containsAsciiControl(String s)
	{
		boolean controlFound = false;
		for ( int i = 0; i < s.length() && !controlFound; i++ )
			if ( isAsciiControl(s.charAt(i)) )
				controlFound = true;
		return controlFound;
	}  // method containsAsciiControl

	/**
	 * Rightjustify String
	 *
	 * @param s the String to be modify.
	 * @param columnWidth an int express the column width 
	 * @return  a new string of column width.                   
	 */ 
	public static String rightJustify(String s, int columnWidth)
	{
		while ( s.length() < columnWidth )
			s = " " + s; 
		return s;
	}  // method rightJustify

	/**
	 * A method to print a column of numbers aligned 
	 * at the decimal point.
	 *
	 * @param numberText a string t be convert
	 * @param wholeNumberWidth the total number
	 * of characters to the left of the period 
	 * @return a new string aligned at the decimal point
	 */
	public static String align(String numberText, int wholeNumberWidth)
	{
		String leftPart = "";  // the left of decimal point
		String rightPart = ""; // the right of decimal point
		int index = numberText.indexOf(".");
		if (index == -1)
			leftPart = numberText;
		else {
			leftPart = numberText.substring(0, index);      
			rightPart = numberText.substring(index);
		}  // else

			leftPart = TextUtility.rightJustify(leftPart, wholeNumberWidth);   
			String align = leftPart + rightPart;
			return align;  
	}  // method align( String, int)
}  // class TextUtility