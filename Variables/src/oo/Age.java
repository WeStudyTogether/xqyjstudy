package oo;

public class Age {
   public static void main(String args[]) {
	   if(args.length!=1) {
		   System.out.println("�����뱻���˵�����Ŷ");
	   }
	   
	   int age = Integer.parseInt(args[0]);
	   
	   if(age<18) {
		   if(age<0) {
			   System.out.println("��ô���㻹û�б���������");}
		   else
			   System.out.println("�㻹û�е�ͶƱ�����䡣");	   
		   }
	   else {
		   if(age<65) {
			   System.out.println("�����ͶƱ��Ȩ������û�е����ݵ����䡣");
		   }
		   else {
			   System.out.println("�㵽�����ݵ������ˡ�");
		   }
	   }
    }
}  

