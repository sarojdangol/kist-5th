package AWTChapter4;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MenuDemo2 {

    public MenuDemo2() {

        Frame f = new Frame("Menu Example");

        f.setSize(400, 400);

        MenuBar menubar = new MenuBar();

        Menu fileMenu = new Menu("File", true);

        Menu editMenu = new Menu("Edit",true);

        Menu helpMenu = new Menu("Help",true);

        menubar.add(fileMenu);

        menubar.add(editMenu);

        menubar.add(helpMenu);

        f.setMenuBar(menubar);

        MenuItem newfile = new MenuItem("New",new MenuShortcut(KeyEvent.VK_N));

        MenuItem openfile = new MenuItem("Open");

        MenuItem newsave = new MenuItem("Save");

        MenuItem newsaveas = new MenuItem("SaveAs");

        MenuItem newexit = new MenuItem("Exit");

        CheckboxMenuItem c1 = new CheckboxMenuItem("Check 1", true);

        CheckboxMenuItem c2 = new CheckboxMenuItem("Check 2");

        fileMenu.add(newfile);

        fileMenu.add(openfile);

        fileMenu.add(newsave);

        fileMenu.add(newsaveas);

        fileMenu.add(newexit);

        fileMenu.add(c1);

        fileMenu.add(c2);

        newsaveas.setEnabled(false);

        f.setLocationRelativeTo(null);

        f.setVisible(true);

    }

    public static void main(String[] args) {

        new MenuDemo2();

    }

}