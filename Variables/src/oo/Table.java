package oo;

public class Table{
public static void main(String[] args){
	int number=Integer.parseInt(args[0]);
       if(number<=0){
		System.out.println("�������\n��������������");
	}
	if(args.length<1){
		System.out.println("������һ����������\n�ó��򽫴�ӡ�Ǹ�����ֵ�����ǵĽ׳ˡ�");
	}


    System.out.println("��            ���Ľ׳�");
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