package io.wisoft.semiar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeSelectService {
    public void getEmployeeAll(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM employee";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.print("[Code] " + rs.getString(1) + " ");
                System.out.print("[Name] " + rs.getString(2) + " ");
                System.out.print("[Mgt] " + rs.getString(3) + " ");
                System.out.print("[Sal] " + rs.getInt(4) + " ");
                System.out.println("[Rcode] " + rs.getString(5));
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
    public void getEmployeeByName(String name){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT emp_name FROM employee";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.print("[Code] " + rs.getString(1) + " ");
                System.out.print("[Name] " + rs.getString(2) + " ");
                System.out.print("[Mgt] " + rs.getString(3) + " ");
                System.out.print("[Sal] " + rs.getInt(4) + " ");
                System.out.println("[Rcode] " + rs.getString(5));
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
    public void getEmployeeByCode(String code){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT emp_code FROM employee";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, code);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.print("[Code] " + rs.getString(1) + " ");
                System.out.print("[Name] " + rs.getString(2) + " ");
                System.out.print("[Mgt] " + rs.getString(3) + " ");
                System.out.print("[Sal] " + rs.getInt(4) + " ");
                System.out.println("[Rcode] " + rs.getString(5));
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
    public void getEmployeeByMgt(String mgt){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT emp_mgt FROM employee";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, mgt);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.print("[Code] " + rs.getString(1) + " ");
                System.out.print("[Name] " + rs.getString(2) + " ");
                System.out.print("[Mgt] " + rs.getString(3) + " ");
                System.out.print("[Sal] " + rs.getInt(4) + " ");
                System.out.println("[Rcode] " + rs.getString(5));
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
    public void getEmployeeBySal(Integer sal){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT emp_sal FROM employee";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, sal);
            rs = pstmt.executeQuery();


            while(rs.next()) {
                System.out.print("[Code] " + rs.getString(1) + " ");
                System.out.print("[Name] " + rs.getString(2) + " ");
                System.out.print("[Mgt] " + rs.getString(3) + " ");
                System.out.print("[Sal] " + rs.getInt(4) + " ");
                System.out.println("[Rcode] " + rs.getString(5));
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
    public void getEmployeeByRcode(String rcode){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT emp_rcode FROM employee";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, rcode);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.print("[Code] " + rs.getString(1) + " ");
                System.out.print("[Name] " + rs.getString(2) + " ");
                System.out.print("[Mgt] " + rs.getString(3) + " ");
                System.out.print("[Sal] " + rs.getInt(4) + " ");
                System.out.println("[Rcode] " + rs.getString(5));
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
}
