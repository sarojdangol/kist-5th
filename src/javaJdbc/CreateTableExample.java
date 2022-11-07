package javaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {
    public static void main(String[] args) {
        Connection connection=null;
        try {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Class.forName("com.mysql.jdbc.Driver");

            //get the connection
            String url = "jdbc:mysql://localhost:3306/testdb";
            String username = "root";
            String password = "root";
             connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("connected to db");
            }
            //create the statement
            Statement stmt= connection.createStatement();

            String query= "Create table kist(name varchar(50), address varchar(50));";
            // execute the statement
            int result = stmt.executeUpdate(query);

            System.out.println(result);
            stmt.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
