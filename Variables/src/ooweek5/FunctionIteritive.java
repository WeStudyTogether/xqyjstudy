package ooweek5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionIteritive {
  public static int fibonacci(int n) {
	  if(n < 0) {
			System.out.println("请输入大于等于0的数哦");
			System.out.println("裴波那契序列数不接受负数哦");
			return -1;
		}
	  
		if (n==0 || n == 1) {
			System.out.println("斐波纳契序列是1");
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
			System.out.println ("powerOfTwo " + n + " 未定义，但必须>=0. ");
			return -1;
		}
		long product = 1;
		for ( int i = 1; i <= n; i++ )
			product = product * 2;
		return product;
	}  
  
  public static void main(String[] args) throws NumberFormatException,IOException{
	  System.out.println("请输入一个数字：" );
	  System.out.println("这个数字的斐波纳契数是：" +
	    new FunctionIteritive().fibonacci(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
	  System.out.println("请输入一串字符：");
	  System.out.println("将这串字符反转的结果是：" + 
	    new FunctionIteritive().reverse(new BufferedReader(new InputStreamReader(System.in)).readLine()));
	  System.out.println("请输入一个数字：" );
	  System.out.println("这个数字的2的幂指数为：" +
	    new FunctionIteritive().powerOfTwo(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
  }
	  
 }

  
