package oo;

public class PowerColumns {
  public static void main(String args[])
  {
	  System.out.println("2����ָ��");
	  System.out.println("--------\n");
	  System.out.println("ָ��        ��ֵ");
	  System.out.println("--------   --------\n");
	  
	  int exponent = 0;
	  int power = 1;
	  while(power < 100000) {
		  System.out.println("        " + exponent +
				             "        " + power);
          exponent = exponent + 1;
          power = power * 2;
	  }
  }
}
