package javaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DropDB {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
            if (connection != null) {
                System.out.println("connected successfully");
            } else {
                throw new RuntimeException("error in connection");
            }
            String sql = "drop DATABASE newdb";
            Statement statement = connection.createStatement();
            int res = statement.executeUpdate(sql);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
