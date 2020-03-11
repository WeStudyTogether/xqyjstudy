package com.java21days;

public class count {
  public static void countprofit(double profit, double proportion, double amount ) {
	  double count;
	  if (profit > 0) {
		  count = proportion * amount;//It should be count = profit * proportion *amount
	      System.out.println("The total profit is " + count );
	  }
	  else
		  System.out.println("This commodity is losing money");
  }


public static void main(double[] args ) {
	countprofit(-1,0.2,500);//t1 executes the statement with the fault,  but there is no error
	countprofit(1,0.2,500);//t2 executes the statement with the fault and error, but there is no failure
	countprofit(2,0.2,500);//t3 executes the statement with the failure.
}
}