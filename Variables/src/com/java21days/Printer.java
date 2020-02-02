package com.java21days;

public class Printer {
  int x = 0;
  int y = 1;
  
  void PrintMe() {
	  System.out.println("x is " + ", y is" + y);
	  System.out.println("I am instance of the class " +
	  this.getClass().getName());
	    }
}

class SubPrinter extends Printer{
	int z = 3;
		
	public static void main(String[] arguments) {
		SubPrinter obj = new SubPrinter();
		obj.PrintMe();
	}
}
		