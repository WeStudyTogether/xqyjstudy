package oo;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Average4{
	public static void main(String[] args){
		DecimalFormat df= new DecimalFormat("0.00");
		int sum=0;
		float average=0;
		int count=0;
		
		while(true){
			String text=JOptionPane.showInputDialog("������һ�����֣�");
			if(text==null){
			JOptionPane.showMessageDialog(
							null,
							"��ѡ���˽������롣"
							);
					break;}
			if(text.equals("")){

			JOptionPane.showMessageDialog(
							null,
							"������Ч��"
							);
           }
			else {
				int number=Integer.parseInt(text);
				sum+=number;
				++count;
			}
                          }
				average=sum/count;
				JOptionPane.showMessageDialog(
				null,
				"��������������"+count+"λ������ƽ����Ϊ"+df.format(average));
				System.exit(0);
     }
}	