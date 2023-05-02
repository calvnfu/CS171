import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel {

	public static void main(String[] args) {
		
		//JPanel is a GUI component that function as a container to hold other components
		
		JLabel label = new JLabel();
		label.setText("Hello World");
		ImageIcon image = new ImageIcon("hi.png");
		label.setIcon(image);
		label.setVerticalAlignment(JLabel.TOP);
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0,0,250,250);
		redpanel.add(label);
		//redpanel.setLayout(new BorderLayout());
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250,0,250,250);
		//bluepanel.add(label);
		//bluepanel.setLayout(new BorderLayout());
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0,250,500,250);
		//greenpanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();
		frame.setTitle("JPanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(null);
		
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
		
//		ImageIcon icon = new ImageIcon("check.png");
//		
//		JLabel label = new JLabel();
//		label.setText("Hi");
//		//label.setIcon(icon);
//		label.setVerticalAlignment(JLabel.BOTTOM);
//		label.setHorizontalAlignment(JLabel.RIGHT);
//		
//	
//		
//		greenPanel.add(label);

	}

}
