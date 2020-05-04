package oo;

public class Interest {
  public static void main(String args[]) {
	  if(args.length!=2) {
		  System.out.println("程序需要输入两个参数哦");
		  System.out.println("第一个参数是亲存入银行的本金");
		  System.out.println("第二个参数是年利率");
		  System.out.println("亲的帮手我将计算银行本金连同利息之和达到本金的2倍的年份");
	  }
	double principal = Double.parseDouble(args[0]);
	double principal2 = 2*principal;
	float rate = Float.parseFloat(args[2]);
	double sum = 0;
	int year = 0;
	while (sum < principal2) {
		sum = principal * (1 + rate);
		year = year + 1;
		}
	System.out.println("将计算银行本金连同利息之和达到本金的2倍需要");
	System.out.println(year + "年");
  }
}
