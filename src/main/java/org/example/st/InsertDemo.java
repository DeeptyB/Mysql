package org.example.st;

import org.example.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static final String SQL = "insert into demo_tbl(user_name, password) values ('Rita' , 'rt')";

    public static void main(String[] args) {

        try (

                Statement st = DbUtil.getConnection().createStatement();
        ) {

            st.executeUpdate(SQL);
            System.out.println("Information is inserted.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
