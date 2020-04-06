package ooweek4;

public class IsIntRangeTextTest  {
	   public static void main(String[] args) {
	       test("0", true);
	       test("-0", true);
	       test("-1", true);
	       test("9", true);
	       test("-9", true);
	       test("2147483647", true);
	       test("-2147483648", true);
	       test("000000000000000000002147483647", true);
	       test("-000000000000000000002147483648", true);

	       CommandLineInput.pause();

	       test("2147483648", false);
	       test("-2147483649", false);
	       test("-2147483650", false);
	       test("-2147500000", false);   
	       test("123456789012345678901234567890", false);   

	       CommandLineInput.pause();

	       test("", false);  // empty String literal ""
	       String empty = ("x").substring(1);
	       test(empty, false);  // ��String������"" ʶ��

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
	       if ( IntegerUtility.isIntRangeText(s) )
	          System.out.print("����");
	       else
	          System.out.print("������");
	       System.out.print(" һ������ֵ ");
	       if ( b )
	          System.out.println("Ӧ��.");
	       else
	          System.out.println("��Ӧ��.");
	   }  // method test
	}  // class IsIntRangeTextTest