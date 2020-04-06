package ooweek4;
import java.io.*;
//IntegerUtilityParseIntTest1.java
//测试IntegerUtility类的parseInt方法.
public class IntegerUtilityParseIntTest1  {
public static void main(String[] args) throws IOException
{
   System.out.print("键入一个整数: ");
   String text = CommandLineInput.readLine();
   System.out.println();
   int number = IntegerUtility.parseInt(text);
   System.out.println("你键入了: " + number + ".");
}  // method main
}  // class IntegerUtilityParseIntTest1class IntegerUtilityParseIntTest1