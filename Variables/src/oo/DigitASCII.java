package oo;

import java.awt.*;
import javax.swing.*;

public class DigitASCII extends JPanel  {
	
    public static void main(String[] args) {

        JFrame frame = new JFrame("DigitASCII");
        frame.setContentPane(new DigitASCII());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();    // Adjust the size of the window
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g){
      g.drawString("digit", 40, 40);
      g.drawString("character", 27, 55);
      g.drawString("ASCII", 95, 40);
      g.drawString("value", 95, 55);

      for ( char digitChar = '0'; digitChar <= '9'; digitChar++ )  {
         g.drawString(new Character(digitChar).toString(),
                      50, 85 + (digitChar - '0') * 15);
         g.drawString(Integer.toString(digitChar),
                      100, 85 + (digitChar - '0') * 15);
      }  // for digitChar
   }  // method paint(Graphics)
}  // class DigitASCII