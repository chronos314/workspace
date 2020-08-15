package com.zzxx.day29;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class utils {
    private static Properties pro;
    static {
        pro = new Properties();
        InputStream is = utils.class.getResourceAsStream("utils.properties");
        try {
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            Class.forName(pro.getProperty("forname"));
            Connection con= DriverManager.getConnection(pro.getProperty("connectionURL"),
                    pro.getProperty("user"),pro.getProperty("password"));
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

}
