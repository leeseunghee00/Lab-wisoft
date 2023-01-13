package io.wisoft.semiar;

import java.sql.*;

public class BadJdbcExample {
    public static void  main(final String... args){
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://db.nsvvhayzbuwtcrazgbyo.supabase.co:5432/postgres", "postgres", "aa588059246!");

            Statement statement;
            statement = connection.createStatement();

            String query = "SELECT * FROM student";

            ResultSet resultSet;
            resultSet = statement.executeQuery(query);

            while(resultSet.next()) {
                System.out.println("[stunum] " + resultSet.getString(1) + " ||");
                System.out.println("[name] " + resultSet.getString(2) + " ||");
                System.out.println("[birth] " + resultSet.getString(3) + " ||");
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException sqle){
            System.err.println("SQLException: "+sqle.getMessage());
            System.err.println("SQLState: "+sqle.getSQLState());
        }
    }
}
