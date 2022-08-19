
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener {
    int x = 0, y = 0;
    String strEvent = "";
    MouseEventDemo(String title) {
        super(title);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        addMouseListener(this);
        setSize(300, 300);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        strEvent = "MouseClicked";
        x = e.getX();
        y = getY();
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        strEvent = "MousePressed";
        x = e.getX();
        y = getY();
        repaint();

    }

    public void mouseReleased(MouseEvent e) {
        strEvent = "MouseReleased";
        x = e.getX();
        y = getY();
        repaint();

    }
    public void mouseEntered(MouseEvent e) {
        strEvent = "MouseEntered";
        x = e.getX();
        y = e.getY();
        repaint();

    }
    public void mouseExited(MouseEvent e) {
        strEvent = "MouseExited";
        x = e.getX();
        y = getY();
        repaint();
    }
    public void paint(Graphics g) {
        g.drawString(strEvent + " at " + x + "," + y, 50, 50);
    }
    public static void main(String[] args) {
        new MouseEventDemo("Window With Mouse Events Example");
    }

}

