package oo;

import java.text.DecimalFormat;

public class AverageN {
  public static void main(String args[]) {
	  float sum = 0;
	  float length = args.length;
	  int index = 0;
	  while (index < length) {
		  sum = sum + Float.parseFloat(args[index]);
		  index = index + 1;
	  }
	  float average = sum/length;
	  
	  DecimalFormat df2 = new DecimalFormat("0.0");
	  
	  System.out.println("数组平均值为" + df2.format(average));
  }
}
