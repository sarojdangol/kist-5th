package AWTChapter4.oldq.q2018;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q6 {
    public Q6(){
        Frame f = new Frame();
        TextField t1 = new TextField(10);
        Button b1 = new Button("OK");
        Button b2 = new Button("Clear");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t1.setText("Welcome");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t1.setText("");
            }
        });

        f.add(t1);
        f.add(b1);
        f.add(b2);

        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);


    }

















//    Q6(){
//        Frame frame = new Frame();
//        TextField t1=new TextField(10);
//        Button b1=new Button("ok");
//        Button b2=new Button("clear");
//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                t1.setText("welcome");
//            }
//        });
//        b2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                t1.setText("");
//            }
//        });
//        frame.add(t1);
//        frame.add(b1);
//        frame.add(b2);
//        frame.setLayout(new FlowLayout());
//        frame.setSize(300,300);
//        frame.setVisible(true);
//
//
//    }
//
    public static void main(String[] args) {
        new Q6();
    }
}
