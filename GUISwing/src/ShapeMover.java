import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShapeMover extends JPanel implements MouseListener, MouseMotionListener {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private int shapeX, shapeY;
    private int shapeWidth, shapeHeight;
    private boolean isDragging;
    private boolean isCircle;

    public ShapeMover() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.WHITE);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (isCircle) {
            g.setColor(Color.BLUE);
            g.fillOval(shapeX, shapeY, shapeWidth, shapeHeight);
        } else {
            g.setColor(Color.RED);
            g.fillRect(shapeX, shapeY, shapeWidth, shapeHeight);
        }
    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (x >= shapeX && x <= shapeX + shapeWidth && y >= shapeY && y <= shapeY + shapeHeight) {
            isDragging = true;
        }
    }

    public void mouseReleased(MouseEvent e) {
        isDragging = false;
    }

    public void mouseDragged(MouseEvent e) {
        if (isDragging) {
            shapeX = e.getX() - shapeWidth / 2;
            shapeY = e.getY() - shapeHeight / 2;
            repaint();
        }
    }

    public void mouseClicked(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Mover");
        ShapeMover panel = new ShapeMover();
        frame.getContentPane().add(panel);
        JButton circleButton = new JButton("Circle");
        circleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.isCircle = true;
                panel.shapeX = WIDTH / 2;
                panel.shapeY = HEIGHT / 2;
                panel.shapeWidth = 50;
                panel.shapeHeight = 50;
                panel.repaint();
            }
        });
        JButton squareButton = new JButton("Square");
        squareButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.isCircle = false;
                panel.shapeX = WIDTH / 2;
                panel.shapeY = HEIGHT / 2;
                panel.shapeWidth = 50;
                panel.shapeHeight = 50;
                panel.repaint();
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(circleButton);
        buttonPanel.add(squareButton);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
