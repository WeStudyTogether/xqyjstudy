package oo;

public class OddEvenWithPlugIfElse {
    public static void main(String[] args) {
    	if(args.length == 0) {
    		System.out.print("此程序计算输入的");
            System.out.println("一列命令行参数中的");
            System.out.println("奇数和偶数的个数。");
            System.exit(0);    		
    	}
    	
    	int oddCount = 0;
    	int evenCount = 0;
    	int loopCount =0;
    	
    	while(loopCount<args.length)
    	{
    		int number = Integer.parseInt(args[loopCount]);
    		if(number%2==0) {
    			System.out.println(number+" 是偶数。");
    			evenCount = evenCount +1;	
    		}
    		else {
    			System.out.println(number + " 是奇数。");
    			oddCount = oddCount + 1;
    		}
    		
    		loopCount = loopCount + 1;
    	}
    	System.out.println("输入了" + oddCount +
    			" 个奇数和" + evenCount + 
    			" 个偶数");   
    }
}
