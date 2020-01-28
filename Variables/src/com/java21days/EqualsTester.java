package com.java21days;

public class EqualsTester {
  public static void main(String[] arguements) {
	  String str1, str2;
	  str1 = "Boy, that escalated quickly.";
	  str2 = str1;
	  
	  System.out.println("String1: " +str1);
	  System.out.println("String2: " +str2);
	  System.out.println("Same obiect?" + (str1 == str2));
	  
	  str2 = new String(str1);
	  
	  System.out.println("String1: " + str1);
	  System.out.println("String2: " + str2);
	  System.out.println("Same objiect? " + (str1 == str2));
	  System.out.println("Same value? " + str1.equals(str2));
  }
}
