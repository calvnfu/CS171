import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyButton extends JFrame implements ActionListener {
	
	JButton button;
	
	MyButton(){
		
	    button = new JButton();
		button.setBounds(200,1300,200,80);
		//button.addActionListener(this);
		
		this.setTitle("My button frame");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		
		this.add(button);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Ha");
		
		}
	}

}
