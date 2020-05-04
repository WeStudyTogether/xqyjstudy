package oo;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
    public static void main(String[] args) {
    	DecimalFormat df2 = new DecimalFormat("0.00");
    	DecimalFormat df3 = new DecimalFormat("0.000");
    	
    	float x = 2.0f/3;
    	double y = 2.0/3;
    	
    	System.out.println();
        System.out.println("类型                两位                三位"
        		             + "             全部位 ");
        System.out.println();
        System.out.println("float        " + df2.format(x)
                                +"        " + df3.format(x)
                                +"        " + x);
        System.out.println("double        " + df2.format(y)
                                +"        " + df3.format(y)
                                +"        " +y);
    }
}
