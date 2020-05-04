package ooweek5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionRecusive {
   
	public int fi(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		if (n <= 0) {
			System.out.println("error");
			return -1;
		}
		return fi(n-1) + fi(n-2);
	}
	
	public String reverse(String s) {
		if (s.equals(""))
			return "";
		else
			return(reverse(s.substring(1)) + s.charAt(0));
	}
	
	public static void main(String[] args) throws NumberFormatException,IOException{
		System.out.println("请输入一个数字：" );
		System.out.println("这个数字的斐波纳契数是：" + 
		new FunctionRecusive().fi(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
	    
	}
}
