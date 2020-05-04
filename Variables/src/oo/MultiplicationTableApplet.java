package oo;

import java.awt.Graphics;
import java.awt.Font;
import java.applet.Applet;
public class MultiplicationTableApplet extends Applet{
	public void paint(Graphics g){
		Font f=new Font("Serif",Font.PLAIN,12);
		g.setFont(f);
		int x1Pos=48,x2Pos=48;
		
		int yPos=55;
		int i=0;
		do{
			g.drawString(Integer.toString(i),x1Pos,10);
			x1Pos+=36;
			i++;
		}while(i<=9);
		g.drawString("--------------------------------------------------------------------------------",36,40);
		for(int j=0;j<=9;j++){
			g.drawString(Integer.toString(j),0,yPos);
			g.drawString("|",24,yPos);
			for(int k=0;k<=9;k++){
				g.drawString(Integer.toString(j*k),x2Pos,yPos);
				x2Pos+=36;
			}
			yPos+=30;
			x2Pos=48;
		}		
	}
}