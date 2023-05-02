import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){
		
		JButton button = new JButton();
	//JFrame frame = new JFrame();
	this.setTitle("Hello World");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(420,420);
	this.setVisible(true);
	this.setResizable(false);
	this.add(button);
	
	this.getContentPane().setBackground(new Color(150,200,150));
	
	}

}


