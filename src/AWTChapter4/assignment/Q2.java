package AWTChapter4.assignment;

import java.awt.*;

public class Q2 {
    public static void main(String[] args) {
        Frame frame = new Frame("title");
        frame.setLayout(new FlowLayout());
        frame.setSize(400,400);

        CheckboxGroup cg = new CheckboxGroup();
        Checkbox c1= new Checkbox("male",cg,false);
        Checkbox c2= new Checkbox("female",cg,true);
        Checkbox c3= new Checkbox("others",cg,false);

        Checkbox checkbox1= new Checkbox("checkbox1");
        Checkbox checkbox2= new Checkbox("checkbox2");
        Checkbox checkbox3= new Checkbox("checkbox3");
        Checkbox checkbox4= new Checkbox("checkbox4");
        Checkbox checkbox5= new Checkbox("checkbox5");

        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);
        frame.add(checkbox4);
        frame.add(checkbox5);
        frame.setVisible(true);
    }
}
