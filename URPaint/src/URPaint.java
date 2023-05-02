import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class URPaint extends JFrame {
	
	JPanel paintPanel;
	JPanel controlPanel;
	
	boolean ifsquare = true;
	int redvalue;
	int greenvalue;
	int bluevalue;

	URPaint(){
		
		super("UR paint");
		
		controlPanel= new ControlPanel();
		controlPanel.setLayout(new BoxLayout(controlPanel,BoxLayout.PAGE_AXIS));
			
		paintPanel = new PaintPanel();
		paintPanel.setLayout(new BorderLayout());
		paintPanel.setBackground(Color.white);
		
	    add(controlPanel, BorderLayout.PAGE_START);   
	    add(paintPanel,BorderLayout.CENTER);
			    
	    this.setSize(800,800);
	    this.setVisible(true);
	    this.setTitle("UR Paint Program");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	class ControlPanel extends JPanel implements ActionListener, ChangeListener{
		
		JPanel buttonPanel, sliderPanel;
		
		JButton squareButton = new JButton("square");
		JButton circleButton = new JButton("circle");
		JButton paletteButton = new JButton("palette");
		JButton clearButton = new JButton("clear");
	
		JSlider rslider = new JSlider(SwingConstants.HORIZONTAL,0,255,125);
		JSlider gslider = new JSlider(SwingConstants.HORIZONTAL,0,255,125);
		JSlider bslider = new JSlider(SwingConstants.HORIZONTAL,0,255,125);
	
		
		ControlPanel(){
			
			buttonPanel = new JPanel();
			sliderPanel = new JPanel();
			
			this.add(buttonPanel);
			this.add(sliderPanel);

			buttonPanel.add(squareButton);
			buttonPanel.add(circleButton);
			buttonPanel.add(paletteButton);
			buttonPanel.add(clearButton);
			
			sliderPanel.add(new JLabel("R"));
			sliderPanel.add(rslider); 
			
			sliderPanel.add(new JLabel("G"));
			sliderPanel.add(gslider); 
			
			sliderPanel.add(new JLabel("B"));
			sliderPanel.add(bslider);
			
	
			rslider.addChangeListener(this);	
			gslider.addChangeListener(this);	
			bslider.addChangeListener(this);
			
	
			squareButton.addActionListener(this);
			circleButton.addActionListener(this);
			paletteButton.addActionListener(this);			
			clearButton.addActionListener(this);
	
		}	

		@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource()==squareButton) {
					System.out.println("Square clicked");
					ifsquare = true;		
				}
				if (e.getSource()==circleButton) {
					System.out.println("Circle clicked");
					ifsquare = false;
					
				}
				if (e.getSource()==paletteButton) {
					System.out.println("Palette clicked");
				
				}
				if (e.getSource()==clearButton) {
					System.out.println("Clear clicked");
				}		
			}
		
			@Override
			public void stateChanged(ChangeEvent e) {
						
				redvalue = rslider.getValue();
				greenvalue = gslider.getValue();
				bluevalue = bslider.getValue();
				paintPanel.setBackground(new Color(redvalue,greenvalue,bluevalue));		
			}
	}
	
	class PaintPanel extends JPanel implements  MouseListener, MouseMotionListener{
		
		
		int x; int y;
		
		ArrayList<Shape> shapes = new ArrayList<>();

		PaintPanel(){

			
			addMouseListener(this);
		}

	//paint square or circle
		
		public void paintComponent(Graphics g) {
						
			Graphics2D g2d = (Graphics2D)g;
					
			g2d.setColor(Color.pink);

			for(Shape shape: shapes) {
				g2d.draw(shape);
				g2d.fill(shape);
			}
		}
		
		public void paintSquare(int x, int y) {
			Shape square = new Rectangle(x,y,50,50);
			shapes.add(square);
			repaint();
			
		}
		
		public void paintCircle(int x, int y) {
			Shape circle = new Ellipse2D.Double(x, y, 50, 50);
			shapes.add(circle);
			repaint();
		}
		
	//drag and drop
		
		
		private class ClickListener extends MouseAdapter{
			
		}
		
		private class DragListener extends MouseMotionAdapter{
			
		}
		
	    

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			x = e.getX();
			y = e.getY();

			if (ifsquare == true) {
				//shapes.add(circle);
				paintSquare(x,y);
			}
			if (ifsquare == false) {
				paintCircle(x,y);
			}
//			
			System.out.println(x+" "+y);
			repaint();
	
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
		
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}

	
	public static void main(String[] args) {
		new URPaint();
	}
	
	

}
