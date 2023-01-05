package io.wisoft.semiar;

public class Main {
    public static  void main(String[] args){
        // SelectStudent();
        // SelectEmployee();
        // InsertStudent();
        // UpdateStudent();
        // DeleteStudent();
    }

    private static void DeleteStudent() {
        Student student = new Student();
        Student[] students = new Student[10];
        StudentDeleteService deleteStudent = new StudentDeleteService();

        for(int i = 0; i < students.length; i++){
            students[i] = new Student();
        }

        // DELETE AREA .. 이순신 삭제하기
        System.out.println("학번이 20110401인 학생을 목록에서 제거합니다.");

        /* deleteStudentNo 호출*/
        deleteStudent.deleteStudentNo("20110401");
        System.out.println();

        // DELETE AREA
        System.out.println("학번이 20110501인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20110601인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20110701인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20110801인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20110901인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20111001인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20111101인 학생을 목록에서 제거합니다.");
        System.out.println("학번이 20111201인 학생을 목록에서 제거합니다.");

        students[0].setNo("20110501");
        students[1].setNo("20110601");
        students[2].setNo("20110701");
        students[3].setNo("20110801");
        students[4].setNo("20110901");
        students[5].setNo("20111001");
        students[6].setNo("20111101");
        students[7].setNo("20111201");

        /* deleteStudentNoMultiBatch 호출 */
        deleteStudent.deleteStudentNoMultiBatch(students);
        System.out.println();
    }

    private static void UpdateStudent() {
        Student student = new Student();
        Student[] students = new Student[10];
        StudentUpdateService updateStudent = new StudentUpdateService();

        for(int i=0;i<students.length;i++){
            students[i] = new Student();
        }

        // UPDATE AREA
        System.out.println("학번이 20110401인 학생의 생일을 1990-03-21으로 변경합니다.");

        /* updateStudentBirthday 호출 */
        updateStudent.updateStudentBirthday("20110401", "1990-03-21");
        System.out.println();

        // UPDATE AREA
        System.out.println("학번이 20110401인 학생의 생일을 1990-03-25으로 변경합니다.");
        student.setNo("20110401");
        student.setBirthday("1990-03-25");

        /* updateStudentBirthday 호출 */
        updateStudent.updateStudentBirthday(student);
        System.out.println();


        // UPDATE AREA
        System.out.println("학번이 20110501인 학생의 생일을 1990-03-01으로 변경합니다.");
        System.out.println("학번이 20110601인 학생의 생일을 1990-04-01으로 변경합니다.");
        System.out.println("학번이 20110701인 학생의 생일을 1990-05-01으로 변경합니다.");
        System.out.println("학번이 20110801인 학생의 생일을 1990-06-01으로 변경합니다.");
        System.out.println("학번이 20110901인 학생의 생일을 1990-07-01으로 변경합니다.");
        System.out.println("학번이 20111001인 학생의 생일을 1990-08-01으로 변경합니다.");
        System.out.println("학번이 20111101인 학생의 생일을 1990-09-01으로 변경합니다.");
        System.out.println("학번이 20111201인 학생의 생일을 1990-10-01으로 변경합니다.");

        students[0].setNo("20110501");
        students[0].setBirthday("1990-03-01");

        students[1].setNo("20110601");
        students[1].setBirthday("1990-04-01");

        students[2].setNo("20110701");
        students[2].setBirthday("1990-05-01");

        students[3].setNo("20110801");
        students[3].setBirthday("1990-06-01");

        students[4].setNo("20110901");
        students[4].setBirthday("1990-07-01");

        students[5].setNo("20111001");
        students[5].setBirthday("1990-08-01");

        students[6].setNo("20111101");
        students[6].setBirthday("1990-09-01");

        students[7].setNo("20111201");
        students[7].setBirthday("1990-10-01");

        /* updateStudentBirthdayMultiBatch 호출 */
        updateStudent.updateStudentBirthdayMultiBatch(students);
        System.out.println();
    }

    private static void InsertStudent() {
        Student student = new Student();
        Student[] students = new Student[8];

        for(int i = 0; i < students.length; i++){
            students[i] = new Student();
        }

        StudentInsertService insertStudent = new StudentInsertService();

        // INSERT AREA
        System.out.println("학번이 20110401이고, 이름이 이순신인 학생을 추가합니다.");
        student.setNo("20110401");
        student.setName("이순신");

        /* insertStudent 호출 */
        insertStudent.insertStudent(student);
        System.out.println();

        // INSERT AREA
        System.out.println("학번이 20110501이고, 이름이 이율곡인 학생을 추가합니다.");
        System.out.println("학번이 20110601이고, 이름이 이수일인 학생을 추가합니다.");
        System.out.println("학번이 20110701이고, 이름이 심순애인 학생을 추가합니다.");
        System.out.println("학번이 20110801이고, 이름이 임꺽정인 학생을 추가합니다.");

        students[0].setNo("20110501");
        students[0].setName("이율곡");

        students[1].setNo("20110601");
        students[1].setName("이수일");

        students[2].setNo("20110701");
        students[2].setName("심순애");

        students[3].setNo("20110801");
        students[3].setName("임꺽정");

        /* insertStudentMulti 호출 */
        insertStudent.insertStudentMulti(students);
        System.out.println();

        // INSERT AREA
        System.out.println("학번이 20110901이고, 이름이 이상훈인 학생을 추가합니다.");
        System.out.println("학번이 20111001이고, 이름이 강동희인 학생을 추가합니다.");
        System.out.println("학번이 20111101이고, 이름이 김호성인 학생을 추가합니다.");
        System.out.println("학번이 20111201이고, 이름이 김정준인 학생을 추가합니다.");

        students[0].setNo("20110901");
        students[0].setName("이상훈");

        students[1].setNo("20111001");
        students[1].setName("강동희");

        students[2].setNo("20111101");
        students[2].setName("김호성");

        students[3].setNo("20111201");
        students[3].setName("김정준");

        /* insertStudentMultiBatch 호출 */
        insertStudent.insertStudentMultiBatch(students);
        System.out.println();
    }

    private static void SelectEmployee() {
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

    private static void SelectStudent() {
        StudentSelectService selectStudent = new StudentSelectService();

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
        System.out.println();
    }
}
