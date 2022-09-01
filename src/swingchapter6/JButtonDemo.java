package swingchapter6;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo {
    JButtonDemo(){
        JFrame f=new JFrame("Button Example");
        JButton button = new JButton(" Hello");
        ImageIcon icon = new ImageIcon("C:\\Users\\user\\Downloads\\download.jpg");
        JButton b=new JButton(icon);
        JLabel l=new JLabel("Register",new ImageIcon("C:\\Users\\user\\Downloads\\download.jpg"),SwingConstants.LEFT);
//        b.setSize(dimension);
        b.setBounds(100,100,100, 40);
        l.setBounds(100,160,100, 40);
        f.add(b);
        f.add(l);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonDemo();
    }
}