package com.zzxx.day29;


import java.sql.*;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        String username=console.nextLine();
        String password=console.nextLine();

        user u=login(username,password);
        System.out.println(u);
    }
    public static user login(String username,String password){
        try {

            Connection con=utils.getConnection();
//            Statement stmt=con.createStatement();
//            String sql="select * from student where name ='"+username+"' and password='"+password+"' ";
//            ResultSet rs=stmt.executeQuery(sql);
            String sql="select * from student where name =? and password=? ";
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            ResultSet rs=pstmt.executeQuery();

            if(rs.next()){
                return new user(rs.getString("name"),rs.getString("password"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }
}
