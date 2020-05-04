package oo;

public class PlugIfElseDemo2 {
    public static void main(String[] args) {
    	if (args.length == 0) {
    		System.out.print("此程序判断作为");
    		System.out.println("命令行参数输入的");
    		System.out.print("百分制分数的");
    		System.out.println("相应的字母级别");
    		System.exit(0);
    	}
    	
    	int score = Integer.parseInt(args[0]);
    	char grade;
    	
    	if(score >=90)
    		grade = 'A';
    	else
    		if(score>=80)
    			grade = 'B';
    		else
    		   if(score>=70)
    			   grade = 'C';
    		   else
    			   if(score>=60)
                       grade = 'D';
    			   else
    				   grade = 'F';
    	
    	System.out.println("分数为" + score + " 的等级为" + grade + ".");
    }
}
