package org.example.st;

import org.example.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {
    public static final String SQL = "delete from demo_tbl where id = 3";
    public static void main(String[] args) {

        try (

                Statement st = DbUtil.getConnection().createStatement();
        ) {

            st.executeUpdate(SQL);
            System.out.println("Information is Deleted.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
