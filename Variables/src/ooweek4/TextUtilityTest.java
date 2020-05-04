package ooweek4;

public class TextUtilityTest {
    public static void main(String[] args) {
    	testTextUtility("Hellp,everyone");
    	testTextUtility("************\b\b\b\b\b\b\b\b\b 1234");
    	testTextUtility("Beep!\u0007");
    	testTextUtility("\u00A0\u00A1\u00A2");
    }
    
    public static void testTextUtility(String s) {
    	System.out.print("\nIn the String: " + s + "\nthere are:");
    	
    	int asciiDigitCount = 0;
    	int asciiLetterCount = 0;
    	int spaceCount = 0;
    	int asciiControlCount =0;
    	int nonAsciiCount = 0;
    	int asciiPunctuationCount = 0;
    	
    	for(int i = 0; i < s.length(); i++) {
    		if (TextUtility.isAsciiDigit(s.charAt(i)))
    			asciiDigitCount++;
    		else if(TextUtility.isAsciiLetter(s.charAt(i)))
    			asciiLetterCount++;
    		else if (TextUtility.isSpace(s.charAt(i)))
    			spaceCount++;
    		else if (TextUtility.isAsciiControl(s.charAt(i)))
    			asciiControlCount++;
    		else  if(! TextUtility.isAscii(s.charAt(i)))
    			nonAsciiCount++;
    		else
    			asciiPunctuationCount++;
    	}
    	
    	System.out.println(asciiDigitCount + "ASCII digits" +
    	asciiLetterCount + "ASCII letters," + 
    			spaceCount + "space,\n" +
    	        asciiPunctuationCount + 
    	        "ASCII punctuation marks," +
    	        "ascii control characters, and\n" +
    	        nonAsciiCount + "non-ASCII character.");
    	
    	if(TextUtility.containsAsciiControl(s))
    		System.out.println("It does contain control characters.");
    	else
    		System.out.println("It does not contain control characters.");
    }
}
