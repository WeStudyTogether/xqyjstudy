package com.java21days;

import javax.swing.*;
@SuppressWarnings({ "unused", "serial" })
public class ButtonFrame extends JFrame {
	JButton load = new JButton("Load");
	JButton save = new JButton("Save");
	JButton unsubscribe = new JButton("Unsubscrible");
	
	public ButtonFrame () {
		super("Button Frame");
		setSize(340,170);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		pane.add(load);
		pane.add(save);
		pane.add(unsubscribe);
		add(pane);
		setVisible(true);
	}
	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.half.nimbus.NimbusLookAndFeel"
					);
		}catch (Exception exc) {
			System.out.println(exc.getMessage());
		}
	}
	
	public static void main(String[] argumnets) {
		setLookAndFeel();
		ButtonFrame bf = new ButtonFrame();
	}  
}
