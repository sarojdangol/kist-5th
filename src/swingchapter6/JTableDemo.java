package swingchapter6;

import javax.swing.*;
public class JTableDemo {
    JFrame f;
    JTableDemo(){
        f=new JFrame();
        String data[][]={ {"101","Ram","670000"},
                {"102","Shyam","780000"},
                {"102","Shyam","780000"},
                {"102","Shyam","780000"},
                {"102","Shyam","780000"},
                {"102","Shyam","780000"},
                {"102","Shyam","780000"},
                {"102","Shyam","780000"},
                {"102","Shyam","780000"},
                {"103","Hari","700000"}};
        String column[]={"ID","NAME","SALARY"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JTableDemo();
    }
}