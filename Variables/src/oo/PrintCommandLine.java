package oo;

public class PrintCommandLine {
    public static void main(String[] args) {
    	if(args.length == 0) {
    		System.out.println("�˳����ظ������в�����");
    		System.exit(0);
    	}
    	
    	System.out.print("������ǣ�   ");
    	
    	
    	int index  = 0;
    	while(index<args.length) {
    		System.out.print(" " + args[index]);
    		index = index + 1;
    	}
    	
    	System.out.println();
    }
}
