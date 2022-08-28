package AWTChapter4.oldq.q2016;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Q2 {
    Q2(){
        Frame f= new Frame();
        Label l =new Label();
        Choice ch=new Choice();
        ch.add("football");
        ch.add("basketball");
        ch.add("volleyball");
        ch.add("baseball");
        ch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                String s=ch.getSelectedItem();
                l.setText(s);
            }
        });
        f.add(ch);
        f.add(l);
        f.setSize(300,300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Q2();
    }
}

