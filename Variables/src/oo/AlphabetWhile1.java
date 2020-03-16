package oo;

import java.applet.*;
import java.awt.Graphics;

public class AlphabetWhile1 extends Applet{

	public void paint(Graphics g){
		String text="";
		char letter='A';
		while(letter<='Z'){
			text=text+letter;
			letter=(char)(letter+1);
			}
		g.drawString(text,50,40);
                               }
 }
