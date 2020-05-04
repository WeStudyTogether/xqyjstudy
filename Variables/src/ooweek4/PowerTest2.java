package ooweek4;

public class PowerTest2 {
    public static void main(String[] args)
    {
    	final int intBase = 2;
    	final int exponent = -3;
    	final float floatBase = intBase;
    	
    	long longPower = MathUtility.power(intBase, exponent);
    	double doublePower = MathUtility.power(floatBase, exponent);
    	
    	System.out.println();
    	System.out.println(intBase + "����Ϊ"
    			+ exponent + "ʱ��ָ��Ϊ��");
    	System.out.println();
    	System.out.println(" " + longPower + "(long)");
    	System.out.println(" " + doublePower + "(double)");
    	System.out.println();
    }
}
