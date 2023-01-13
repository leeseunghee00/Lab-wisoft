package io.wisoft.semiar.training;

import io.wisoft.semiar.PostgreSqlAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TrainDeleteService {
    public void solvQue15 (String empName) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "DELETE FROM employee WHERE emp_name = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, empName);

            int retValue = pstmt.executeUpdate();
            conn.commit();
            System.out.println(retValue+"건의 사항이 처리되었습니다.");

        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (pstmt != null) { try{ pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
            if (conn != null) { try{ conn.close(); } catch (Exception e) { e.printStackTrace(); }}
        }
    }
}
