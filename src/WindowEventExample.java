import java.awt.*;
import java.awt.event.*;

public class WindowEventExample {
    private Frame mainFrame,aboutFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    public WindowEventExample() {
        mainFrame = new Frame("Java AWT Examples");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        headerLabel = new Label("WindowListener", Label.CENTER);
        statusLabel = new Label("", Label.CENTER);
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);

        aboutFrame = new Frame("WindowListener Demo");
        aboutFrame.setSize(300, 200);;
        aboutFrame.addWindowListener(new CustomWindowListener());
        Label msgLabel = new Label("Welcome.");
        msgLabel.setAlignment(Label.CENTER);
        msgLabel.setSize(100, 100);
        aboutFrame.add(msgLabel);
        aboutFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new WindowEventExample();
    }

    class CustomWindowListener implements WindowListener, ActionListener {

        public void windowOpened(WindowEvent e) {
            statusLabel.setText("Window Opened");
        }


        public void windowClosing(WindowEvent e) {
            statusLabel.setText("Window closing");
            System.out.println("window closing");
            aboutFrame.dispose();
        }
        public void windowClosed(WindowEvent e) {
            statusLabel.setText("Window closed");
        }
        public void windowIconified(WindowEvent e) {
            System.out.println("this is window iconified");
            mainFrame.setIconImage(null);
        }

           public void windowDeiconified(WindowEvent e) {
            statusLabel.setText("Window deiconified");
            System.out.println("this is window deiconified");
            System.out.println( e.getSource().toString());
        }

        public void windowActivated(WindowEvent e) {
            statusLabel.setText("Window activated");
        }
        public void windowDeactivated(WindowEvent e) {
            statusLabel.setText("Window deactivated");
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            statusLabel.setText("action performed");
            System.out.println("Action erformed");
        }
    }
}




