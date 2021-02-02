package org.example.ps;

import org.example.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
    public static final String SQL = "delete from demo_tbl where id = ?";
    public static void main(String[] args) {

        try (

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setInt(1, 4);
            ps.executeUpdate();
            System.out.println("Information is Deleted.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
