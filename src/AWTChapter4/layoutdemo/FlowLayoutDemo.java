package AWTChapter4.layoutdemo;


import java.awt.*;
import java.awt.event.*;

class FlowLayoutDemo {
    public FlowLayoutDemo() {
        Frame f = new Frame();
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

//        FlowLayout flowLayout = new FlowLayout();
//        f.setLayout(flowLayout);
        System.out.println(f.getLayout());
        Label l = new Label("first");
        Button b = new Button("button");
        TextField t = new TextField("Textfield");
        TextField t1 = new TextField("Textfield1");
        TextField t2 = new TextField("Textfield2");
        TextField t3 = new TextField("Textfield3");

        TextField t4 = new TextField("Textfield4");
        TextField t5 = new TextField("Textfield5");

        f.add(l);
        f.add(b);
        f.add(t);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
