package AWTChapter4.layoutdemo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDemo {
    public BorderLayoutDemo() {
        Frame f = new Frame("Layout Demo");
//        f.setLayout(new BorderLayout());
        f.setLayout(new BorderLayout(20, 10));

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");


        f.add(b1, BorderLayout.CENTER);
        f.add(b2, BorderLayout.EAST);
        f.add(b3, BorderLayout.WEST);
        f.add(b4, BorderLayout.NORTH);
//        f.add(b5);
        f.add(b5, BorderLayout.SOUTH);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}


