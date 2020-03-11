package oo;

public class SumNumber {
  public static void main(String args[]) {
	  if(args.length == 0) {
		  System.out.print("此程序将打印出1到");
		  System.out.println("之间的所有数之和，");
		  System.out.print("N是一个为命令行参数");
		  System.out.println("的正整数");
		  System.exit(0);
	  }
	  
	  int n = Integer.parseInt(args[0]);
	  int sum = 0;
	  int count = 0;
	  
	  while(count < n) {
		  count = count + 1;
		  sum = sum + count;
	  }
	  
	  System.out.println("从1到"
			                 + n + " 的和是：  " + sum + "."); 
  }
}
