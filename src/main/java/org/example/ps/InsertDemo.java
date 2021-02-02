package org.example.ps;

import org.example.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static final String SQL = "insert into demo_tbl(user_name, password) values (? ,?)";

    public static void main(String[] args) {

        try (

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "Sita");
            ps.setString(2, "sisi");
            ps.executeUpdate();

            System.out.println("Information is inserted through Prepared Statement.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
