package oo;

public interface PlugIfElseDemo1 {
  public static void main(String[] args) {
	  if (args.length == 0) {
		  System.out.print("此程序判断一个");
		  System.out.println("作为命令行参数输入");
		  System.out.print("的浮点数是否界于");
		  System.out.println("0到1000之间");
		  System.exit(0);
	  }
	  
	  float number = Float.parseFloat(args[0]);
	  
	  if(number<=1000)
		  if(number>=0)
			  System.out.println(number + "是介于0到1000之间。");
		  else
			  System.out.println(number + " 小于0。");
	  else
		  System.out.println(number + " 大于1000.");
  }
}
