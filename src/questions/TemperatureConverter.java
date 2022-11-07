package questions;


import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class  TemperatureConverter extends JFrame  {
    JLabel l1, l2, l3;
    JComboBox bx1, bx2;
    JTextField t1, t2;
    JButton b;
    ButtonListener buttonListener;



    TemperatureConverter() {
        JFrame f = new JFrame("temperature converter");


        l1=new JLabel("Temperature:  ");
        l1.setBounds(10,20,100,30);
        l2=new JLabel("Convert to:");
        l2.setBounds(10,50,100,30);
        l3=new JLabel("output:");
        l3.setBounds(10,110,100,30);

        t1=new JTextField("",10);
        t1.setBounds(100,25,100,30);

        t2=new JTextField("",10);
        t2.setBounds(100,110,200,30);


        String unit[] = {"celsius","kelvin","fahrenheit"};
        bx1=new JComboBox(unit);
        bx1.setBounds(300,20,90,20);

        String unit1[] = {"celsius","kelvin","fahrenheit"};
        bx2=new JComboBox(unit1);
        bx2.setBounds(100,60,90,20);

        JButton b = new JButton("Convert");
        b.setBounds(220,220,95,30);
        buttonListener = new ButtonListener();
        b.addActionListener(buttonListener);


        f.add(l1); f.add(l2); f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(bx1);
        f.add(bx2);
        f.add(b);
        t2.setEditable(false);

        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("this is button");
            String temp = (String) bx1.getSelectedItem();
            String tempConvert = (String) bx2.getSelectedItem();

            if(temp.equalsIgnoreCase("Celsius") && tempConvert.equalsIgnoreCase("Fahrenheit")){
                double c = Double.parseDouble(t1.getText());
                double f = (double) (c*1.8+32);
                t2.setText("hello world");
                t2.setText(String.valueOf(f));
            }
            else if (temp.equalsIgnoreCase("Celsius") && tempConvert.equalsIgnoreCase("Kelvin")) {
                double c = Double.parseDouble(t1.getText());
                double k = (double) (c+273);
                t2.setText(String.valueOf(k));
            }
            else if (temp.equalsIgnoreCase("Celsius") && tempConvert.equalsIgnoreCase("Celsius")) {
                double c = Double.parseDouble(t1.getText());
                t2.setText(String.valueOf(c));
            }

            if(temp.equalsIgnoreCase("Fahrenheit") && tempConvert.equalsIgnoreCase("Celsius")) {
                double f = Double.parseDouble(t1.getText());
                double c = (double)((f - 32)*5/9);
                t2.setText(String.valueOf(c));
            }
            else if(temp.equalsIgnoreCase("Fahrenheit") && tempConvert.equalsIgnoreCase("Kelvin")) {
                double f = Double.parseDouble(t1.getText());
                double k = (double)((f - 32)*5/9 + 273.15);
                t2.setText(String.valueOf(k));
            }
            else if(temp.equalsIgnoreCase("Fahrenheit") && tempConvert.equalsIgnoreCase("Fahrenheit")) {
                double f = Double.parseDouble(t1.getText());
                t2.setText(String.valueOf(f));
            }

            if(temp.equalsIgnoreCase("Kelvin") && tempConvert.equalsIgnoreCase("Fahrenheit")) {
                double k = Double.parseDouble(t1.getText());
                double f = (double) ((k*(9/5))-459.67);
                t2.setText(String.valueOf(f));
            }
            else if (temp.equalsIgnoreCase("Kelvin") && tempConvert.equalsIgnoreCase("Kelvin")) {
                double k = Double.parseDouble(t1.getText());
                t2.setText(String.valueOf(k));
            }
            else if (temp.equalsIgnoreCase("Kelvin") && tempConvert.equalsIgnoreCase("Celcius")) {
                double k = Double.parseDouble(t1.getText());
                double c = (double) (k-273);
                t2.setText(String.valueOf(c));
            }
        }
    }


    public static void main(String[] args){

        new TemperatureConverter();
    }

}