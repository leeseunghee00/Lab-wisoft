package io.wisoft.semiar;

public class Main {
    public static  void main(String[] args){
        /* Student */
/*        StudentSelectService selectStudent = new StudentSelectService();

        // All students
        System.out.println("Search All Students");
        selectStudent.getStudentAll();
        System.out.println();

        // Stunum is 20110101
        System.out.println("Search for students by No 20110101");
        String studentNo = "20110101";

        selectStudent.getStudentByNo(studentNo);
        System.out.println();

        // Stuname is 일지매
        System.out.println("Search for students by Name 일지매");
        String studentName = "일지매";

        selectStudent.getStudentByName(studentName);
        System.out.println();*/

        /* Employee */
        EmployeeSelectService selectEmployee = new EmployeeSelectService();

        // All Employee
        System.out.println("Search All Employee");
        selectEmployee.getEmployeeAll();
        System.out.println();

        // SELECT emp_code
        System.out.println("Select emp_code");
        String empcode = "E001";

        selectEmployee.getEmployeeByCode(empcode);
        System.out.println();

        // SELECT emp_name
        System.out.println("Select emp_name");
        String empname = "김민훈";

        selectEmployee.getEmployeeByName(empname);
        System.out.println();

        // SELECT emp_mgt
        System.out.println("Select emp_mgt");
        String empmgt = "E202";

        selectEmployee.getEmployeeByMgt(empmgt);
        System.out.println();

        // SELECT emp_sal
        System.out.println("Select emp_sal");
        Integer empsal = 5500;

        selectEmployee.getEmployeeBySal(empsal);
        System.out.println();

        // SELECT emp_rcode
        System.out.println("Select emp_rcode");
        String emprcode = "R001";

        selectEmployee.getEmployeeByRcode(emprcode);
        System.out.println();
    }
}
