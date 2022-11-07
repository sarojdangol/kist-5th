package javaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreate {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            if (conn!=null){
                System.out.println("connected successfully");
            }else {
                System.out.println("cannot connect to db");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        String sql = "create table users" +
                "( firstName varchar(50)," +
                "lastName varchar(50)," +
                "ssn varchar(50)," +
                "city varchar(50)" +
                ");";
        try{
            stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            if (result!=-1){
                System.out.println("created table successfully");
            }else {
                System.out.println("error in creating table");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
