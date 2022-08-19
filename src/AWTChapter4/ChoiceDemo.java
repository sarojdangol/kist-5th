package AWTChapter4;

import java.awt.*;

public class ChoiceDemo {

    // class constructor
    ChoiceDemo() {

        // creating a frame
        Frame f = new Frame();
        // creating a choice component
        Choice c = new Choice();
        // setting the bounds of choice menu
        c.setBounds(100, 100, 75, 75);
        // adding items to the choice menu
        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        c.add("Item 4");
        c.add("Item 5");
        c.select("Item 8");
        Label l = new Label();
        l.setText(String.valueOf(c.getItemCount()));
        f.add(l);
        System.out.println(c.getItemCount());
        System.out.println(c.getSelectedItem());
        // adding choice menu to frame
        f.add(c);

        // setting size, layout and visibility of frame
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    // main method
    public static void main(String args[]) {
        new ChoiceDemo();
    }
}