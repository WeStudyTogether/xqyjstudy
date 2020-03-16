package oo;

import java.awt.*;
import javax.swing.*;

public class WhileCounter extends JPanel  {
	
    public static void main(String[] args) {

        JFrame frame = new JFrame("WhileCounter");
        frame.setContentPane(new WhileCounter());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();    // Adjust the size of the window
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g){
      Font font1, font2;
      int counter = 1;             // initialization
      int yPos = 25;

      while ( counter <= 10 ) {    // repetition condition
         g.drawString( Integer.toString( counter ), 25, yPos );
         yPos += 15;
         counter++;                // increment
      }  // while counter

      font1 = getFont();
      font2 = new Font( font1.getName(),
                     Font.BOLD + Font.ITALIC,
                     font1.getSize());
      g.setFont(font2);
      g.drawString("while", 25, 200);
      g.setFont(font1);
      g.drawString("loop demo", 25, 215);
   }  
}  // class WhileCounter