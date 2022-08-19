    package AWTExample;


    import java.awt.*;

    public class First2 extends Frame {
      First2(){
          setTitle("welcome");
          TextField textField = new TextField();
          textField.setBackground(Color.BLACK);
          textField.setBounds(50,50,100,100);
          Button b = new Button();
          b.setLabel("I am button");
          b.setBounds(50,50,100,100);
          add(b);
          add(textField);
          setSize(300,300);
          setLayout(null);
          setVisible(true);
      }

        public static void main(String[] args) {
            new First2();
        }
    }
