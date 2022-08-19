import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JButton b1;
    JTextField t1,t2;
    JLabel label;

    Test()
    {
        l1=new JLabel("INPUT 1");
        l2=new JLabel("INPUT 2");
        l3=new JLabel("Result");
        b1=new JButton("Add");

        t1=new JTextField(10);
        t2=new JTextField(10);
        label=new JLabel();

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(label);
        add(b1);

        b1.addActionListener(this);

        setSize(200,200);
        setLayout(new FlowLayout());
        setTitle("Adding the number");
    }

    public void actionPerformed(ActionEvent ae)
    {
        float a,b,c;
        if(ae.getSource()==b1)
        {
            a=Float.parseFloat(t1.getText());
            b=Float.parseFloat(t2.getText());
            c=a+b;
            label.setText(String.valueOf(c));

        }


    }

    public static void main(String args[])
    {
        Test a=new Test();
        a.setVisible(true);
        a.setSize(400,400);

    }


}
