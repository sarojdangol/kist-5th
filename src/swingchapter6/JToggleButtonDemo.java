package swingchapter6;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class JToggleButtonDemo {

    public JToggleButtonDemo(){

        JFrame frame = new JFrame("JLabel and Icon Demi");

        frame.setSize(200, 200);

        frame.setLayout(new FlowLayout());

        JLabel l1=new JLabel("Button is off");

        JToggleButton jtbtn=new JToggleButton("on/off");

        jtbtn.addItemListener(new ItemListener()
        {

            @Override

            public void itemStateChanged(ItemEvent e) {

                if(jtbtn.isSelected()){

                    l1.setText("button is on");

                }else{

                    l1.setText("button is off");

                }

            }

        });

        frame.add(jtbtn);

        frame.add(l1);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new JToggleButtonDemo();

    }

}