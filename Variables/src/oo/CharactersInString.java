package oo;

public class CharactersInString  {
	   public static void main(String[] args)
	   {
	      if ( args.length == 0 || args[0].length() > 15 )
	      {
	         System.out.println("This program displays Unicode values "
	                            + "of characters in a single");
	         System.out.println("command-line argument no more than "
	                            + "15 characters long.");
	         System.exit(0);
	      }  // if user error

	      System.out.println();
	      System.out.println("Position   Character   Unicode");
	      System.out.println("--------   ---------   -------");
	      System.out.println();

	      String text = args[0];

	      for ( int i = 0; i < text.length(); i++ )  {

	         // Display character's position in String text:
	         String positionText = Integer.toString(i);
	         for ( int j = positionText.length(); j < 2; j++ )
	             positionText = " " + positionText;
	         System.out.print("   " + positionText);

	         // Display the character itself:
	         char x = text.charAt(i);
	         System.out.print("          " + x + "        ");

	         // Display the character's Unicode value
	         String valueText = Integer.toString(x);
	         for ( int j = valueText.length(); j < 4; j++ )
	             valueText = " " + valueText;
	         System.out.println(valueText);
	      }  // for i
	   }  // method main
	}  // class CharactersInString