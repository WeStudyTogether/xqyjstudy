package ooweek5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ooweek4.MathUtility;

public class ValueParameters {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				                       new InputStreamReader(System.in));
		System.out.print("�˳���һ��������");
		System.out.println("�ϵ�Ϊһ������");
		
		System.out.print("���������floating-point��:>");
		@SuppressWarnings("deprecation")
		float enteredBase = Float.parseFloat(br.readLine());
		System.out.print("����ָ����integer��:>");
		int enteredExponent = Integer.parseInt(br.readLine());
		
		double result = MathUtility.power(enteredBase, enteredExponent);
		
		System.out.println(enteredBase + " ��" + 
		                         enteredExponent + "�ε���Ϊ" + result + "," );		
	}
}
