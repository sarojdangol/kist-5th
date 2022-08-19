package AWTChapter4.assignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q1 {
    Q1() {
        Frame frame = new Frame("title");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        Label l1 = new Label("first num");
        frame.add(l1);

        TextField t1 = new TextField(10);
        frame.add(t1);

        Label l2 = new Label("second num");
        frame.add(l2);

        TextField t2 = new TextField(10);
        frame.add(t2);

        Button b = new Button("add");
        frame.add(b);
        Label result = new Label();
        Dimension d = new Dimension(100,100);
        result.setPreferredSize(d);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                result.setText("The result is ".concat(String.valueOf(num1+num2)));
                frame.add(result);
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Q1();
    }
}


//    Q1() {
//        Frame frame = new Frame("title");
//        frame.setLayout(new FlowLayout());
//        frame.setSize(400, 400);
//        Label l1 = new Label("First num");
//        frame.add(l1);
//
//        TextField t1 = new TextField(10);
//        frame.add(t1);
//
//        Label l2 = new Label("second num");
//        frame.add(l2);
//
//        TextField t2 = new TextField(10);
//        frame.add(t2);
//
//        Button button = new Button("add");
//        frame.add(button);
//
//        Label result = new Label();
//
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int num1 = Integer.parseInt(t1.getText());
//                int num2 = Integer.parseInt(t2.getText());
//                result.setText("the result is ".concat(String.valueOf(num1+num2)));
//                frame.add(result);
//            }
//        });
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Q1();
//    }
//
//
//}
//    Q1(){
//        Frame f= new Frame("title");
//        f.setSize(400,400);
//        f.setLayout(new FlowLayout());
//        Label l1 = new Label("first num");
//        TextField t1= new TextField(5);
//        Label l2 = new Label("second num");
//        TextField t2 = new TextField(5);
//        Button b = new Button("Add");
//        f.add(l1);
//        f.add(t1);
//        f.add(l2);
//        f.add(t2);
//        f.add(b);
//        Label result = new Label();
//        Dimension d = new Dimension(100,100);
//        result.setPreferredSize(d);
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int n1 = Integer.parseInt(t1.getText());
//                int n2 = Integer.parseInt(t2.getText());
//                result.setText("The result is "+(n1+n2));
//
//            }
//        });
//        f.add(result);
//        f.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
//        f.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Q1();
//    }
//}
