package com.zzxx.day29;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DemoStaff {
    @Test
    public void test01(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_day01?serverTimezone=GMT", "root", "123");
            Statement stmt=con.createStatement();
            String sql="select empno,ename,job from emp";
            ResultSet rs=stmt.executeQuery(sql);
            List<Staff> list=new ArrayList<>();
            while(rs.next()){
                list.add(new Staff(rs.getInt("empno"),
                        rs.getString("ename"),
                        rs.getString("job")));
            }
            System.out.println(list.get(0));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
