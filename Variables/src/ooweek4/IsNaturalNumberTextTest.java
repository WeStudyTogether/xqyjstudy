package ooweek4;

//IsNaturalNumberTextTest.java

public class IsNaturalNumberTextTest  {
public static void main(String[] args)
{
    test("0", true);
    test("-1", false);
    test("9", true);
    test("-9", false);
    test("2147483647", true);
    test("-2147483648", false);
    test("000000000000000000002147483647", true);
    test("-000000000000000000002147483648", false);

    CommandLineInput.pause();  // ��ʾENTER����ȡ�в�������.

    test("2147483649", true);
    test("-2147483649", false);
    test("-2147483650", false);
    test("-2147500000", false);   
    test("123456789012345678901234567890", true);   

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
    if ( IntegerUtility.isNaturalNumberText(s) )
       System.out.print("����");
    else
       System.out.print("������");
    System.out.print(" һ����Ȼ�� ");
    if ( b )
       System.out.println("Ӧ��.");
    else
       System.out.println("��Ӧ��.");
}  // method test
}  // class IsNaturalNumberTextTest