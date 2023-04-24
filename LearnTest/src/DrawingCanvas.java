import java.awt.*;
import java.awt.geom.*;//creating shapes and paths
import javax.swing.*;


public class DrawingCanvas extends JComponent {
	
	private int width;
	private int height;
	
	public DrawingCanvas(int w, int h) {
		width = w;
		height = h;
	}
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Rectangle2D.Double r = new Rectangle2D.Double(50,75,100,250);
		g2d.setColor(new Color(100,149,237));
		g2d.fill(r);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
