package javaJdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStmtInsertData {
    public static void main(String[] args) {
//        System.out.println(6-5-4);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
            PreparedStatement pstmt= connection.prepareStatement("insert into users values(?,?,?,?)");
            pstmt.setString(1,"kist");
            pstmt.setString(2,"kist");
            pstmt.setString(3,"kist");
            pstmt.setString(4,"kist");

            int result= pstmt.executeUpdate();
            System.out.println(result);
        } catch (Exception e) {

        }

    }
}
