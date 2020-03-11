package oo;

public class Age {
   public static void main(String args[]) {
	   if(args.length!=1) {
		   System.out.println("请输入被测人的年龄哦");
	   }
	   
	   int age = Integer.parseInt(args[0]);
	   
	   if(age<18) {
		   if(age<0) {
			   System.out.println("怎么？你还没有被生下来？");}
		   else
			   System.out.println("你还没有到投票的年龄。");	   
		   }
	   else {
		   if(age<65) {
			   System.out.println("你具有投票的权利但还没有到退休的年龄。");
		   }
		   else {
			   System.out.println("你到了退休的年龄了。");
		   }
	   }
    }
}  

