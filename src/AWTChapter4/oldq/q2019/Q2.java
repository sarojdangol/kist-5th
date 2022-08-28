package AWTChapter4.oldq.q2019;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 {
    Q2() {
        Frame f = new Frame();
        Button b = new Button("red");
        Button c = new Button("green");
        Button d = new Button("blue");
        f.add(b);
        f.add(c);
        f.add(d);
        Label l = new Label("rubesh hero");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                l.setForeground(Color.red);

            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                l.setForeground(Color.green);

            }
        });
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                l.setForeground(Color.blue);

            }
        });
        f.add(l);
        f.setSize(300, 300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Q2();
    }
}