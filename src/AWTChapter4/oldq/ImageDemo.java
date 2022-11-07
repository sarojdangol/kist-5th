package AWTChapter4.oldq;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDemo extends JFrame implements KeyListener {

    JLabel jl;
    ImageIcon ic;

    ImageDemo() {
        ic = new ImageIcon("C:\\Users\\user\\Downloads\\free.png");
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setLayout(null);

        f.addKeyListener(this);
        jl = new JLabel();
        jl.setBounds(10, 10, 400, 400);
        jl.setIcon(ic);
//		jl.setBackground(Color.green);
//		jl.setOpaque(true);
        f.add(jl);
        f.setVisible(true);


    }

    @Override
    public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("you typed a key having keychar: "+e.getKeyChar());
//		System.out.println("you typed a key having keycode: "+e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37://left
                System.out.println("this is left");

                jl.setLocation(jl.getX() - 10, jl.getY());
                break;
            case 38://up
                System.out.println("this is up");
//                System.out.println(jl.getY());
                jl.setLocation(jl.getX(), jl.getY() - 10);
                break;
            case 39://right
                System.out.println("this is right");

                jl.setLocation(jl.getX() + 10, jl.getY());
                break;
            case 40://down
                System.out.println("this is down");
//                System.out.println(jl.getY());
                jl.setLocation(jl.getX(), jl. getY() + 10);
                break;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
//		System.out.println("you released a key having keychar: "+e.getKeyChar());
//		System.out.println("you released a key having keycode: "+e.getKeyCode());
    }

}