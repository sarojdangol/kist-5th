package AWTChapter4;

import java.awt.*;
import java.awt.event.*;
public class DialogBoxExample {
    private  Dialog d;
    private  Dialog d1;
    DialogBoxExample() {
        Frame f= new Frame();
        d = new Dialog(f , "Dialog Example", true);
        d.setLayout( new FlowLayout() );
        Button b = new Button ("OK");
        b.addActionListener ( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                d1 = new Dialog(new Frame(), "Dialog Example", true );
                d1.setLayout( new FlowLayout() );
                d1.setSize(150,150);
                d1.setVisible(true);
//                d.setVisible(false);
            }
        });
        d.add( new Label ("Click button to continue."));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }
    public static void main(String args[])
    {
        new DialogBoxExample();
    }
}
