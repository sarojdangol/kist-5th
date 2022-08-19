package AWTChapter4;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxDemo {
    public CheckBoxDemo() {
        Frame frame = new Frame("Java AWT Examples");
        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(1, 5));
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        Checkbox cb1 = new Checkbox();
        Checkbox cb2 = new Checkbox("CheckBox 2");
        Checkbox cb3 = new Checkbox("CheckBox 3", true);
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox cb4 = new Checkbox("CheckBox 11", false, cg);
        Checkbox cb5 = new Checkbox("CheckBox 12", cg, false);
        Checkbox cb6 = new Checkbox("CheckBox 13", cg, true);
        cb1.setLabel("Checkbox1");
        cb3.setState(false);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);
        frame.add(cb4);
        frame.add(cb5);
        frame.add(cb6);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}
