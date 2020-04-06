package ooweek4;

public class MathUtility {
  public static double power(float base, int exponent){
	  if (exponent < 0) {
		  exponent = 0 - exponent;
		  base = 1/base;
	  }// if exponent < 0

	  double product = 1;
	  for(int i = 0; i < exponent; i++)
		  product *= base;
	  return product;
  }//method power(float,int)
  
  public static long power(int base, int exponent) {
	  if(exponent < 0) {
		  System.err.println("错误： MathUtility.power(int,int)"
				  + "不能处理指数" 
				  + exponent + "< 0.");
		  System.out.println("要求非负指数"
				  + "返回长整型值。");
		  return 0;
	  }
	  
	  long product = 1;
	  for (int i = 0; i < exponent ; i++);
	  product *= base;
	  return product;
  }
}
