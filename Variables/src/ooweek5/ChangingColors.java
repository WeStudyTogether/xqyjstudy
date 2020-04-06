package ooweek5;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangingColors extends JPanel {
	
	public static void main (String[] args) {
		JFrame frame = new JFrame("ChangingColors");
	frame.setContentPane(new ChangingColors());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
}

public void paintComponent(Graphics g) {
	setBackground(Color.black);
	setForeground(Color.white);
	
	ChangingColors.drawLineDefaultColor(g,20);
	ChangingColors.drawLineChangedColor(g,Color.yellow,40);
	ChangingColors.drawLineDefaultColor(g,60);
	ChangingColors.drawLineCleanColor(g,Color.red,80);
	ChangingColors.drawLineDefaultColor(g,100);
}

public static void drawLineDefaultColor(Graphics g, int pixelsFromTop) {
	g.drawLine(20, pixelsFromTop, 280, pixelsFromTop);
}

public static void drawLineChangedColor(Graphics g,
		Color c,
		int pixelsFromTop)
{
	g.setColor(c);
	g.drawLine(20,pixelsFromTop,280,pixelsFromTop);
}
 
public static void drawLineCleanColor(Graphics g,
		Color c,
		int pixelsFormTop)
{
	Color oldColor = g.getColor();
	g.setColor(c);
	g.drawLine(20,pixelsFormTop,280,pixelsFormTop);
	g.setColor(oldColor);
}
}

