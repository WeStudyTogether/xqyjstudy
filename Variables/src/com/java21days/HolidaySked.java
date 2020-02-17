package com.java21days;

import java.util.*;

public class HolidaySked {
  BitSet sked;
  
  public HolidaySked() {
	   sked = new BitSet(365);
	   int[] holiday = {1, 15, 50, 148, 185, 246,
			   281, 316, 326, 359 };
	   for (int i = 0; i < holiday.length; i++) {
		   addHoliday(holiday[i]);//1.在8到15行，创建了位组sked后，将所有的位设置为0，将所有的值设置为0是怎么做到的
		   }
	   }
  
  public void addHoliday (int dayToAdd) {  
	  sked.set(dayToAdd);         // 2.这个dayToAdd是哪里来的，自己定义的？
  }
  
  public boolean isHoliday(int dayToCheck) {
	  boolean result = sked.get(dayToCheck);
	  return result;
  }
  
  public static void main(String[] arguments) {
	  HolidaySked cal = new HolidaySked();
	  if (arguments.length > 0) {
		  try {
			  int whichDay = Integer.parseInt(arguments[0]);
			  if (cal.isHoliday(whichDay)) {
				  System.out.println("Day number " + whichDay + 
						  " is  a holiday.");
			  }else {
				  System.out.println("Day number " + whichDay +
						  " is not a holiday");
			  }
		  }catch (NumberFormatException nef) {
			  System.out.println("Error: " + nef.getMessage());
		  }
	  }
  }
}
