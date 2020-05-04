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
		  System.err.println("���� MathUtility.power(int,int)"
				  + "���ܴ���ָ��" 
				  + exponent + "< 0.");
		  System.out.println("Ҫ��Ǹ�ָ��"
				  + "���س�����ֵ��");
		  return 0;
	  }
	  
	  long product = 1;
	  for (int i = 0; i < exponent ; i++);
	  product *= base;
	  return product;
  }
}
