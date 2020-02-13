package com.java21days;

public class HexReader {
  String[] input = { "000A110D1D260219 ",
		  "78700F1318141E0C ",
		  "6A197D4580FFFFFF " };
  
  public static void main(String[] argumnets) {
	  HexReader hex = new HexReader();// 1.whether it is object or the quote of object
	  for (int i = 0; i < hex.input.length; i++)
		  hex.readLine(hex.input[i]);//2.Can you explain this statement for me 
  }
  
  void readLine(String code) {
	  try {
		  for (int j = 0; j + 1 < code.length(); j +=2) {
			  String sub = code.substring(j, j+2 );
			  int num = Integer.parseInt(sub,16);
			  if (num ==255) {
				  return;
			  }
			  System.out.print(num + " ");
		  }
	  }finally {
		  System.out.println("**");
	  }
	  return;
  }
}// 3.There is no "catch in the whole program, and I do not know what the meaning of using "try" and "finally". 
  //It seems like that the use of exception is not necessary


