package oo;

public class Interest {
  public static void main(String args[]) {
	  if(args.length!=2) {
		  System.out.println("������Ҫ������������Ŷ");
		  System.out.println("��һ���������״������еı���");
		  System.out.println("�ڶ���������������");
		  System.out.println("�׵İ����ҽ��������б�����ͬ��Ϣ֮�ʹﵽ�����2�������");
	  }
	double principal = Double.parseDouble(args[0]);
	double principal2 = 2*principal;
	float rate = Float.parseFloat(args[2]);
	double sum = 0;
	int year = 0;
	while (sum < principal2) {
		sum = principal * (1 + rate);
		year = year + 1;
		}
	System.out.println("���������б�����ͬ��Ϣ֮�ʹﵽ�����2����Ҫ");
	System.out.println(year + "��");
  }
}
