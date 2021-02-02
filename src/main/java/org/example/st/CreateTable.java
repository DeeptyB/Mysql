package org.example.st;

import org.example.util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static final String SQL = "create table demo_tblTest(id int not null auto_increment,user_name varchar(50),password varchar(40), primary key (id))";

    public static void main(String[] args) {

        try (

                Statement st = DbUtil.getConnection().createStatement();
                ){

            st.executeUpdate(SQL);
            System.out.println("Table is created.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}


