package AWTChapter4.layoutdemo;

import java.awt.*;

import javax.swing.*;

public class GridBagLayoutDemo extends Frame {
    public static void main(String[] args) {

        GridBagLayoutDemo a = new GridBagLayoutDemo();
    }
    public GridBagLayoutDemo() {
//        GridBagLayout grid = new GridBagLayout();
//        setLayout(grid);
        setTitle("GridBag Layout Example");

        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(new Button("Button One"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(new Button("Button two"), gbc);
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(new Button("Button Three"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(new Button("Button Four"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
//        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        this.add(new Button("Button Five"), gbc);
        setSize(300, 300);
        setPreferredSize(getSize());
        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

}