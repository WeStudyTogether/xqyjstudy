package ooweek4;

public class IsIntegerTextTest  {
	   public static void main(String[] args)  {
	       test("0", true);
	       test("-0", true);
	       test("-1", true);
	       test("9", true);
	       test("-9", true);
	       test("2147483647", true);
	       test("-2147483648", true);
	       test("000000000000000000002147483647", true);
	       test("-000000000000000000002147483648", true);

	       CommandLineInput.pause();   // 返回行提示，读它并忽略掉

	       test("2147483649", true);
	       test("-2147483649", true);
	       test("-2147483650", true);
	       test("-2147500000", true);   
	       test("123456789012345678901234567890", true);   

	       CommandLineInput.pause();

	       test("", false);  // 空String ""
	       String empty = ("x").substring(1);
	       test(empty, false);  // 空String对象以"" 识别

	       test("-", false);
	       test("0-", false);
	       test("/", false);
	       test("-/", false);
	       test(":", false);
	       test("-:", false);
	       test("a2", false);
	       test("2a", false);
	   }  // method main

	   public static void test(String s, boolean b)
	   {
	       System.out.print("\"" + s + "\" ");
	       if ( IntegerUtility.isIntegerText(s) )
	          System.out.print("代表");
	       else
	          System.out.print("不代表");
	       System.out.print(" 一个整数 ");
	       if ( b )
	          System.out.println("应当.");
	       else
	          System.out.println("不应当.");
	   }  // method test
	}  // class IsIntegerTextTe