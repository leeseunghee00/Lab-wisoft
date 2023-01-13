package io.wisoft.semiar.training;

import io.wisoft.semiar.PostgreSqlAccess;

import java.sql.*;

public class TrainSelectService {
    public static void solvQue1 () {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM DEPARTMENT";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while(rs.next()){
                System.out.print("[부서코드] " + rs.getString("dept_code") + " || ");
                System.out.print("[이름] " + rs.getString("dept_name") + " || ");
                System.out.println("[위치] " + rs.getString("dept_loc") + " ");
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

    public void solvQue2() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT EMP_CODE, EMP_NAME, EMP_MGT, EMP_SAL FROM EMPLOYEE";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[연예관계자 코드] " + rs.getString("emp_code") + " || ");
                System.out.print("[이름] " + rs.getString("emp_name") + " || ");
                System.out.print("[관리자] " + rs.getString("emp_mgt") + " || ");
                System.out.println("[급여] " + rs.getInt("emp_sal") + " ");
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

    public void solvQue3 (String drmPrd) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT DRM_CODE, DRM_NAME FROM DRAMA WHERE DRM_PRD = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, drmPrd);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[드라마 코드] " + rs.getString("drm_code") + " || ");
                System.out.println("[드라마 이름] " + rs.getString("drm_name") + " ");
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

    public void solvQue4 (String drmBrd1, String drmBrd2) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM DRAMA WHERE DRM_BRD = ? OR DRM_BRD = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, drmBrd1);
            pstmt.setString(2, drmBrd2);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[드라마 코드] " + rs.getString("drm_code") + " || ");
                System.out.print("[드라마 이름] " + rs.getString("drm_name") + " || ");
                System.out.print("[제작사] " + rs.getString("drm_prd") + " || ");
                System.out.print("[방영사] " + rs.getString("drm_brd") + " || ");
                System.out.println("[방영년월] " + rs.getDate("drm_opdate") + " ");
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

    public void solvQue5 () {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT DISTINCT DRM_PRD FROM DRAMA";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("[제작사] " + rs.getString(1));
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

    public void solvQue6 () {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT SUM(EMP_SAL), AVG(EMP_SAL) FROM EMPLOYEE";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[총합] " + rs.getInt(1) + " || ");
                System.out.println("[평균] " + rs.getInt(2) + " ");
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

    public void solvQue7 () {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT DRM_NAME FROM DRAMA WHERE DRM_OPDATE IS NULL";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("[드라마 이름] " + rs.getString("drm_name"));
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

    public void solvQue8 (){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT A.EMP_NAME, B.EMP_NAME " +
                    "FROM EMPLOYEE A, EMPLOYEE B " +
                    "WHERE A.EMP_MGT = B.EMP_CODE";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while(rs.next()){
                System.out.print("[연예관계자 이름] " + rs.getString(1) + " || ");
                System.out.println("[직속상사 이름] " + rs.getString(2) + " ");
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

    public void solvQue9 (){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT EMP_NAME, EMP_SAL " +
                    "FROM EMPLOYEE " +
                    "ORDER BY EMP_SAL DESC, EMP_NAME ASC";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while(rs.next()){
                System.out.print("[이름] " + rs.getString("emp_name") + " || ");
                System.out.println("[급여] " + rs.getString("emp_sal") + " ");
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

    public void solvQue10 (){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT ER.EMP_RNAME, AVG(E.EMP_SAL), MIN(E.EMP_SAL), MAX(E.EMP_SAL) " +
                    "FROM EMPLOYEE E, EMP_ROLE ER " +
                    "WHERE E.EMP_RCODE = ER.EMP_RCODE " +
                    "GROUP BY ER.EMP_RNAME " +
                    "HAVING AVG(E.EMP_SAL) >= 5000";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while(rs.next()){
                System.out.print("[관계자 직급] " + rs.getString(1) + " || ");
                System.out.print("[평균 급여액] " + rs.getString(2) + " || ");
                System.out.print("[최소 급여액] " + rs.getString(3) + " || ");
                System.out.println("[최대 급여액] " + rs.getString(4) + " ");
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

    public void solvQue11 (){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT EMP_NAME, EMP_SAL " +
                    "FROM EMPLOYEE " +
                    "WHERE EMP_SAL > (SELECT AVG(EMP_SAL) FROM EMPLOYEE)";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while(rs.next()){
                System.out.print("[이름] " + rs.getString("emp_name") + " || ");
                System.out.println("[급여] " + rs.getString("emp_sal") + " ");
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

    public void solvQue15_1 (String deptName1, String deptName2) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT E.emp_name " +
                    "FROM employee E, rel_department RD, department D " +
                    "WHERE E.emp_code = RD.rd_emp_code " +
                    "AND RD.rd_dept_code = D.dept_code " +
                    "AND D.dept_name = ? " +
                    "INTERSECT " +
                    "SELECT E.emp_name " +
                    "FROM employee E, rel_department RD, department D " +
                    "WHERE E.emp_code = RD.rd_emp_code " +
                    "AND RD.rd_dept_code = D.dept_code " +
                    "AND D.dept_name = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, deptName1);
            pstmt.setString(2, deptName2);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("[이름] " + rs.getString(1));
            }

        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (pstmt != null) { try{ pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
            if (conn != null) { try{ conn.close(); } catch (Exception e) { e.printStackTrace(); }}
        }
    }

    public void solvQue16 (String empRname) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgreSqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT E.EMP_NAME " +
                    "FROM EMPLOYEE E " +
                    "WHERE NOT EXISTS " +
                    " ( SELECT * FROM EMP_ROLE R " +
                    "\t WHERE E.EMP_RCODE = R.EMP_RCODE " +
                    "\t\t AND R.EMP_RNAME = ?);";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, empRname);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("[이름] " + rs.getString(1));
            }

        } catch (SQLException sqex) {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        } finally {
            if (pstmt != null) { try{ pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
            if (conn != null) { try{ conn.close(); } catch (Exception e) { e.printStackTrace(); }}
        }
    }
}
