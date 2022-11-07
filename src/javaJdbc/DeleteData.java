package javaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            if (connection!=null){
                System.out.println("connected successfully");
            }else {
                throw new RuntimeException("error in connection");
            }
            Statement stmt= connection.createStatement();
            String sql = "DELETE from USERS";
            int result = stmt.executeUpdate(sql);
            System.out.println(result);
            if (result>=0){
                System.out.println("successfully deleted");
            }else {
                System.out.println("couldn't operate query");
            }
            stmt.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
