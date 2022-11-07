package javaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnExample {
    public static void main(String[] args) throws Exception {

            Class.forName("com.mysql.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/testdb";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
//            System.out.println(con);
        if (con!=null){
            System.out.println("successfully connected");
        }
    }
}
