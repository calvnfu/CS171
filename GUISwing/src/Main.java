import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		//new MyFrame();
		
		ImageIcon image = new ImageIcon("voun.jpeg");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		//JLabel = a GUI display area for a string of text, image or both
		
		JLabel label = new JLabel();
		label.setText("This is Calvin");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x00FF00));//
		label.setFont(new Font("New Bolo",Font.PLAIN,20));
		label.setIconTextGap(25);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		label.setBounds(0,0,500,500);
		
		JFrame frame = new JFrame();
		frame.setTitle("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		frame.setVisible(true);
		
		//frame.setLayout(null);
		frame.pack();
		
		
		frame.add(label);

		
	
	
//		frame.getContentPane().setBackground(new Color(150,200,150));
		
//		ImageIcon image = new ImageIcon("voun.jpeg");
//		Border border = BorderFactory.createLineBorder(Color.green);
//		
//		JLabel label = new JLabel();//create a label
//		label.setText("Bro, do you even code?");
//		label.setIcon(image);
//		label.setHorizontalTextPosition(JLabel.CENTER);
//		label.setVerticalAlignment(JLabel.TOP);//set text top center, bottom of image
//		label.setForeground(new Color(0x00FF00));
//		label.setFont(new Font("MV Boli",Font.PLAIN,20));
//		
//		label.setIconTextGap(2000);
//		label.setBackground(Color.black);
//		label.setOpaque(true);//display background color
//		label.setBorder(border);
//		label.setVerticalAlignment(JLabel.CENTER);
//		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setBounds(0,0,250,250);//set x, y position within frame as well as dimensions
//		
//		JFrame frame = new JFrame();
//		frame.setTitle("JFrame title goes here");//sets title of frame
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);//sets x dimision and y dimension
//		frame.setSize(500,500);//make frame visible
//		
//		frame.setLayout(null);
//		frame.setVisible(true);
//		
//		frame.add(label);
		
//		frame.setResizable(false);//prevent frame from resize
//		
//		frame.getContentPane().setBackground(new Color(255,255,255));
		
		//new MyFrame();

	}

}
