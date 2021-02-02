package org.example.st;

import org.example.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {
    public static final String SQL = "select * from demo_tbl ";
    public static void main(String[] args) {

        try (

                Statement st = DbUtil.getConnection().createStatement();
        ) {

            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()){
                System.out.println("Id is: " +rs.getInt("id")); //you can give index as well as name of the column
                System.out.println("User Name is: " +rs.getString(2));
                System.out.println("Password is: " +rs.getString(3));
                System.out.println("==========");
            }


            System.out.println("Information is Deleted.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
