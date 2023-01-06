package io.wisoft.semiar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSqlAccess {
    private static Connection conn = null;

    public void init(){
        try{
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection setConnection(){
        String url = "jdbc:postgresql://db.nsvvhayzbuwtcrazgbyo.supabase.co:5432/postgres";
        String username = "postgres";
        String password = "aa588059246!";

        try{
            conn = DriverManager.getConnection(url, username, password);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}
