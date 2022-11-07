package javaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        Statement stmt = null;
//       String connectionMsg= ConnectDB.getConnection();
//        System.out.println(connectionMsg);
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
            if (conn != null) {
                System.out.println("connected successfully");
            } else {
                System.out.println("cannot connect to db");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql = "INSERT INTO USERS VALUES('DANGOL','SAROJ','12345','KTM')";
        try {
            stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            if (result > 0) {
                System.out.println(result);
                System.out.println("inserted data successfully");
            } else {
                System.out.println("cannot insert data");
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
