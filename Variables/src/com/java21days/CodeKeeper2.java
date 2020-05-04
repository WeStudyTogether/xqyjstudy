package com.java21days;

import java.util.*;

public class CodeKeeper2 {
  ArrayList<String> list;
  String[] codes = { "alpha", "mint", "iteration", "interface", "implements"};
  
  public CodeKeeper2(String[] userCodes) {
	  list = new ArrayList<>();//1.Why there is a "<>¡° in "new ArrayList", but it is not in "list"
	  //load built-in codes
	  for (int i = 0; i < codes.length; i++) {
		  addCode(codes[i]);
	  }
	  //load user codes
	  for (int j = 0; j < userCodes.length; j++) {
		  addCode(userCodes[j]);
	  }
	  //display all codes
	  for (String code : list) { // 2.I am amazing that there is no ";"  in for circulation
		  System.out.println(code);
	  }
  }
  
  private void addCode(String code) {
	  if (!list.contains(code)) {
		  list.add(code);
	  }
  }
  
  public static void main(String[] arguments) {
	  @SuppressWarnings("unused")
	CodeKeeper2 keeper = new CodeKeeper2(arguments);
  }
}
