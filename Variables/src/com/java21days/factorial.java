package com.java21days;

public class factorial {
   public static void main(String[] arguments) {
	    factorial happy = new factorial();
	    	System.out.println(happy.count(5));
   }  
   public int count (int number) {
	   int Number;
	   Number = number + 1;
	   int value = 1;
	   int i = 0;
	   for(i=1; i < Number; i++) {
		   value *= i;
	   }                      
	   return value;     
}
}
