package javaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    public static String getConnection(){
        Connection con = null;
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");

             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");

        }catch (Exception e){
            e.printStackTrace();
        }
        if (con != null) {
            return "successfully connected";
        }else {
            return "cannot connect to db";
        }
    }
}
