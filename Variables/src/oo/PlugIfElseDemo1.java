package oo;

public interface PlugIfElseDemo1 {
  public static void main(String[] args) {
	  if (args.length == 0) {
		  System.out.print("�˳����ж�һ��");
		  System.out.println("��Ϊ�����в�������");
		  System.out.print("�ĸ������Ƿ����");
		  System.out.println("0��1000֮��");
		  System.exit(0);
	  }
	  
	  float number = Float.parseFloat(args[0]);
	  
	  if(number<=1000)
		  if(number>=0)
			  System.out.println(number + "�ǽ���0��1000֮�䡣");
		  else
			  System.out.println(number + " С��0��");
	  else
		  System.out.println(number + " ����1000.");
  }
}
