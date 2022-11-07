package javaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveData {
    public static void main(String[] args) {
//load the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // get the connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
            if (connection != null) {
                System.out.println("connected");
            }
//           //create the statement
//            Statement stmt = connection.createStatement();
//            //query
//            String sql = "create database newdb";
//            int result = stmt.executeUpdate(sql);
//            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
