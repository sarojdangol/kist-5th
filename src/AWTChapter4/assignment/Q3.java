package AWTChapter4.assignment;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Q3 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);

        Choice choice = new Choice();
        choice.add("item1");
        choice.add("item2");
        choice.add("item3");
        choice.add("item4");
        choice.add("item5");
        TextField tf = new TextField(10);
        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String text = choice.getSelectedItem();
                tf.setText(text);
            }
        });
        frame.add(choice);
        frame.add(tf);
         frame.setVisible(true);
    }
}
