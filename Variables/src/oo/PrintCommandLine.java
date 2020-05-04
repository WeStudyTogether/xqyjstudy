package oo;

public class PrintCommandLine {
    public static void main(String[] args) {
    	if(args.length == 0) {
    		System.out.println("此程序将重复命令行参数。");
    		System.exit(0);
    	}
    	
    	System.out.print("键入的是：   ");
    	
    	
    	int index  = 0;
    	while(index<args.length) {
    		System.out.print(" " + args[index]);
    		index = index + 1;
    	}
    	
    	System.out.println();
    }
}
