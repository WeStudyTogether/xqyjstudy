package ooweek4;

//IntegerUtilityParseIntTest2.java
public class IntegerUtilityParseIntTest2  {
public static void main(String[] args)
{
    System.out.println("���µ���������int:");
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
    System.out.println("���µĲ���������int:");
    String s = "x";
    String empty = s.substring(1);
    test(empty);  // ��String������"" ʶ��

    System.out.println("�㲻Ӧ�������˾�.");
    System.out.println("���parseInt�����Ѿ�ʹ�����˳���.");
}  // method main

public static void test(String s)
{
   System.out.println("\"" + s + "\"    " + 
                      IntegerUtility.parseInt(s));
}  // method test
}  // class IntegerUtilityParseIntTest2