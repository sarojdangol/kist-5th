package AWTChapter4.assignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4 {
    public static void main(String[] args) {
        Frame frame = new Frame();
//        frame.setLayout(new FlowLayout());
        frame.setLayout(null);
        frame.setSize(400, 400);
        TextField tf = new TextField(10);
        tf.setBounds(20, 50, 100, 20);
        frame.add(tf);
        Button button = new Button("Get result");
        button.setBounds(150, 50, 100, 20);
        TextField result = new TextField();
        result.setBounds(60, 100, 100, 20);
        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("action performed");
                int value = Integer.parseInt(tf.getText());
//                Q4 obj = new Q4();
                int num = getFactorial(value);
                result.setText(String.valueOf(num));

                System.out.println(num);
                frame.add(result);
            }
        });
        frame.setVisible(true);
    }

    public static int getFactorial(int num) {
        if (num < 1) {
            return 0;
        }
        if (num == 1) {
            return 1;
        } else {
            return (num) * getFactorial(num - 1);
        }
    }
}
