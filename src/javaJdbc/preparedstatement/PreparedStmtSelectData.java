package javaJdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStmtSelectData {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/testdb";
            con = DriverManager.getConnection(url, "root", "root");
            String query = "SELECT * from users where firstname = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, "mat");
            ResultSet res = pstmt.executeQuery();
            if (res.next())
                System.out.println(res.getString(1));
//            System.out.println(res.getString("firstname"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
