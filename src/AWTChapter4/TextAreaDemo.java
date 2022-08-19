package AWTChapter4;

import java.awt.*;
public class TextAreaDemo
{
    // constructor to initialize
    TextAreaDemo() {
// creating a frame
        Frame f = new Frame();
// creating a text area
        TextArea area = new TextArea("Welcome to javatpoint");
// setting location of text area in frame
        area.setBounds(10, 30, 300, 300);
// adding text area to frame
        f.add(area);
// setting size, layout and visibility of frame
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    // main method
    public static void main(String args[])
    {
        new TextAreaDemo();
    }
}