package AWTChapter4;

import java.awt.*;
import java.awt.event.*;

public class ListExample {
    // class constructor
    ListExample() {

        Frame f = new Frame();
        // creating the label which is final
        final Label label = new Label();

        // setting alignment and size of label
        label.setAlignment(Label.CENTER);
        label.setSize(500, 100);

        // creating a button
        Button b = new Button("Show");

        // setting location of button
        b.setBounds(200, 150, 80, 30);

        final List l1 = new List(4, false);
        l1.setBounds(100, 100, 70, 70);
        l1.add("C");
        l1.add("C++");
        l1.add("Java");
        l1.add("PHP");


        final List l2 = new List(4, true);
        l2.setBounds(100, 200, 70, 70);
        l2.add("Turbo C++");
        l2.add("Spring");
        l2.add("Hibernate");
        l2.add("CodeIgniter");

        // adding List, Label and Button to the frame
        f.add(l1);
        f.add(l2);
        f.add(label);
        f.add(b);

        // setting size, layout and visibility of frame
        f.setSize(450, 450);
        f.setLayout(null);
        f.setVisible(true);

        // generating event on the button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                String data = "Programming language Selected: " + l1.getItem(l1.getSelectedIndex()<1?0:l1.getSelectedIndex());
                String data = "Programming language Selected: " + l1.getSelectedItem();
                data += ", Framework Selected:";
                for (String frame : l2.getSelectedItems()) {
                    data += frame + " ";
                }
                label.setText(data);
            }
        });
    }

    // main method
    public static void main(String args[]) {
        new ListExample();
    }
}