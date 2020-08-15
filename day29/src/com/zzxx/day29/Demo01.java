package com.zzxx.day29;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {
    @Test
    public void testDDL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_day01?serverTimezone=GMT", "root", "123");
            Statement stmt=con.createStatement();
            String sql="create table u(id int primary key,name varchar(20))";
            stmt.execute(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Test
    public void testDML(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_day01?serverTimezone=GMT", "root", "123");
            Statement stmt=con.createStatement();
            String sql="insert into u values (1,'张三')";
            stmt.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Test
    public void testDQL(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_day01?serverTimezone=GMT", "root", "123");
            Statement stmt=con.createStatement();
            String sql="select * from u";
            stmt.executeQuery(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
