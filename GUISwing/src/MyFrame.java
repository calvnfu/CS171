import java.awt.Color;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){
		
	//JFrame frame = new JFrame();
	this.setTitle("Hello World");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(420,420);
	this.setVisible(true);
	this.setResizable(false);
	
	this.getContentPane().setBackground(new Color(150,200,150));
	
	}

}


