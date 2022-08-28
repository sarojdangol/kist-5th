package AWTChapter4.oldq.q20162;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q7 {
    Q7(){
        Frame f = new Frame();
       CheckboxGroup cg = new CheckboxGroup();
       Checkbox c1 = new Checkbox("male",cg,false);
       Checkbox c2= new Checkbox("female",cg,false);
       Checkbox c3 = new Checkbox("ii",cg,true);
       f.add(c1);
       f.add(c2);
       f.add(c3);
       f.setVisible(true);
       f.setSize(300,300);
       f.setLayout(new FlowLayout());
       f.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
       });





    }

    public static void main(String[] args) {
        new Q7();
    }
}
