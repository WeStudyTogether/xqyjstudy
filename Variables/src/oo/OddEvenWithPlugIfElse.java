package oo;

public class OddEvenWithPlugIfElse {
    public static void main(String[] args) {
    	if(args.length == 0) {
    		System.out.print("�˳�����������");
            System.out.println("һ�������в����е�");
            System.out.println("������ż���ĸ�����");
            System.exit(0);    		
    	}
    	
    	int oddCount = 0;
    	int evenCount = 0;
    	int loopCount =0;
    	
    	while(loopCount<args.length)
    	{
    		int number = Integer.parseInt(args[loopCount]);
    		if(number%2==0) {
    			System.out.println(number+" ��ż����");
    			evenCount = evenCount +1;	
    		}
    		else {
    			System.out.println(number + " ��������");
    			oddCount = oddCount + 1;
    		}
    		
    		loopCount = loopCount + 1;
    	}
    	System.out.println("������" + oddCount +
    			" ��������" + evenCount + 
    			" ��ż��");   
    }
}
