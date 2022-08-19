package AWTExample;

import java.awt.*;
import java.awt.event.*;
class EventHandlingExample extends Frame implements ActionListener,WindowListener{
    TextField tf;
    EventHandlingExample(){

//create components
        Label l = new Label("message will be shown in the text field");
        l.setBounds(60,25,200, 35);
        tf=new TextField();
        tf.setBounds(60,70,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);

//register listener
        b.addActionListener(this);//passing current instance
        addWindowListener(this);
//add components and set size, layout and visibility
        add(l);
        add(b);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
    public static void main(String args[]){

        new EventHandlingExample();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window is closing");
//        dispose();
        System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("window is closed");

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}