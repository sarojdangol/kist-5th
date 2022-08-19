import java.awt.*;
import java.awt.event.*;

public class MouseEventHandling {
    private Frame f;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    private Label statusLabel1;

    public MouseEventHandling() {
        f = new Frame("Java MouseEvent Examples");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(3, 1));
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        f.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
//        f.addWindowListener(new WindowListener() {
//            @Override
//            public void windowOpened(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowClosing(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowClosed(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowIconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeiconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowActivated(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeactivated(WindowEvent e) {
//
//            }
//        });
        headerLabel = new Label("MouseListener", Label.CENTER);
        statusLabel = new Label("", Label.CENTER);
        statusLabel1 = new Label("", Label.CENTER);
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        f.add(headerLabel);
        f.add(controlPanel);
        f.add(statusLabel);
        f.add(statusLabel1);
        Panel panel = new Panel();
        panel.setBackground(Color.cyan);

        panel.setLayout(null);
        panel.setBounds(40,80,200,200);

        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
//                statusLabel.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                statusLabel.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
//                statusLabel.setText("Mouse Entered");

            }

                @Override
                public void mouseExited(MouseEvent e) {
    //                statusLabel.setText("Mouse Exited");

                }
        });
        Label msglabel = new Label();
        msglabel.setAlignment(Label.CENTER);
        msglabel.setText("Welcome to MouseEvent Demo");
        msglabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel1.setText("Mouse Clicked in the msg label: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                statusLabel1.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                statusLabel1.setText("Mouse Released");

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                statusLabel1.setText("Mouse Entered");

            }

            @Override
            public void mouseExited(MouseEvent e) {
                statusLabel1.setText("Mouse Exited");

            }
        });
        f.add(msglabel);
        controlPanel.add(panel);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventHandling();
    }
}

