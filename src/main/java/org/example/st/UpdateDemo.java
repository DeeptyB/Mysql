package org.example.st;

import org.example.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

    public static final String SQL = "update demo_tbl set user_name = 'Rekha' , password = 're' where id = 2";
    public static void main(String[] args) {

        try (

                Statement st = DbUtil.getConnection().createStatement();
        ) {

            st.executeUpdate(SQL);
            System.out.println("Information is updated.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
