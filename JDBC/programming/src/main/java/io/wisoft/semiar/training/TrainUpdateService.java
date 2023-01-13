package io.wisoft.semiar.training;

import io.wisoft.semiar.PostgreSqlAccess;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TrainUpdateService {
    public void solvQue12 (String drmOpdate){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "UPDATE DRAMA SET DRM_OPDATE = ? WHERE DRM_OPDATE IS NULL";
            pstmt = conn.prepareStatement(query);

            pstmt.setDate(1, Date.valueOf(drmOpdate));

            int retValue = pstmt.executeUpdate();
            conn.commit();

            System.out.println(retValue + "건의 사항이 처리되었습니다.");
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (pstmt != null) { try{ pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
            if (conn != null) { try{ conn.close(); } catch (Exception e) { e.printStackTrace(); }}
        }
    }

    public void solvQue13 (String empName, String empRname, double empSal){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "UPDATE EMPLOYEE " +
                    "SET EMP_RCODE = (SELECT EMP_RCODE FROM EMP_ROLE WHERE EMP_RNAME = ?), EMP_SAL = EMP_SAL * ? " +
                    "WHERE EMP_NAME = ?";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, empRname);
            pstmt.setDouble(2, empSal);
            pstmt.setString(3, empName);

            int retValue = pstmt.executeUpdate();
            conn.commit();

            System.out.println(retValue + "건의 사항이 처리되었습니다.");
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (pstmt != null) { try{ pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
            if (conn != null) { try{ conn.close(); } catch (Exception e) { e.printStackTrace(); }}
        }
    }
}
