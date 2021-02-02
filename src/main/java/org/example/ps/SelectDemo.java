package org.example.ps;

import org.example.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {
    public static final String SQL = "select * from demo_tbl where id = ?";
    public static void main(String[] args) {

        try (

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setInt(1, 2);;
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println("User Name is: " +rs.getString(2));
                System.out.println("Password is: " +rs.getString(3));
                System.out.println("==========");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
