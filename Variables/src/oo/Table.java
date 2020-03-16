package oo;

public class Table{
public static void main(String[] args){
	int number=Integer.parseInt(args[0]);
       if(number<=0){
		System.out.println("输入错误。\n请输入正整数。");
	}
	if(args.length<1){
		System.out.println("请输入一个正整数。\n该程序将打印非负数的值和它们的阶乘。");
	}


    System.out.println("数            数的阶乘");
    System.out.println("--------      --------\n");
	int factorial=1;
	int count=0;
	while(count<=number){
		String numText=Integer.toString(count);
		while(numText.length()<2)
			numText=" "+numText;
		String facText=Integer.toString(factorial);
		while(facText.length()<12)
			facText=" "+facText;
		System.out.println(" "+numText+" "+facText);
		count=count+1;
	    factorial=factorial*count;
		
		
	}
  }
}