package oo;

public class SumNumber {
  public static void main(String args[]) {
	  if(args.length == 0) {
		  System.out.print("�˳��򽫴�ӡ��1��");
		  System.out.println("֮���������֮�ͣ�");
		  System.out.print("N��һ��Ϊ�����в���");
		  System.out.println("��������");
		  System.exit(0);
	  }
	  
	  int n = Integer.parseInt(args[0]);
	  int sum = 0;
	  int count = 0;
	  
	  while(count < n) {
		  count = count + 1;
		  sum = sum + count;
	  }
	  
	  System.out.println("��1��"
			                 + n + " �ĺ��ǣ�  " + sum + "."); 
  }
}
