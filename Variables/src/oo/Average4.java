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
			String text=JOptionPane.showInputDialog("请输入一个数字：");
			if(text==null){
			JOptionPane.showMessageDialog(
							null,
							"你选择了结束输入。"
							);
					break;}
			if(text.equals("")){

			JOptionPane.showMessageDialog(
							null,
							"输入无效！"
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
				"输入结束。输入的"+count+"位整数的平均数为"+df.format(average));
				System.exit(0);
     }
}	