package oo;

public class PlugIfElseDemo2 {
    public static void main(String[] args) {
    	if (args.length == 0) {
    		System.out.print("�˳����ж���Ϊ");
    		System.out.println("�����в��������");
    		System.out.print("�ٷ��Ʒ�����");
    		System.out.println("��Ӧ����ĸ����");
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
    	
    	System.out.println("����Ϊ" + score + " �ĵȼ�Ϊ" + grade + ".");
    }
}
