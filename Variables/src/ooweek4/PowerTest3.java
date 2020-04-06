package ooweek4;

public class PowerTest3 {
    public static void main(String[] args)
    {
    	System.out.println();
    	testPower(2,50);
    	PowerTest3.testPower(2,61);
    	PowerTest3.testPower(2,64);
    	
    }
    
    public static void testPower(int intBase, int exponent)
    {
    	long longPower = MathUtility.power(intBase, exponent);
    	float floatBase = intBase;
    	double doublePower = MathUtility.power(floatBase, exponent);
    	 System.out.println(intBase + " 上调到 "
    			 + exponent + " 时指数为:");
    		     System.out.println();
    			 System.out.println("   " + longPower + "  (long)");
    			 System.out.println("   " + doublePower 
    			  + "  (double unformatted, scientific notation)");
    			 System.out.println();
    }
}
