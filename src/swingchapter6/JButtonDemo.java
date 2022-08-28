package swingchapter6;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo {
    JButtonDemo(){
        JFrame f=new JFrame("Button Example");
        JButton b=new JButton(new ImageIcon("C:\\Users\\user\\Downloads\\download.jpg"));
//        Dimension dimension = new Dimension(100,100);
//        b.setSize(dimension);
        b.setBounds(100,100,100, 40);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonDemo();
    }
}