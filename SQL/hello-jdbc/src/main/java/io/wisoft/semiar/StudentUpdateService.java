package io.wisoft.semiar;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentUpdateService {
    public void updateStudentBirthday(String no, String birthday){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "UPDATE STUDENT SET BIRTHDAY = ? WHERE NO = ?";
            pstmt = conn.prepareStatement(query);

            pstmt.setDate(1, Date.valueOf(birthday));
            pstmt.setString(2, no);

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

    // overloading
    public void updateStudentBirthday(Student student){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "UPDATE STUDENT SET BIRTHDAY = ? WHERE NO = ?";
            pstmt = conn.prepareStatement(query);

            pstmt.setDate(1, Date.valueOf(student.getBrithday()));
            pstmt.setString(2, student.getNo());

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

    public void updateStudentBirthdayMultiBatch(Student[] students){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "UPDATE STUDENT SET BIRTHDAY = ? WHERE NO = ?";
            pstmt = conn.prepareStatement(query);

            for(int i = 0; i < students.length; i++){
                if (students[i].getNo() == null && students[i].getBrithday() == null)
                    break;

                pstmt.setDate(1, Date.valueOf(students[i].getBrithday()));
                pstmt.setString(2, students[i].getNo());

                pstmt.addBatch();
                pstmt.clearParameters();
            }

            int[] retValue = pstmt.executeBatch();
            conn.commit();
            System.out.println(retValue.length + "건의 사항이 처리되었습니다.");
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (pstmt != null) { try{ pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
            if (conn != null) { try{ conn.close(); } catch (Exception e) { e.printStackTrace(); }}
        }
    }
}
