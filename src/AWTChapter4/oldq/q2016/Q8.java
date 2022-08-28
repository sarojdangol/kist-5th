package AWTChapter4.oldq.q2016;

import java.awt.*;

public class Q8 {
    Q8(){
        Frame f = new Frame();
        f.setSize(400, 400);
        f.setLayout(new BorderLayout());
        Button b = new Button("One");
        Button b1 = new Button("Two");
        Button b2 = new Button("Three");
        Button b3 = new Button("Four");
        Button b4 = new Button("Five");
        f.add(b, BorderLayout.CENTER);
        f.add(b1, BorderLayout.EAST);
        f.add(b2, BorderLayout.WEST);
        f.add(b3, BorderLayout.SOUTH);
        f.add(b4, BorderLayout.NORTH);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Q8();
    }
}
