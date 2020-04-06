package ooweek4;

//IntegerUtilityParseIntTest2.java
public class IntegerUtilityParseIntTest2  {
public static void main(String[] args)
{
    System.out.println("以下的属于类型int:");
    test("0");
    test("-0");
    test("-1");
    test("9");
    test("-9");
    test("2147483647");
    test("-2147483648");
    test("000000000000000000002147483647");
    test("-000000000000000000002147483648");

    System.out.println();
    System.out.println("以下的不属于类型int:");
    String s = "x";
    String empty = s.substring(1);
    test(empty);  // 空String对象以"" 识别

    System.out.println("你不应当读到此句.");
    System.out.println("你的parseInt方法已经使程序退出了.");
}  // method main

public static void test(String s)
{
   System.out.println("\"" + s + "\"    " + 
                      IntegerUtility.parseInt(s));
}  // method test
}  // class IntegerUtilityParseIntTest2