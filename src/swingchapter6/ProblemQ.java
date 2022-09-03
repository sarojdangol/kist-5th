package swingchapter6;

import javax.swing.*;
import java.awt.event.*;

public class ProblemQ {
    public ProblemQ(){
        JFrame fr = new JFrame();

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();

        JButton sum = new JButton("+");
        JButton difference = new JButton("-");
        JButton product = new JButton("*");
        JButton quotient = new JButton("/");
        JButton remainder = new JButton("%");

        JLabel result = new JLabel();

        //Adding events to buttons
        sum.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(num1.getText());
                System.out.println(num2.getText());
                int inp1 = Integer.parseInt(num1.getText());
                int inp2 = Integer.parseInt(num2.getText());
                System.out.println(""+(inp1+inp2));

                result.setText("The sum is "+String.valueOf(inp1+inp2));

            }
        });


        difference.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(num1.getText());
                System.out.println(num2.getText());
                int inp1 = Integer.parseInt(num1.getText());

                int inp2 = Integer.parseInt(num2.getText());
                result.setText("The difference is "+String.valueOf(inp1-inp2));
            }
        });


        product.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int inp1 = Integer.parseInt(num1.getText());
                int inp2 = Integer.parseInt(num2.getText());
                result.setText("The product is "+String.valueOf(inp1*inp2));

            }
        });


        quotient.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int inp1 = Integer.parseInt(num1.getText());
                int inp2 = Integer.parseInt(num2.getText());
                result.setText("The quotient is "+String.valueOf(inp1/inp2));

            }
        });


        remainder.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int inp1 = Integer.parseInt(num1.getText());
                int inp2 = Integer.parseInt(num2.getText());
                result.setText("The remainder is "+String.valueOf(inp1%inp2));

            }
        });

        //Adding input fields
        num1.setBounds(100,100,150,70);
        fr.add(num1);
        num2.setBounds(400,100,150,70);
        fr.add(num2);

        //Adding buttons
        sum.setBounds(100,300,120,70);
        fr.add(sum);

        difference.setBounds(220,300,120,70);
        fr.add(difference);

        product.setBounds(340,300,120,70);
        fr.add(product);

        quotient.setBounds(460,300,120,70);
        fr.add(quotient);

        remainder.setBounds(580,300,120,70);
        fr.add(remainder);

        result.setBounds(300,500, 150,70);
        fr.add(result);

        fr.setLayout(null);
        fr.setSize(400,400);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new ProblemQ();
    }

}