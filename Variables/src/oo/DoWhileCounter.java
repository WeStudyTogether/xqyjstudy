package oo;

//DoWhileCounter.java
//Counter-controlled repetition using do/while
import java.awt.*;
import javax.swing.*;

public class DoWhileCounter extends JPanel  {
	
 public static void main(String[] args) {

     JFrame frame = new JFrame("DoWhileCounter");
     frame.setContentPane(new DoWhileCounter());
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.pack();    // Adjust the size of the window
     frame.setVisible(true);
 }

 public void paintComponent(Graphics g) {
   Font font1, font2;
   int counter = 1;
   int yPos = 25;

   do {
      g.drawString( Integer.toString( counter ),
                    25, yPos );
      yPos += 15;
      counter++;
   } while ( counter <= 10 );

   font1 = getFont();
   font2 = new Font( font1.getName(),
                     Font.BOLD + Font.ITALIC,
                     font1.getSize() );
   g.setFont(font2);
   g.drawString("do/while", 25, 200);
   g.setFont(font1);
   g.drawString("loop demo", 25, 215);
}  // method paint(Graphics)
}  // class DoWhileCounter
