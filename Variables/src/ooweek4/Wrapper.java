package ooweek4;

public class Wrapper {
    public static void main(String[] args) {
    	int data = 10;
    	//Autoboxing
    	Integer dataWrapper = data;
    	
    	//Auto-unboxing
    	System.out.println(dataWrapper/3);
    	
    	System.out.println(dataWrapper.doubleValue()/3);
    	
    }
}
