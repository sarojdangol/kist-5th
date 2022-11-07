package javaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectDBExample {
    public static void main(String[] args) {
        try {
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");
//            Class.forName("com.mysql.cj.jdbc.Driver");

            //get the connection
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/testdb",
                            "root", "root");
            if (connection != null) {
                System.out.println("connected successfully");
            //create the statement
                Statement stmt = connection.createStatement();
                //query
                String query = "CREATE TABLE abcd(firstName varchar(50)," +
                        "lastName varchar(50));";
                //execute the statement
                int res = stmt.executeUpdate(query);
                if (res!=-1){
                    System.out.println(res);
                    System.out.println("table created");
                }
                stmt.close();
                connection.close();
            }
//            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
