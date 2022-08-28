package AWTChapter4.oldq.q20162;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 {
    Q2(){
        Frame f=new Frame();
        f.setSize(300,300);
        f.setLayout(new FlowLayout());

        Label first=new Label("letter1");
        Label second=new Label("letter2");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b=new Button("switch");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                     String temp=t1.getText();
                     String temp2=t2.getText();
                     int tempo=Integer.parseInt(temp)+Integer.parseInt(temp2);
                     Label lone=new Label(String.valueOf(tempo));
                     f.add(lone);

            }
        });
        f.add(first);
        f.add(t1);
        f.add(second);
        f.add(t2);
        f.add(b);
        f.setVisible(true);

    }

    public static void main(String[] args) {
      new Q2();
    }
}
