//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JPanel;
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;
//
//public class MyPanel extends JPanel implements ActionListener, ChangeListener {
//	
//
//	
//	MyPanel(){
//		this.setPreferredSize(new Dimension(300,300));
//		ur.button1.addActionListener(this);
//	}
//
//	public void paint(Graphics g) {
//		
//		Graphics2D g2d = (Graphics2D)g;
//
//		
//		g2d.setPaint(Color.pink);
//		g2d.fillRect(0, 0, 100, 200);
//		
//		g2d.drawOval(0, 0,100, 100);
//		g2d.fillOval(100, 100, 100, 100);
//
//	}
//
//	@Override
//	public void stateChanged(ChangeEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if (e.getSource()==button1) {
//			System.out.println("Squareeee clickedddd");
//			
//			
//		}
//		if (e.getSource()==button2) {
//			System.out.println("Circle clicked");
//			ur.glabel.setVisible(true);
//		}
//	}
//
//
//}
