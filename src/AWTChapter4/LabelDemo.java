package AWTChapter4;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelDemo {
    public LabelDemo() {
        Frame f = new Frame("Frame");
        Label firstLabel = new Label("this is the first Label");
//        System.out.println(firstLabel.getAlignment());
        f.add(firstLabel);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
//        f.setLayout(new FlowLayout());
        Label msg = new Label();
        msg.setText(f.getLayout().toString());
////        msg.setBounds();
        f.add(msg);
        System.out.println(f.getLayout());
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new LabelDemo();
    }

}
