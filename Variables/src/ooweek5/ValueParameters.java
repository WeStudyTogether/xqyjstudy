package ooweek5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ooweek4.MathUtility;

public class ValueParameters {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				                       new InputStreamReader(System.in));
		System.out.print("此程序将一个浮点数");
		System.out.println("上调为一个整数");
		
		System.out.print("键入基数（floating-point）:>");
		@SuppressWarnings("deprecation")
		float enteredBase = Float.parseFloat(br.readLine());
		System.out.print("键入指数（integer）:>");
		int enteredExponent = Integer.parseInt(br.readLine());
		
		double result = MathUtility.power(enteredBase, enteredExponent);
		
		System.out.println(enteredBase + " 的" + 
		                         enteredExponent + "次的幂为" + result + "," );		
	}
}
