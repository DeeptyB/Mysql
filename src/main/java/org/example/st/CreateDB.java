package org.example.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
    public static final String DRIVER ="com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root";
    public static final String SQL = "create database demo_db1";

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement st = null;
        try {
            //Register the Driver
            Class.forName(DRIVER);

            //Obtain Connection of Object
            con = DriverManager.getConnection(URL, USER_NAME,PASSWORD);

            //Obtain Statement Object
            st = con.createStatement();

            //Execute the query
            st.executeUpdate(SQL);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //Close the connection
            con.close();
            st.close();
        }

    }

}
