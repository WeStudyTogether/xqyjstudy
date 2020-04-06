package ooweek4;

//IntegerUtilityParseIntTest3.java
//Tests the parseInt method
//of class IntegerUtility.

public class IntegerUtilityParseIntTest3  {

public static void main(String[] args)
{
   String text;
   if (args.length == 0)
      text = "";
   else
      text = args[0];

   int number = IntegerUtility.parseInt(text);
   System.out.println("Äã¼üÈëÁË£º" + number + ".");
}  // method main
}  // class IntegerUtilityParseIntTest3