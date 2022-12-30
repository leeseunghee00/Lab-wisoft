package io.wisoft.semiar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentSelectService {
    public void getStudentAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

      try {
          conn = PostgreSqlAccess.setConnection();
          conn.setAutoCommit(false);

          String query = "SELECT * FROM student";
          pstmt = conn.prepareStatement(query);
          rs = pstmt.executeQuery();

          while(rs.next()) {
              System.out.print("[Num] " + rs.getString(1) + " || ");
              System.out.print("[Name] " + rs.getString(2) + " || ");
              System.out.println("[Birth] " + rs.getString(3) + " ");
          }
      } catch (SQLException sqex) {
          System.out.println("SQLException: " + sqex.getMessage());
          System.out.println("SQLState: " + sqex.getSQLState());
      } finally {
          if (rs != null) { try{ rs.close(); } catch (Exception e) { e.printStackTrace(); }}
          if (pstmt != null) { try{ pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
          if (conn != null) { try{ conn.close(); } catch (Exception e) { e.printStackTrace(); }}
      }
    }
    public void getStudentByNo(String studentNo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM student WHERE no = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, studentNo);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.print("[Num] " + rs.getString(1) + " || ");
                System.out.print("[Name] " + rs.getString(2) + " || ");
                System.out.println("[Birth] " + rs.getString(3) + " ");
            }
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (rs != null) { try{ rs.close(); } catch (Exception e) { e.printStackTrace(); }}
            if (pstmt != null) { try{ pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
            if (conn != null) { try{ conn.close(); } catch (Exception e) { e.printStackTrace(); }}
        }
    }
    public void getStudentByName(String studentName){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM student WHERE name = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, studentName);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.print("[Num] " + rs.getString(1) + " || ");
                System.out.print("[Name] " + rs.getString(2) + " || ");
                System.out.println("[Birth] " + rs.getString(3) + " ");
            }
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (rs != null) { try{ rs.close(); } catch (Exception e) { e.printStackTrace(); }}
            if (pstmt != null) { try{ pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
            if (conn != null) { try{ conn.close(); } catch (Exception e) { e.printStackTrace(); }}
        }
    }
    public void getStudentByBirthday(String studntBirthday){

    }
}
