package ooweek4;
import java.io.*;
//IntegerUtilityParseIntTest1.java
//����IntegerUtility���parseInt����.
public class IntegerUtilityParseIntTest1  {
public static void main(String[] args) throws IOException
{
   System.out.print("����һ������: ");
   String text = CommandLineInput.readLine();
   System.out.println();
   int number = IntegerUtility.parseInt(text);
   System.out.println("�������: " + number + ".");
}  // method main
}  // class IntegerUtilityParseIntTest1class IntegerUtilityParseIntTest1