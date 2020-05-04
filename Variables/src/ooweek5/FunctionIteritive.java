package ooweek5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionIteritive {
  public static int fibonacci(int n) {
	  if(n < 0) {
			System.out.println("��������ڵ���0����Ŷ");
			System.out.println("�Შ���������������ܸ���Ŷ");
			return -1;
		}
	  
		if (n==0 || n == 1) {
			System.out.println("쳲�����������1");
			return 1;
		}
		int n1 = 1;
		int n2 = 1;
		int result = 0;
		
	    for (int i = 2; i <= n; i++) {
				        result = n1 + n2;
	    n2 = n1;
	    n1 = result;
		}
	  return result;
  }
  
  public String reverse(String s) {
	  if (s.equals(""))
		  return "";
	  else{
		   String reverse = "";
		   for(int i=0; i<s.length();i++)
			   reverse = s.charAt(i) + reverse;
		   return reverse;}
	  }
  
  public long powerOfTwo(int n) {
		if ( n < 0 )	{
			System.out.println ("powerOfTwo " + n + " δ���壬������>=0. ");
			return -1;
		}
		long product = 1;
		for ( int i = 1; i <= n; i++ )
			product = product * 2;
		return product;
	}  
  
  public static void main(String[] args) throws NumberFormatException,IOException{
	  System.out.println("������һ�����֣�" );
	  System.out.println("������ֵ�쳲��������ǣ�" +
	    new FunctionIteritive().fibonacci(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
	  System.out.println("������һ���ַ���");
	  System.out.println("���⴮�ַ���ת�Ľ���ǣ�" + 
	    new FunctionIteritive().reverse(new BufferedReader(new InputStreamReader(System.in)).readLine()));
	  System.out.println("������һ�����֣�" );
	  System.out.println("������ֵ�2����ָ��Ϊ��" +
	    new FunctionIteritive().powerOfTwo(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
  }
	  
 }

  
