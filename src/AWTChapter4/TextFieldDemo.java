package AWTChapter4;

// importing AWT class
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldDemo {
    // main method
    public static void main(String args[]) {
        // creating a frame
        Frame f = new Frame("TextField Example");

        TextField t1, t2;

        t1 = new TextField("Welcome to Javatpoint.");
//        System.out.println(t1.getColumns());
        t1.setBounds(50, 100, 200, 30);
//        t2 = new TextField("AWT Tutorial");
        t2 = new TextField("1234567890123456",15);
//        System.out.println(t2.getColumns());
        t2.setEchoChar('*');
//        t2.getEchoChar();
        t2.setBounds(50, 150, 200, 30);
        t2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                Label l= new Label();
                l.setText("key typed");
                l.setBounds(50,200,100,30);
                f.add(l);
            }
        });
        f.add(t1);
        f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}