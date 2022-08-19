package AWTExample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogExample {
    private static Dialog d;
    DialogExample() {
        Frame f= new Frame();

        Button b = new Button ("OK");
        b.addActionListener ( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
//                DialogExample.d.dispose();
                d = new Dialog(new Frame(), "Dialog Example", true );
                d.setLayout( new FlowLayout() );
//                d.add(b);
                d.setSize(300,300);
                d.setVisible(true);
//                d.setVisible(false);
            }
        });
        f.add( new Label ("Click button to continue."));
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);

    }
    public static void main(String args[])
    {

        new DialogExample();
    }
}
