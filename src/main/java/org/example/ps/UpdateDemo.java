package org.example.ps;

import org.example.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL = "update demo_tbl set user_name = ? , password = ? where id = ?";
    public static void main(String[] args) {

        try (

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "Peter");
            ps.setString(2, "pipi");
            ps.setInt(3, 2);
            ps.executeUpdate();
            System.out.println("Information is updated.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

