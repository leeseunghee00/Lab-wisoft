package io.wisoft.semiar;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class StudentInsertService {
    public void insertStudent (Student student){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "INSERT INTO STUDENT(NO, NAME, BIRTHDAY) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, student.getNo());
            pstmt.setString(2, student.getName());

            if(student.getBrithday() == null){
                pstmt.setNull(3, Types.DATE);
            } else {
                pstmt.setString(3, student.getBrithday());
            }

            int retValue = pstmt.executeUpdate();
            conn.commit();
            System.out.println(retValue+"건의 사항이 있습니다.");
        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (pstmt != null) { try{ pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
            if (conn != null) { try{ conn.close(); } catch (Exception e) { e.printStackTrace(); }}
        }
    }

    public void insertStudentMulti (Student[] students){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            int retValue = 0;
            String query = "INSERT INTO STUDENT(NO, NAME, BIRTHDAY) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(query);

            for(int i = 0; i < students.length; i++){
                if (students[i].getNo() == null && students[i].getName() == null)
                    break;

                pstmt.setString(1, students[i].getNo());
                pstmt.setString(2, students[i].getName());

                if (students[i].getBrithday() == null){
                    pstmt.setNull(3, Types.DATE);
                } else {
                    pstmt.setString(3, students[i].getBrithday());
                }

                retValue += pstmt.executeUpdate();
                pstmt.clearParameters();
            }

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

    public void insertStudentMultiBatch (Student[] students){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "INSERT INTO STUDENT(NO, NAME, BIRTHDAY) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(query);

            for(int i = 0; i < students.length; i++){
                if (students[i].getNo() == null && students[i].getName() == null)
                    break;

                pstmt.setString(1, students[i].getNo());
                pstmt.setString(2, students[i].getName());

                if (students[i].getBrithday() == null){
                    pstmt.setNull(3, Types.DATE);
                } else {
                    pstmt.setString(3, students[i].getBrithday());
                }

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
